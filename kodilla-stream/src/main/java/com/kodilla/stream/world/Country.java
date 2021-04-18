package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final String countryName;
    private final Continent countryLocation;
    private final BigDecimal peopleQuantity;

    public Country(String countryName, Continent countryLocation, BigDecimal peopleQuantity) {
        this.countryName = countryName;
        this.countryLocation = countryLocation;
        this.peopleQuantity = peopleQuantity;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }
}