/*******************************************************************************
 * Copyright (c) 2017 Red Hat Inc
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Jens Reimann - initial API and implementation
 *******************************************************************************/
package de.dentrassi.varlink.maven;

import static java.nio.file.Files.walkFileTree;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Component;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.sonatype.plexus.build.incremental.BuildContext;

import de.dentrassi.varlink.generator.Generator;
import de.dentrassi.varlink.generator.JdtGenerator;

/**
 * Generate Java bindings for a Varlink file
 */
@Mojo(defaultPhase = LifecyclePhase.GENERATE_SOURCES, name = "generate", requiresProject = true)
public class GenerateMojo extends AbstractMojo {

    /**
     * Allows to skip the generation
     */
    @Parameter(property = "varlink.skip", required = false, defaultValue = "false")
    private boolean skip;

    public void setSkip(final boolean skip) {
        this.skip = skip;
    }

    public boolean isSkip() {
        return this.skip;
    }

    /**
     * The character set to use for the generated resources
     */
    @Parameter(property = "varlink.generator.charset", required = true, defaultValue = "${project.build.sourceEncoding}")
    private String characterSet;

    public void setCharacterSet(final String characterSet) {
        this.characterSet = characterSet;
    }

    public String getCharacterSet() {
        return this.characterSet;
    }

    /**
     * The path to generate the sources to
     */
    @Parameter(required = true, property = "varlink.targetPath", defaultValue = "${project.build.directory}/generated-sources/varlink")
    private File targetPath;

    public void setTargetPath(final File targetPath) {
        this.targetPath = targetPath;
    }

    public File getTargetPath() {
        return this.targetPath;
    }

    /**
     * The path to load the sources from
     */
    @Parameter(required = true, property = "varlink.sourcePath", defaultValue = "${basedir}/src/main/varlink")
    private File sourcePath;

    public void setSourcePath(final File sourcePath) {
        this.sourcePath = sourcePath;
    }

    public File getSourcePath() {
        return this.sourcePath;
    }

    @Parameter(property = "project", readonly = true, required = true)
    protected MavenProject project;

    public void setProject(final MavenProject project) {
        this.project = project;
    }

    @Component
    private BuildContext buildContext;

    public void setBuildContext(final BuildContext buildContext) {
        this.buildContext = buildContext;
    }

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {

        try {

            // load interfaces

            final Loader loader = new Loader();

            final Map<String, List<Diagnostic>> errors = new HashMap<>();

            walkFileTree(
                    this.sourcePath.toPath(),
                    new SimpleFileVisitor<Path>() {
                        @Override
                        public FileVisitResult visitFile(final Path file, final BasicFileAttributes attrs)
                                throws IOException {

                            final List<Diagnostic> localErrors = loader.loadFrom(file);
                            if (!localErrors.isEmpty()) {
                                errors.put(file.toString(), localErrors);
                            }

                            return FileVisitResult.CONTINUE;
                        }
                    });

            // process errors

            if (!errors.isEmpty()) {
                for (final Map.Entry<String, List<Diagnostic>> entry : errors.entrySet()) {
                    for (final Diagnostic diag : entry.getValue()) {
                        String location = diag.getLocation();
                        if (location == null) {
                            location = entry.getKey();
                        }
                        getLog().error(String.format("%s:%s:%s: %s", location, diag.getLine(),
                                diag.getColumn(), diag.getMessage()));
                    }
                }
                throw new MojoFailureException("Failed to validate models. See log for more information.");
            }

            // setup generator

            final Generator.Options options = new Generator.Options();

            if (this.characterSet != null) {
                options.setCharacterSet(Charset.forName(this.characterSet));
            }
            if (this.targetPath != null) {
                options.setTargetPath(this.targetPath.toPath());
            }

            final Generator generator = new JdtGenerator(options);

            // generate

            generator.generateAll(loader);

            // add sources

            this.project.addCompileSourceRoot(this.targetPath.getAbsolutePath());
            this.buildContext.refresh(this.targetPath.getAbsoluteFile());

        } catch (final Exception e) {
            throw new MojoExecutionException("Failed to generate", e);
        }

    }
}
