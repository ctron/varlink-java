/**
 * generated by Xtext 2.12.0
 */
package de.dentrassi.varlink.idl.varlinkIdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dentrassi.varlink.idl.varlinkIdl.Method#getArguments <em>Arguments</em>}</li>
 *   <li>{@link de.dentrassi.varlink.idl.varlinkIdl.Method#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see de.dentrassi.varlink.idl.varlinkIdl.VarlinkIdlPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends Member
{
  /**
   * Returns the value of the '<em><b>Arguments</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' containment reference.
   * @see #setArguments(de.dentrassi.varlink.idl.varlinkIdl.Object)
   * @see de.dentrassi.varlink.idl.varlinkIdl.VarlinkIdlPackage#getMethod_Arguments()
   * @model containment="true"
   * @generated
   */
  de.dentrassi.varlink.idl.varlinkIdl.Object getArguments();

  /**
   * Sets the value of the '{@link de.dentrassi.varlink.idl.varlinkIdl.Method#getArguments <em>Arguments</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arguments</em>' containment reference.
   * @see #getArguments()
   * @generated
   */
  void setArguments(de.dentrassi.varlink.idl.varlinkIdl.Object value);

  /**
   * Returns the value of the '<em><b>Result</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Result</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Result</em>' containment reference.
   * @see #setResult(de.dentrassi.varlink.idl.varlinkIdl.Object)
   * @see de.dentrassi.varlink.idl.varlinkIdl.VarlinkIdlPackage#getMethod_Result()
   * @model containment="true"
   * @generated
   */
  de.dentrassi.varlink.idl.varlinkIdl.Object getResult();

  /**
   * Sets the value of the '{@link de.dentrassi.varlink.idl.varlinkIdl.Method#getResult <em>Result</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Result</em>' containment reference.
   * @see #getResult()
   * @generated
   */
  void setResult(de.dentrassi.varlink.idl.varlinkIdl.Object value);

} // Method