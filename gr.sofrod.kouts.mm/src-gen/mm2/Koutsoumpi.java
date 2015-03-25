/**
 */
package mm2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Koutsoumpi</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm2.Koutsoumpi#getSpitia <em>Spitia</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm2.Mm2Package#getKoutsoumpi()
 * @model
 * @generated
 */
public interface Koutsoumpi extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Spitia</b></em>' reference list.
	 * The list contents are of type {@link mm2.Spiti}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spitia</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spitia</em>' reference list.
	 * @see mm2.Mm2Package#getKoutsoumpi_Spitia()
	 * @model
	 * @generated
	 */
	EList<Spiti> getSpitia();

} // Koutsoumpi
