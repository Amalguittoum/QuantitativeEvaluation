/*
 * Software Name : Dependencies inference
 * Version: 0.0
 * SPDX-FileCopyrightText: Copyright (c) 2022[-2022] Orange
 * SPDX-License-Identifier: AGPL-3.0-only
 *
 * This software is distributed under the GNU Affero General Public License v3.0 only,
 * the text of which is available at https://spdx.org/licenses/AGPL-3.0-only.html
 * or see the "license.txt" file for more details.
 *
 * Author: Amal GUITTOUM
 * Software description: Dependencies inference in smart home scenarios
 */

package Inference;


public abstract class Reasoner {

    public abstract void run ();

    public abstract void runServiceDependence();
    public abstract void runConnectivityDependence();
    public abstract void runEnvDependence();
    public abstract void runAppStateDependence();
    public abstract void runAppDataDependence();
    public abstract void infer();
    public abstract void loadData();




}
