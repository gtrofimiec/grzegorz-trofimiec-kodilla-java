package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public final class Continent {
    private final String continentName;
    private final Set<Country> continentCountries = new HashSet<>();

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public void addContinentCountry(Country country) {
        continentCountries.add(country);
    }

    public Set<Country> getContinentCountries() {
        return continentCountries;
    }
}