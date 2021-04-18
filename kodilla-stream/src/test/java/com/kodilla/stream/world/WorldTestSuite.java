package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {

        //Given
        // Create world
        World world = new World();

        //Create continents
        Continent continent1 = new Continent("Europe");
        Continent continent2 = new Continent("Asia");
        Continent continent3 = new Continent("Africa");

        //Create countries
        Country country1 = new Country("Poland",continent1, new BigDecimal("100"));
        Country country2 = new Country("France",continent1, new BigDecimal("100"));
        Country country3 = new Country("Spain",continent1, new BigDecimal("100"));
        Country country4 = new Country("China",continent2, new BigDecimal("100"));
        Country country5 = new Country("India",continent2, new BigDecimal("100"));
        Country country6 = new Country("Japan",continent2, new BigDecimal("100"));
        Country country7 = new Country("Egypt",continent2, new BigDecimal("100"));
        Country country8 = new Country("Sudan",continent2, new BigDecimal("100"));
        Country country9 = new Country("Algeria",continent2, new BigDecimal("100"));

        //Creating continents in world
        world.addWorldContinent(continent1);
        world.addWorldContinent(continent2);
        world.addWorldContinent(continent3);

        //Creating countries in continent1
        continent1.addContinentCountry(country1);
        continent1.addContinentCountry(country2);
        continent1.addContinentCountry(country3);
        //Creating countries in continent2
        continent2.addContinentCountry(country4);
        continent2.addContinentCountry(country5);
        continent2.addContinentCountry(country6);
        //Creating countries in continent3
        continent3.addContinentCountry(country7);
        continent3.addContinentCountry(country8);
        continent3.addContinentCountry(country9);

        //When
        BigDecimal worldPopulation = BigDecimal.ZERO;
        for(Continent continents : world.getContinents()) {
            for (Country countries : continent1.getContinentCountries()) {
                worldPopulation = worldPopulation.add(countries.getPeopleQuantity());
            }
        }
        BigDecimal worldPopulation1 = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPopulation = new BigDecimal("900");
        assertEquals(expectedPopulation,worldPopulation1);
    }
}
