package com.kodilla.good.patterns.challenges.wyzwanie_loty;

import java.util.ArrayList;
import java.util.List;

public class FlightsRepositoryRetriever implements FlightsRepository{

    public List<Flight> getFlightsRepository() {
        List<Flight> flightList = new ArrayList<>();
        Airport gdansk = new Airport("Gdansk");
        Airport wroclaw = new Airport("Wroclaw");
        Airport krakow = new Airport("Krakow");

        flightList.add(new Flight(gdansk, wroclaw));
        flightList.add(new Flight(gdansk, krakow));
        flightList.add(new Flight(krakow, wroclaw));
        return flightList;
    }
}
