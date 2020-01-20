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

package org.openhab.binding.rootedtoon.internal.client.model;

/**
 *
 * @author daanmeijer - Initial Contribution
 *
 */
public class AveragedValue {
    public double value;

    public double avgValue;

    @Override
    public String toString() {
        return String.format("%.1f (%.1f avg)", this.value, this.avgValue);
    }
}