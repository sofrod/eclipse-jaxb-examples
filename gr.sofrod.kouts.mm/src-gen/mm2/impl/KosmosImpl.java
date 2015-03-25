/**
 */
package mm2.impl;

import java.util.Collection;

import mm2.Kosmos;
import mm2.Koutsoumpi;
import mm2.Mm2Package;
import mm2.Spiti;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kosmos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mm2.impl.KosmosImpl#getKoutsoumpia <em>Koutsoumpia</em>}</li>
 *   <li>{@link mm2.impl.KosmosImpl#getSpitia <em>Spitia</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KosmosImpl extends MinimalEObjectImpl.Container implements Kosmos {
	/**
	 * The cached value of the '{@link #getKoutsoumpia() <em>Koutsoumpia</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKoutsoumpia()
	 * @generated
	 * @ordered
	 */
	protected EList<Koutsoumpi> koutsoumpia;

	/**
	 * The cached value of the '{@link #getSpitia() <em>Spitia</em>}' containment reference list.
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
	protected KosmosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mm2Package.Literals.KOSMOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Koutsoumpi> getKoutsoumpia() {
		if (koutsoumpia == null) {
			koutsoumpia = new EObjectContainmentEList<Koutsoumpi>(Koutsoumpi.class, this, Mm2Package.KOSMOS__KOUTSOUMPIA);
		}
		return koutsoumpia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Spiti> getSpitia() {
		if (spitia == null) {
			spitia = new EObjectContainmentEList<Spiti>(Spiti.class, this, Mm2Package.KOSMOS__SPITIA);
		}
		return spitia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mm2Package.KOSMOS__KOUTSOUMPIA:
				return ((InternalEList<?>)getKoutsoumpia()).basicRemove(otherEnd, msgs);
			case Mm2Package.KOSMOS__SPITIA:
				return ((InternalEList<?>)getSpitia()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Mm2Package.KOSMOS__KOUTSOUMPIA:
				return getKoutsoumpia();
			case Mm2Package.KOSMOS__SPITIA:
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
			case Mm2Package.KOSMOS__KOUTSOUMPIA:
				getKoutsoumpia().clear();
				getKoutsoumpia().addAll((Collection<? extends Koutsoumpi>)newValue);
				return;
			case Mm2Package.KOSMOS__SPITIA:
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
			case Mm2Package.KOSMOS__KOUTSOUMPIA:
				getKoutsoumpia().clear();
				return;
			case Mm2Package.KOSMOS__SPITIA:
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
			case Mm2Package.KOSMOS__KOUTSOUMPIA:
				return koutsoumpia != null && !koutsoumpia.isEmpty();
			case Mm2Package.KOSMOS__SPITIA:
				return spitia != null && !spitia.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //KosmosImpl
