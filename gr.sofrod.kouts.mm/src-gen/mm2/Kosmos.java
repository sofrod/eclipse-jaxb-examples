/**
 */
package mm2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kosmos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm2.Kosmos#getKoutsoumpia <em>Koutsoumpia</em>}</li>
 *   <li>{@link mm2.Kosmos#getSpitia <em>Spitia</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm2.Mm2Package#getKosmos()
 * @model
 * @generated
 */
public interface Kosmos extends EObject {
	/**
	 * Returns the value of the '<em><b>Koutsoumpia</b></em>' containment reference list.
	 * The list contents are of type {@link mm2.Koutsoumpi}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Koutsoumpia</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Koutsoumpia</em>' containment reference list.
	 * @see mm2.Mm2Package#getKosmos_Koutsoumpia()
	 * @model containment="true"
	 * @generated
	 */
	EList<Koutsoumpi> getKoutsoumpia();

	/**
	 * Returns the value of the '<em><b>Spitia</b></em>' containment reference list.
	 * The list contents are of type {@link mm2.Spiti}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spitia</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spitia</em>' containment reference list.
	 * @see mm2.Mm2Package#getKosmos_Spitia()
	 * @model containment="true"
	 * @generated
	 */
	EList<Spiti> getSpitia();

} // Kosmos
