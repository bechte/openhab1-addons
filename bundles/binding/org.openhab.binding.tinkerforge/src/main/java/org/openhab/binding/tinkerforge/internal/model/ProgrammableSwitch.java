/**
 * Copyright (c) 2010-2020 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.tinkerforge.internal.model;

import org.eclipse.emf.ecore.EObject;
import org.openhab.binding.tinkerforge.internal.config.DeviceOptions;
import org.openhab.binding.tinkerforge.internal.types.OnOffValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programmable Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhab.binding.tinkerforge.internal.model.ProgrammableSwitch#getSwitchState <em>Switch State</em>}
 * </li>
 * </ul>
 * </p>
 *
 * @see org.openhab.binding.tinkerforge.internal.model.ModelPackage#getProgrammableSwitch()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ProgrammableSwitch extends EObject {
    /**
     * Returns the value of the '<em><b>Switch State</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Switch State</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Switch State</em>' attribute.
     * @see #setSwitchState(OnOffValue)
     * @see org.openhab.binding.tinkerforge.internal.model.ModelPackage#getProgrammableSwitch_SwitchState()
     * @model unique="false" dataType="org.openhab.binding.tinkerforge.internal.model.SwitchState"
     * @generated
     */
    OnOffValue getSwitchState();

    /**
     * Sets the value of the '{@link org.openhab.binding.tinkerforge.internal.model.ProgrammableSwitch#getSwitchState
     * <em>Switch State</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value the new value of the '<em>Switch State</em>' attribute.
     * @see #getSwitchState()
     * @generated
     */
    void setSwitchState(OnOffValue value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @model stateDataType="org.openhab.binding.tinkerforge.internal.model.SwitchState" stateUnique="false"
     *        optsDataType="org.openhab.binding.tinkerforge.internal.model.DeviceOptions" optsUnique="false"
     * @generated
     */
    void turnSwitch(OnOffValue state, DeviceOptions opts);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @model
     * @generated
     */
    void fetchSwitchState();

} // ProgrammableSwitch
