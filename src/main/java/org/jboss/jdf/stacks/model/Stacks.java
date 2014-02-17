/*
 * JBoss, Home of Professional Open Source
 * Copyright 2013, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.jdf.stacks.model;

import java.util.List;

public interface Stacks {

    public List<Archetype> getAvailableArchetypes();

    public List<Archetype> getAvailableArchetypes(Filter<Archetype> filter);

    public List<Runtime> getAvailableRuntimes();

    public List<Runtime> getAvailableRuntimes(Filter<Runtime> filter);

    public List<Bom> getAvailableBoms();

    public List<Bom> getAvailableBoms(Filter<Bom> filter);

    public List<MinorRelease> getMinorReleases();

    public List<MinorRelease> getMinorReleases(Filter<MinorRelease> filter);

    public List<MajorRelease> getMajorReleases();

    public List<MajorRelease> getMajorReleases(Filter<MajorRelease> filter);

    public List<BomVersion> getAvailableBomVersions();

    public List<BomVersion> getAvailableBomVersions(Filter<BomVersion> filter);

    public List<ArchetypeVersion> getAvailableArchetypeVersions();

    public List<ArchetypeVersion> getAvailableArchetypeVersions(Filter<ArchetypeVersion> filter);

    public List<String> getLicenses();

}
