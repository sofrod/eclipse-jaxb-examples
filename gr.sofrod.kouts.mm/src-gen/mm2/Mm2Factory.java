/**
 */
package mm2;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mm2.Mm2Package
 * @generated
 */
public interface Mm2Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Mm2Factory eINSTANCE = mm2.impl.Mm2FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Koutsoumpi</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Koutsoumpi</em>'.
	 * @generated
	 */
	Koutsoumpi createKoutsoumpi();

	/**
	 * Returns a new object of class '<em>Spiti</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spiti</em>'.
	 * @generated
	 */
	Spiti createSpiti();

	/**
	 * Returns a new object of class '<em>Kosmos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kosmos</em>'.
	 * @generated
	 */
	Kosmos createKosmos();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Mm2Package getMm2Package();

} //Mm2Factory
