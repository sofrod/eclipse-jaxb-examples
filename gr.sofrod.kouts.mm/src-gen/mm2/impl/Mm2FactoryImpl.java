/**
 */
package mm2.impl;

import mm2.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Mm2FactoryImpl extends EFactoryImpl implements Mm2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Mm2Factory init() {
		try {
			Mm2Factory theMm2Factory = (Mm2Factory)EPackage.Registry.INSTANCE.getEFactory(Mm2Package.eNS_URI);
			if (theMm2Factory != null) {
				return theMm2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Mm2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mm2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Mm2Package.KOUTSOUMPI: return createKoutsoumpi();
			case Mm2Package.SPITI: return createSpiti();
			case Mm2Package.KOSMOS: return createKosmos();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Koutsoumpi createKoutsoumpi() {
		KoutsoumpiImpl koutsoumpi = new KoutsoumpiImpl();
		return koutsoumpi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Spiti createSpiti() {
		SpitiImpl spiti = new SpitiImpl();
		return spiti;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kosmos createKosmos() {
		KosmosImpl kosmos = new KosmosImpl();
		return kosmos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mm2Package getMm2Package() {
		return (Mm2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Mm2Package getPackage() {
		return Mm2Package.eINSTANCE;
	}

} //Mm2FactoryImpl
