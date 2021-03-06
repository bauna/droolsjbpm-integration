/*
 * Copyright 2011 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.simulation.impl;

import java.util.Collection;

import org.drools.simulation.SimulationPath;
import org.drools.simulation.Simulation;
import org.drools.simulation.SimulationStep;

public class SimulationPathImpl
        implements SimulationPath {

    private SimulationImpl   simulation;

    private String           name;

    private Collection<SimulationStep> steps;

    public SimulationPathImpl(Simulation simulation,
            String name) {
        this.name = name;
        this.simulation = (SimulationImpl) simulation;
    }

    public void setSteps(Collection<SimulationStep> steps) {
        this.steps = steps;
    }

    public String getName() {
        return this.name;
    }

    public Collection<SimulationStep> getSteps() {
        return this.steps;
    }

    @Override
    public String toString() {
        return "SimulationPathImpl [name=" + name + ", steps=" + steps.size() + "]";
    }

}
