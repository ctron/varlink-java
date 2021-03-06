/**
 * ******************************************************************************
 * Copyright (c) 2018 Red Hat Inc
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  *
 * Contributors:
 *     Jens Reimann - initial API and implementation
 *  ******************************************************************************
 */
package de.dentrassi.varlink.idl.varlinkIdl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.dentrassi.varlink.idl.varlinkIdl.VarlinkIdlFactory
 * @model kind="package"
 * @generated
 */
public interface VarlinkIdlPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "varlinkIdl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.dentrassi.de/varlink/idl/VarlinkIdl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "varlinkIdl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  VarlinkIdlPackage eINSTANCE = de.dentrassi.varlink.idl.varlinkIdl.impl.VarlinkIdlPackageImpl.init();

  /**
   * The meta object id for the '{@link de.dentrassi.varlink.idl.varlinkIdl.impl.InterfaceImpl <em>Interface</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.dentrassi.varlink.idl.varlinkIdl.impl.InterfaceImpl
   * @see de.dentrassi.varlink.idl.varlinkIdl.impl.VarlinkIdlPackageImpl#getInterface()
   * @generated
   */
  int INTERFACE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__NAME = 0;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__MEMBERS = 1;

  /**
   * The number of structural features of the '<em>Interface</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.dentrassi.varlink.idl.varlinkIdl.impl.MemberImpl <em>Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.dentrassi.varlink.idl.varlinkIdl.impl.MemberImpl
   * @see de.dentrassi.varlink.idl.varlinkIdl.impl.VarlinkIdlPackageImpl#getMember()
   * @generated
   */
  int MEMBER = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER__NAME = 0;

  /**
   * The number of structural features of the '<em>Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.dentrassi.varlink.idl.varlinkIdl.impl.TypeAliasImpl <em>Type Alias</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.dentrassi.varlink.idl.varlinkIdl.impl.TypeAliasImpl
   * @see de.dentrassi.varlink.idl.varlinkIdl.impl.VarlinkIdlPackageImpl#getTypeAlias()
   * @generated
   */
  int TYPE_ALIAS = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ALIAS__NAME = MEMBER__NAME;

  /**
   * The feature id for the '<em><b>Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ALIAS__DEFINITION = MEMBER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Type Alias</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ALIAS_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.dentrassi.varlink.idl.varlinkIdl.impl.TypeAliasDefinitionImpl <em>Type Alias Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.dentrassi.varlink.idl.varlinkIdl.impl.TypeAliasDefinitionImpl
   * @see de.dentrassi.varlink.idl.varlinkIdl.impl.VarlinkIdlPackageImpl#getTypeAliasDefinition()
   * @generated
   */
  int TYPE_ALIAS_DEFINITION = 3;

  /**
   * The number of structural features of the '<em>Type Alias Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ALIAS_DEFINITION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.dentrassi.varlink.idl.varlinkIdl.impl.EnumImpl <em>Enum</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.dentrassi.varlink.idl.varlinkIdl.impl.EnumImpl
   * @see de.dentrassi.varlink.idl.varlinkIdl.impl.VarlinkIdlPackageImpl#getEnum()
   * @generated
   */
  int ENUM = 4;

  /**
   * The feature id for the '<em><b>Fields</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__FIELDS = TYPE_ALIAS_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Enum</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_FEATURE_COUNT = TYPE_ALIAS_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.dentrassi.varlink.idl.varlinkIdl.impl.ObjectImpl <em>Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.dentrassi.varlink.idl.varlinkIdl.impl.ObjectImpl
   * @see de.dentrassi.varlink.idl.varlinkIdl.impl.VarlinkIdlPackageImpl#getObject()
   * @generated
   */
  int OBJECT = 5;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__FIELDS = TYPE_ALIAS_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_FEATURE_COUNT = TYPE_ALIAS_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.dentrassi.varlink.idl.varlinkIdl.impl.FieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.dentrassi.varlink.idl.varlinkIdl.impl.FieldImpl
   * @see de.dentrassi.varlink.idl.varlinkIdl.impl.VarlinkIdlPackageImpl#getField()
   * @generated
   */
  int FIELD = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__TYPE = 1;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.dentrassi.varlink.idl.varlinkIdl.impl.ElementTypeImpl <em>Element Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.dentrassi.varlink.idl.varlinkIdl.impl.ElementTypeImpl
   * @see de.dentrassi.varlink.idl.varlinkIdl.impl.VarlinkIdlPackageImpl#getElementType()
   * @generated
   */
  int ELEMENT_TYPE = 7;

  /**
   * The number of structural features of the '<em>Element Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.dentrassi.varlink.idl.varlinkIdl.impl.ArrayImpl <em>Array</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.dentrassi.varlink.idl.varlinkIdl.impl.ArrayImpl
   * @see de.dentrassi.varlink.idl.varlinkIdl.impl.VarlinkIdlPackageImpl#getArray()
   * @generated
   */
  int ARRAY = 8;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY__TYPE = ELEMENT_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Array</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_FEATURE_COUNT = ELEMENT_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.dentrassi.varlink.idl.varlinkIdl.impl.DictionaryImpl <em>Dictionary</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.dentrassi.varlink.idl.varlinkIdl.impl.DictionaryImpl
   * @see de.dentrassi.varlink.idl.varlinkIdl.impl.VarlinkIdlPackageImpl#getDictionary()
   * @generated
   */
  int DICTIONARY = 9;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICTIONARY__TYPE = ELEMENT_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Dictionary</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICTIONARY_FEATURE_COUNT = ELEMENT_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.dentrassi.varlink.idl.varlinkIdl.impl.OptionalImpl <em>Optional</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.dentrassi.varlink.idl.varlinkIdl.impl.OptionalImpl
   * @see de.dentrassi.varlink.idl.varlinkIdl.impl.VarlinkIdlPackageImpl#getOptional()
   * @generated
   */
  int OPTIONAL = 10;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL__TYPE = ELEMENT_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Optional</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_FEATURE_COUNT = ELEMENT_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.dentrassi.varlink.idl.varlinkIdl.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.dentrassi.varlink.idl.varlinkIdl.impl.TypeReferenceImpl
   * @see de.dentrassi.varlink.idl.varlinkIdl.impl.VarlinkIdlPackageImpl#getTypeReference()
   * @generated
   */
  int TYPE_REFERENCE = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REFERENCE__NAME = ELEMENT_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Type Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REFERENCE_FEATURE_COUNT = ELEMENT_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.dentrassi.varlink.idl.varlinkIdl.impl.BasicTypeImpl <em>Basic Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.dentrassi.varlink.idl.varlinkIdl.impl.BasicTypeImpl
   * @see de.dentrassi.varlink.idl.varlinkIdl.impl.VarlinkIdlPackageImpl#getBasicType()
   * @generated
   */
  int BASIC_TYPE = 12;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE__TYPE = ELEMENT_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Basic Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE_FEATURE_COUNT = ELEMENT_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.dentrassi.varlink.idl.varlinkIdl.impl.MethodImpl <em>Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.dentrassi.varlink.idl.varlinkIdl.impl.MethodImpl
   * @see de.dentrassi.varlink.idl.varlinkIdl.impl.VarlinkIdlPackageImpl#getMethod()
   * @generated
   */
  int METHOD = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__NAME = MEMBER__NAME;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__ARGUMENTS = MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Result</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__RESULT = MEMBER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.dentrassi.varlink.idl.varlinkIdl.impl.ArgumentsImpl <em>Arguments</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.dentrassi.varlink.idl.varlinkIdl.impl.ArgumentsImpl
   * @see de.dentrassi.varlink.idl.varlinkIdl.impl.VarlinkIdlPackageImpl#getArguments()
   * @generated
   */
  int ARGUMENTS = 14;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENTS__ARGUMENTS = 0;

  /**
   * The number of structural features of the '<em>Arguments</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENTS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.dentrassi.varlink.idl.varlinkIdl.impl.ResultImpl <em>Result</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.dentrassi.varlink.idl.varlinkIdl.impl.ResultImpl
   * @see de.dentrassi.varlink.idl.varlinkIdl.impl.VarlinkIdlPackageImpl#getResult()
   * @generated
   */
  int RESULT = 15;

  /**
   * The feature id for the '<em><b>Result</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT__RESULT = 0;

  /**
   * The number of structural features of the '<em>Result</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.dentrassi.varlink.idl.varlinkIdl.impl.ErrorImpl <em>Error</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.dentrassi.varlink.idl.varlinkIdl.impl.ErrorImpl
   * @see de.dentrassi.varlink.idl.varlinkIdl.impl.VarlinkIdlPackageImpl#getError()
   * @generated
   */
  int ERROR = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR__NAME = MEMBER__NAME;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR__PROPERTIES = MEMBER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Error</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link de.dentrassi.varlink.idl.varlinkIdl.Interface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface</em>'.
   * @see de.dentrassi.varlink.idl.varlinkIdl.Interface
   * @generated
   */
  EClass getInterface();

  /**
   * Returns the meta object for the attribute '{@link de.dentrassi.varlink.idl.varlinkIdl.Interface#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.dentrassi.varlink.idl.varlinkIdl.Interface#getName()
   * @see #getInterface()
   * @generated
   */
  EAttribute getInterface_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.dentrassi.varlink.idl.varlinkIdl.Interface#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see de.dentrassi.varlink.idl.varlinkIdl.Interface#getMembers()
   * @see #getInterface()
   * @generated
   */
  EReference getInterface_Members();

  /**
   * Returns the meta object for class '{@link de.dentrassi.varlink.idl.varlinkIdl.Member <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Member</em>'.
   * @see de.dentrassi.varlink.idl.varlinkIdl.Member
   * @generated
   */
  EClass getMember();

  /**
   * Returns the meta object for the attribute '{@link de.dentrassi.varlink.idl.varlinkIdl.Member#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.dentrassi.varlink.idl.varlinkIdl.Member#getName()
   * @see #getMember()
   * @generated
   */
  EAttribute getMember_Name();

  /**
   * Returns the meta object for class '{@link de.dentrassi.varlink.idl.varlinkIdl.TypeAlias <em>Type Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Alias</em>'.
   * @see de.dentrassi.varlink.idl.varlinkIdl.TypeAlias
   * @generated
   */
  EClass getTypeAlias();

  /**
   * Returns the meta object for the containment reference '{@link de.dentrassi.varlink.idl.varlinkIdl.TypeAlias#getDefinition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Definition</em>'.
   * @see de.dentrassi.varlink.idl.varlinkIdl.TypeAlias#getDefinition()
   * @see #getTypeAlias()
   * @generated
   */
  EReference getTypeAlias_Definition();

  /**
   * Returns the meta object for class '{@link de.dentrassi.varlink.idl.varlinkIdl.TypeAliasDefinition <em>Type Alias Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Alias Definition</em>'.
   * @see de.dentrassi.varlink.idl.varlinkIdl.TypeAliasDefinition
   * @generated
   */
  EClass getTypeAliasDefinition();

  /**
   * Returns the meta object for class '{@link de.dentrassi.varlink.idl.varlinkIdl.Enum <em>Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum</em>'.
   * @see de.dentrassi.varlink.idl.varlinkIdl.Enum
   * @generated
   */
  EClass getEnum();

  /**
   * Returns the meta object for the attribute list '{@link de.dentrassi.varlink.idl.varlinkIdl.Enum#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Fields</em>'.
   * @see de.dentrassi.varlink.idl.varlinkIdl.Enum#getFields()
   * @see #getEnum()
   * @generated
   */
  EAttribute getEnum_Fields();

  /**
   * Returns the meta object for class '{@link de.dentrassi.varlink.idl.varlinkIdl.Object <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object</em>'.
   * @see de.dentrassi.varlink.idl.varlinkIdl.Object
   * @generated
   */
  EClass getObject();

  /**
   * Returns the meta object for the containment reference list '{@link de.dentrassi.varlink.idl.varlinkIdl.Object#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see de.dentrassi.varlink.idl.varlinkIdl.Object#getFields()
   * @see #getObject()
   * @generated
   */
  EReference getObject_Fields();

  /**
   * Returns the meta object for class '{@link de.dentrassi.varlink.idl.varlinkIdl.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field</em>'.
   * @see de.dentrassi.varlink.idl.varlinkIdl.Field
   * @generated
   */
  EClass getField();

  /**
   * Returns the meta object for the attribute '{@link de.dentrassi.varlink.idl.varlinkIdl.Field#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.dentrassi.varlink.idl.varlinkIdl.Field#getName()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Name();

  /**
   * Returns the meta object for the containment reference '{@link de.dentrassi.varlink.idl.varlinkIdl.Field#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.dentrassi.varlink.idl.varlinkIdl.Field#getType()
   * @see #getField()
   * @generated
   */
  EReference getField_Type();

  /**
   * Returns the meta object for class '{@link de.dentrassi.varlink.idl.varlinkIdl.ElementType <em>Element Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Type</em>'.
   * @see de.dentrassi.varlink.idl.varlinkIdl.ElementType
   * @generated
   */
  EClass getElementType();

  /**
   * Returns the meta object for class '{@link de.dentrassi.varlink.idl.varlinkIdl.Array <em>Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array</em>'.
   * @see de.dentrassi.varlink.idl.varlinkIdl.Array
   * @generated
   */
  EClass getArray();

  /**
   * Returns the meta object for the containment reference '{@link de.dentrassi.varlink.idl.varlinkIdl.Array#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.dentrassi.varlink.idl.varlinkIdl.Array#getType()
   * @see #getArray()
   * @generated
   */
  EReference getArray_Type();

  /**
   * Returns the meta object for class '{@link de.dentrassi.varlink.idl.varlinkIdl.Dictionary <em>Dictionary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dictionary</em>'.
   * @see de.dentrassi.varlink.idl.varlinkIdl.Dictionary
   * @generated
   */
  EClass getDictionary();

  /**
   * Returns the meta object for the containment reference '{@link de.dentrassi.varlink.idl.varlinkIdl.Dictionary#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.dentrassi.varlink.idl.varlinkIdl.Dictionary#getType()
   * @see #getDictionary()
   * @generated
   */
  EReference getDictionary_Type();

  /**
   * Returns the meta object for class '{@link de.dentrassi.varlink.idl.varlinkIdl.Optional <em>Optional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Optional</em>'.
   * @see de.dentrassi.varlink.idl.varlinkIdl.Optional
   * @generated
   */
  EClass getOptional();

  /**
   * Returns the meta object for the containment reference '{@link de.dentrassi.varlink.idl.varlinkIdl.Optional#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.dentrassi.varlink.idl.varlinkIdl.Optional#getType()
   * @see #getOptional()
   * @generated
   */
  EReference getOptional_Type();

  /**
   * Returns the meta object for class '{@link de.dentrassi.varlink.idl.varlinkIdl.TypeReference <em>Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Reference</em>'.
   * @see de.dentrassi.varlink.idl.varlinkIdl.TypeReference
   * @generated
   */
  EClass getTypeReference();

  /**
   * Returns the meta object for the reference '{@link de.dentrassi.varlink.idl.varlinkIdl.TypeReference#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see de.dentrassi.varlink.idl.varlinkIdl.TypeReference#getName()
   * @see #getTypeReference()
   * @generated
   */
  EReference getTypeReference_Name();

  /**
   * Returns the meta object for class '{@link de.dentrassi.varlink.idl.varlinkIdl.BasicType <em>Basic Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Basic Type</em>'.
   * @see de.dentrassi.varlink.idl.varlinkIdl.BasicType
   * @generated
   */
  EClass getBasicType();

  /**
   * Returns the meta object for the attribute '{@link de.dentrassi.varlink.idl.varlinkIdl.BasicType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.dentrassi.varlink.idl.varlinkIdl.BasicType#getType()
   * @see #getBasicType()
   * @generated
   */
  EAttribute getBasicType_Type();

  /**
   * Returns the meta object for class '{@link de.dentrassi.varlink.idl.varlinkIdl.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method</em>'.
   * @see de.dentrassi.varlink.idl.varlinkIdl.Method
   * @generated
   */
  EClass getMethod();

  /**
   * Returns the meta object for the containment reference '{@link de.dentrassi.varlink.idl.varlinkIdl.Method#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arguments</em>'.
   * @see de.dentrassi.varlink.idl.varlinkIdl.Method#getArguments()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Arguments();

  /**
   * Returns the meta object for the containment reference '{@link de.dentrassi.varlink.idl.varlinkIdl.Method#getResult <em>Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Result</em>'.
   * @see de.dentrassi.varlink.idl.varlinkIdl.Method#getResult()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Result();

  /**
   * Returns the meta object for class '{@link de.dentrassi.varlink.idl.varlinkIdl.Arguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Arguments</em>'.
   * @see de.dentrassi.varlink.idl.varlinkIdl.Arguments
   * @generated
   */
  EClass getArguments();

  /**
   * Returns the meta object for the containment reference '{@link de.dentrassi.varlink.idl.varlinkIdl.Arguments#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arguments</em>'.
   * @see de.dentrassi.varlink.idl.varlinkIdl.Arguments#getArguments()
   * @see #getArguments()
   * @generated
   */
  EReference getArguments_Arguments();

  /**
   * Returns the meta object for class '{@link de.dentrassi.varlink.idl.varlinkIdl.Result <em>Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Result</em>'.
   * @see de.dentrassi.varlink.idl.varlinkIdl.Result
   * @generated
   */
  EClass getResult();

  /**
   * Returns the meta object for the containment reference '{@link de.dentrassi.varlink.idl.varlinkIdl.Result#getResult <em>Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Result</em>'.
   * @see de.dentrassi.varlink.idl.varlinkIdl.Result#getResult()
   * @see #getResult()
   * @generated
   */
  EReference getResult_Result();

  /**
   * Returns the meta object for class '{@link de.dentrassi.varlink.idl.varlinkIdl.Error <em>Error</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Error</em>'.
   * @see de.dentrassi.varlink.idl.varlinkIdl.Error
   * @generated
   */
  EClass getError();

  /**
   * Returns the meta object for the containment reference '{@link de.dentrassi.varlink.idl.varlinkIdl.Error#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Properties</em>'.
   * @see de.dentrassi.varlink.idl.varlinkIdl.Error#getProperties()
   * @see #getError()
   * @generated
   */
  EReference getError_Properties();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  VarlinkIdlFactory getVarlinkIdlFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.dentrassi.varlink.idl.varlinkIdl.impl.InterfaceImpl <em>Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.dentrassi.varlink.idl.varlinkIdl.impl.InterfaceImpl
     * @see de.dentrassi.varlink.idl.varlinkIdl.impl.VarlinkIdlPackageImpl#getInterface()
     * @generated
     */
    EClass INTERFACE = eINSTANCE.getInterface();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE__NAME = eINSTANCE.getInterface_Name();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE__MEMBERS = eINSTANCE.getInterface_Members();

    /**
     * The meta object literal for the '{@link de.dentrassi.varlink.idl.varlinkIdl.impl.MemberImpl <em>Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.dentrassi.varlink.idl.varlinkIdl.impl.MemberImpl
     * @see de.dentrassi.varlink.idl.varlinkIdl.impl.VarlinkIdlPackageImpl#getMember()
     * @generated
     */
    EClass MEMBER = eINSTANCE.getMember();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEMBER__NAME = eINSTANCE.getMember_Name();

    /**
     * The meta object literal for the '{@link de.dentrassi.varlink.idl.varlinkIdl.impl.TypeAliasImpl <em>Type Alias</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.dentrassi.varlink.idl.varlinkIdl.impl.TypeAliasImpl
     * @see de.dentrassi.varlink.idl.varlinkIdl.impl.VarlinkIdlPackageImpl#getTypeAlias()
     * @generated
     */
    EClass TYPE_ALIAS = eINSTANCE.getTypeAlias();

    /**
     * The meta object literal for the '<em><b>Definition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_ALIAS__DEFINITION = eINSTANCE.getTypeAlias_Definition();

    /**
     * The meta object literal for the '{@link de.dentrassi.varlink.idl.varlinkIdl.impl.TypeAliasDefinitionImpl <em>Type Alias Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.dentrassi.varlink.idl.varlinkIdl.impl.TypeAliasDefinitionImpl
     * @see de.dentrassi.varlink.idl.varlinkIdl.impl.VarlinkIdlPackageImpl#getTypeAliasDefinition()
     * @generated
     */
    EClass TYPE_ALIAS_DEFINITION = eINSTANCE.getTypeAliasDefinition();

    /**
     * The meta object literal for the '{@link de.dentrassi.varlink.idl.varlinkIdl.impl.EnumImpl <em>Enum</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.dentrassi.varlink.idl.varlinkIdl.impl.EnumImpl
     * @see de.dentrassi.varlink.idl.varlinkIdl.impl.VarlinkIdlPackageImpl#getEnum()
     * @generated
     */
    EClass ENUM = eINSTANCE.getEnum();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM__FIELDS = eINSTANCE.getEnum_Fields();

    /**
     * The meta object literal for the '{@link de.dentrassi.varlink.idl.varlinkIdl.impl.ObjectImpl <em>Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.dentrassi.varlink.idl.varlinkIdl.impl.ObjectImpl
     * @see de.dentrassi.varlink.idl.varlinkIdl.impl.VarlinkIdlPackageImpl#getObject()
     * @generated
     */
    EClass OBJECT = eINSTANCE.getObject();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT__FIELDS = eINSTANCE.getObject_Fields();

    /**
     * The meta object literal for the '{@link de.dentrassi.varlink.idl.varlinkIdl.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.dentrassi.varlink.idl.varlinkIdl.impl.FieldImpl
     * @see de.dentrassi.varlink.idl.varlinkIdl.impl.VarlinkIdlPackageImpl#getField()
     * @generated
     */
    EClass FIELD = eINSTANCE.getField();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__NAME = eINSTANCE.getField_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__TYPE = eINSTANCE.getField_Type();

    /**
     * The meta object literal for the '{@link de.dentrassi.varlink.idl.varlinkIdl.impl.ElementTypeImpl <em>Element Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.dentrassi.varlink.idl.varlinkIdl.impl.ElementTypeImpl
     * @see de.dentrassi.varlink.idl.varlinkIdl.impl.VarlinkIdlPackageImpl#getElementType()
     * @generated
     */
    EClass ELEMENT_TYPE = eINSTANCE.getElementType();

    /**
     * The meta object literal for the '{@link de.dentrassi.varlink.idl.varlinkIdl.impl.ArrayImpl <em>Array</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.dentrassi.varlink.idl.varlinkIdl.impl.ArrayImpl
     * @see de.dentrassi.varlink.idl.varlinkIdl.impl.VarlinkIdlPackageImpl#getArray()
     * @generated
     */
    EClass ARRAY = eINSTANCE.getArray();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY__TYPE = eINSTANCE.getArray_Type();

    /**
     * The meta object literal for the '{@link de.dentrassi.varlink.idl.varlinkIdl.impl.DictionaryImpl <em>Dictionary</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.dentrassi.varlink.idl.varlinkIdl.impl.DictionaryImpl
     * @see de.dentrassi.varlink.idl.varlinkIdl.impl.VarlinkIdlPackageImpl#getDictionary()
     * @generated
     */
    EClass DICTIONARY = eINSTANCE.getDictionary();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DICTIONARY__TYPE = eINSTANCE.getDictionary_Type();

    /**
     * The meta object literal for the '{@link de.dentrassi.varlink.idl.varlinkIdl.impl.OptionalImpl <em>Optional</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.dentrassi.varlink.idl.varlinkIdl.impl.OptionalImpl
     * @see de.dentrassi.varlink.idl.varlinkIdl.impl.VarlinkIdlPackageImpl#getOptional()
     * @generated
     */
    EClass OPTIONAL = eINSTANCE.getOptional();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPTIONAL__TYPE = eINSTANCE.getOptional_Type();

    /**
     * The meta object literal for the '{@link de.dentrassi.varlink.idl.varlinkIdl.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.dentrassi.varlink.idl.varlinkIdl.impl.TypeReferenceImpl
     * @see de.dentrassi.varlink.idl.varlinkIdl.impl.VarlinkIdlPackageImpl#getTypeReference()
     * @generated
     */
    EClass TYPE_REFERENCE = eINSTANCE.getTypeReference();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_REFERENCE__NAME = eINSTANCE.getTypeReference_Name();

    /**
     * The meta object literal for the '{@link de.dentrassi.varlink.idl.varlinkIdl.impl.BasicTypeImpl <em>Basic Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.dentrassi.varlink.idl.varlinkIdl.impl.BasicTypeImpl
     * @see de.dentrassi.varlink.idl.varlinkIdl.impl.VarlinkIdlPackageImpl#getBasicType()
     * @generated
     */
    EClass BASIC_TYPE = eINSTANCE.getBasicType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BASIC_TYPE__TYPE = eINSTANCE.getBasicType_Type();

    /**
     * The meta object literal for the '{@link de.dentrassi.varlink.idl.varlinkIdl.impl.MethodImpl <em>Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.dentrassi.varlink.idl.varlinkIdl.impl.MethodImpl
     * @see de.dentrassi.varlink.idl.varlinkIdl.impl.VarlinkIdlPackageImpl#getMethod()
     * @generated
     */
    EClass METHOD = eINSTANCE.getMethod();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__ARGUMENTS = eINSTANCE.getMethod_Arguments();

    /**
     * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__RESULT = eINSTANCE.getMethod_Result();

    /**
     * The meta object literal for the '{@link de.dentrassi.varlink.idl.varlinkIdl.impl.ArgumentsImpl <em>Arguments</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.dentrassi.varlink.idl.varlinkIdl.impl.ArgumentsImpl
     * @see de.dentrassi.varlink.idl.varlinkIdl.impl.VarlinkIdlPackageImpl#getArguments()
     * @generated
     */
    EClass ARGUMENTS = eINSTANCE.getArguments();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENTS__ARGUMENTS = eINSTANCE.getArguments_Arguments();

    /**
     * The meta object literal for the '{@link de.dentrassi.varlink.idl.varlinkIdl.impl.ResultImpl <em>Result</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.dentrassi.varlink.idl.varlinkIdl.impl.ResultImpl
     * @see de.dentrassi.varlink.idl.varlinkIdl.impl.VarlinkIdlPackageImpl#getResult()
     * @generated
     */
    EClass RESULT = eINSTANCE.getResult();

    /**
     * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESULT__RESULT = eINSTANCE.getResult_Result();

    /**
     * The meta object literal for the '{@link de.dentrassi.varlink.idl.varlinkIdl.impl.ErrorImpl <em>Error</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.dentrassi.varlink.idl.varlinkIdl.impl.ErrorImpl
     * @see de.dentrassi.varlink.idl.varlinkIdl.impl.VarlinkIdlPackageImpl#getError()
     * @generated
     */
    EClass ERROR = eINSTANCE.getError();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR__PROPERTIES = eINSTANCE.getError_Properties();

  }

} //VarlinkIdlPackage
