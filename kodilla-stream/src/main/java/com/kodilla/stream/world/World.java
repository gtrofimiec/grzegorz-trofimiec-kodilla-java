package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public final class World {
    private final Set<Continent> worldContinents = new HashSet<>();

    public Set<Continent> getContinents() {
        return worldContinents;
    }

    public void addWorldContinent(Continent continent) {
        worldContinents.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        return worldContinents.stream()
                .flatMap(continent -> continent.getContinentCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}