/**
 */
package mm2.impl;

import java.util.Collection;

import mm2.Koutsoumpi;
import mm2.Mm2Package;
import mm2.Spiti;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Koutsoumpi</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mm2.impl.KoutsoumpiImpl#getSpitia <em>Spitia</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KoutsoumpiImpl extends NamedElementImpl implements Koutsoumpi {
	/**
	 * The cached value of the '{@link #getSpitia() <em>Spitia</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpitia()
	 * @generated
	 * @ordered
	 */
	protected EList<Spiti> spitia;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KoutsoumpiImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mm2Package.Literals.KOUTSOUMPI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Spiti> getSpitia() {
		if (spitia == null) {
			spitia = new EObjectResolvingEList<Spiti>(Spiti.class, this, Mm2Package.KOUTSOUMPI__SPITIA);
		}
		return spitia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Mm2Package.KOUTSOUMPI__SPITIA:
				return getSpitia();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Mm2Package.KOUTSOUMPI__SPITIA:
				getSpitia().clear();
				getSpitia().addAll((Collection<? extends Spiti>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Mm2Package.KOUTSOUMPI__SPITIA:
				getSpitia().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Mm2Package.KOUTSOUMPI__SPITIA:
				return spitia != null && !spitia.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //KoutsoumpiImpl
