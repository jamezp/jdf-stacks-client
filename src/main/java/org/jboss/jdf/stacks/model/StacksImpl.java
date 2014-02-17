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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class StacksImpl implements Stacks {

    private List<Runtime> availableRuntimes;

    private List<Bom> availableBoms;

    private List<BomVersion> availableBomVersions;

    private List<Archetype> availableArchetypes;

    private List<ArchetypeVersion> availableArchetypeVersions;

    private List<MinorRelease> minorReleases;

    private List<MajorRelease> majorReleases;

    private List<String> licenses;

    public List<Archetype> getAvailableArchetypes() {
        return availableArchetypes;
    }

    @Override
    public List<Archetype> getAvailableArchetypes(final Filter<Archetype> filter) {
        return doFilter(availableArchetypes, filter);
    }

    public void setAvailableArchetypes(List<Archetype> availableArchetypes) {
        this.availableArchetypes = availableArchetypes;
    }

    public void setAvailableRuntimes(List<Runtime> availableRuntimes) {
        this.availableRuntimes = availableRuntimes;
    }

    public List<Runtime> getAvailableRuntimes() {
        return availableRuntimes;
    }

    @Override
    public List<Runtime> getAvailableRuntimes(final Filter<Runtime> filter) {
        return doFilter(availableRuntimes, filter);
    }

    public List<Bom> getAvailableBoms() {
        return availableBoms;
    }

    @Override
    public List<Bom> getAvailableBoms(final Filter<Bom> filter) {
        return doFilter(availableBoms, filter);
    }

    public void setAvailableBoms(List<Bom> availableBoms) {
        this.availableBoms = availableBoms;
    }

    public List<MinorRelease> getMinorReleases() {
        return minorReleases;
    }

    @Override
    public List<MinorRelease> getMinorReleases(final Filter<MinorRelease> filter) {
        return doFilter(minorReleases, filter);
    }

    public void setMinorReleases(List<MinorRelease> minorReleases) {
        this.minorReleases = minorReleases;
    }

    public List<MajorRelease> getMajorReleases() {
        return majorReleases;
    }

    @Override
    public List<MajorRelease> getMajorReleases(final Filter<MajorRelease> filter) {
        return doFilter(majorReleases, filter);
    }

    public void setMajorReleases(List<MajorRelease> majorReleases) {
        this.majorReleases = majorReleases;
    }

    public List<BomVersion> getAvailableBomVersions() {
        return availableBomVersions;
    }

    @Override
    public List<BomVersion> getAvailableBomVersions(final Filter<BomVersion> filter) {
        return doFilter(availableBomVersions, filter);
    }

    public void setAvailableBomVersions(List<BomVersion> availableBomVersions) {
        this.availableBomVersions = availableBomVersions;
    }

    public List<ArchetypeVersion> getAvailableArchetypeVersions() {
        return availableArchetypeVersions;
    }

    @Override
    public List<ArchetypeVersion> getAvailableArchetypeVersions(final Filter<ArchetypeVersion> filter) {
        return doFilter(availableArchetypeVersions, filter);
    }

    public void setAvailableArchetypeVersions(List<ArchetypeVersion> availableArchetypeVersions) {
        this.availableArchetypeVersions = availableArchetypeVersions;
    }

    public List<String> getLicenses() {
        return licenses;
    }

    public void setLicenses(List<String> licenses) {
        this.licenses = licenses;
    }

    private <T> List<T> doFilter(final List<T> values, final Filter<T> filter) {
        final List<T> result = new ArrayList<T>();
        for (T value : values) {
            if (filter.accept(value)) {
                result.add(value);
            }
        }
        return Collections.unmodifiableList(result);
    }
}
