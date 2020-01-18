/**
 * Copyright (c) 2010-2019 Contributors to the openHAB project
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

package org.openhab.binding.rootedtoon.internal.client;

import org.openhab.binding.rootedtoon.internal.client.model.PowerUsageInfo;
import org.openhab.binding.rootedtoon.internal.client.model.RealtimeUsageInfo;
import org.openhab.binding.rootedtoon.internal.client.model.ThermostatInfo;

/**
 *
 * @author daanmeijer - Initial Contribution
 *
 */
public interface ToonClientEventListener {
    void newPowerUsageInfo(PowerUsageInfo paramPowerUsageInfo);

    void newThermostatInfo(ThermostatInfo paramThermostatInfo);

    void newRealtimeUsageInfo(RealtimeUsageInfo paramRealtimeUsageInfo);
}

/*
 * Location:
 * /Users/daanmeijer/Downloads/org.openhab.binding.localtoon-2.5.0-SNAPSHOT.jar!/org/openhab/binding/localtoon/internal/
 * client/ToonClientEventListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version: 1.1.2
 */