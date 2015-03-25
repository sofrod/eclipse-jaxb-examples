/**
 */
package mm2;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mm2.Mm2Factory
 * @model kind="package"
 * @generated
 */
public interface Mm2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mm2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/mm2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mm2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Mm2Package eINSTANCE = mm2.impl.Mm2PackageImpl.init();

	/**
	 * The meta object id for the '{@link mm2.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm2.impl.NamedElementImpl
	 * @see mm2.impl.Mm2PackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mm2.impl.KoutsoumpiImpl <em>Koutsoumpi</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm2.impl.KoutsoumpiImpl
	 * @see mm2.impl.Mm2PackageImpl#getKoutsoumpi()
	 * @generated
	 */
	int KOUTSOUMPI = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOUTSOUMPI__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Spitia</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOUTSOUMPI__SPITIA = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Koutsoumpi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOUTSOUMPI_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Koutsoumpi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOUTSOUMPI_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mm2.impl.SpitiImpl <em>Spiti</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm2.impl.SpitiImpl
	 * @see mm2.impl.Mm2PackageImpl#getSpiti()
	 * @generated
	 */
	int SPITI = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPITI__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Spiti</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPITI_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Spiti</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPITI_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mm2.impl.KosmosImpl <em>Kosmos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm2.impl.KosmosImpl
	 * @see mm2.impl.Mm2PackageImpl#getKosmos()
	 * @generated
	 */
	int KOSMOS = 3;

	/**
	 * The feature id for the '<em><b>Koutsoumpia</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOSMOS__KOUTSOUMPIA = 0;

	/**
	 * The feature id for the '<em><b>Spitia</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOSMOS__SPITIA = 1;

	/**
	 * The number of structural features of the '<em>Kosmos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOSMOS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Kosmos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOSMOS_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link mm2.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see mm2.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link mm2.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm2.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link mm2.Koutsoumpi <em>Koutsoumpi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Koutsoumpi</em>'.
	 * @see mm2.Koutsoumpi
	 * @generated
	 */
	EClass getKoutsoumpi();

	/**
	 * Returns the meta object for the reference list '{@link mm2.Koutsoumpi#getSpitia <em>Spitia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Spitia</em>'.
	 * @see mm2.Koutsoumpi#getSpitia()
	 * @see #getKoutsoumpi()
	 * @generated
	 */
	EReference getKoutsoumpi_Spitia();

	/**
	 * Returns the meta object for class '{@link mm2.Spiti <em>Spiti</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spiti</em>'.
	 * @see mm2.Spiti
	 * @generated
	 */
	EClass getSpiti();

	/**
	 * Returns the meta object for class '{@link mm2.Kosmos <em>Kosmos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kosmos</em>'.
	 * @see mm2.Kosmos
	 * @generated
	 */
	EClass getKosmos();

	/**
	 * Returns the meta object for the containment reference list '{@link mm2.Kosmos#getKoutsoumpia <em>Koutsoumpia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Koutsoumpia</em>'.
	 * @see mm2.Kosmos#getKoutsoumpia()
	 * @see #getKosmos()
	 * @generated
	 */
	EReference getKosmos_Koutsoumpia();

	/**
	 * Returns the meta object for the containment reference list '{@link mm2.Kosmos#getSpitia <em>Spitia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spitia</em>'.
	 * @see mm2.Kosmos#getSpitia()
	 * @see #getKosmos()
	 * @generated
	 */
	EReference getKosmos_Spitia();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Mm2Factory getMm2Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link mm2.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm2.impl.NamedElementImpl
		 * @see mm2.impl.Mm2PackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link mm2.impl.KoutsoumpiImpl <em>Koutsoumpi</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm2.impl.KoutsoumpiImpl
		 * @see mm2.impl.Mm2PackageImpl#getKoutsoumpi()
		 * @generated
		 */
		EClass KOUTSOUMPI = eINSTANCE.getKoutsoumpi();

		/**
		 * The meta object literal for the '<em><b>Spitia</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KOUTSOUMPI__SPITIA = eINSTANCE.getKoutsoumpi_Spitia();

		/**
		 * The meta object literal for the '{@link mm2.impl.SpitiImpl <em>Spiti</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm2.impl.SpitiImpl
		 * @see mm2.impl.Mm2PackageImpl#getSpiti()
		 * @generated
		 */
		EClass SPITI = eINSTANCE.getSpiti();

		/**
		 * The meta object literal for the '{@link mm2.impl.KosmosImpl <em>Kosmos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm2.impl.KosmosImpl
		 * @see mm2.impl.Mm2PackageImpl#getKosmos()
		 * @generated
		 */
		EClass KOSMOS = eINSTANCE.getKosmos();

		/**
		 * The meta object literal for the '<em><b>Koutsoumpia</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KOSMOS__KOUTSOUMPIA = eINSTANCE.getKosmos_Koutsoumpia();

		/**
		 * The meta object literal for the '<em><b>Spitia</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KOSMOS__SPITIA = eINSTANCE.getKosmos_Spitia();

	}

} //Mm2Package
