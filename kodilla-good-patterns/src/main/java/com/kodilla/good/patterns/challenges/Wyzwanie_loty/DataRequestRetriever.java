package com.kodilla.good.patterns.challenges.Wyzwanie_loty;

import java.util.ArrayList;
import java.util.List;

public class DataRequestRetriever {

    public com.kodilla.good.patterns.challenges.Wyzwanie_loty.DataRequest retrieve() {
        List<com.kodilla.good.patterns.challenges.Wyzwanie_loty.Airport> airportsList = new ArrayList<>();
        List<com.kodilla.good.patterns.challenges.Wyzwanie_loty.Flight> flightsList = new ArrayList<>();

        com.kodilla.good.patterns.challenges.Wyzwanie_loty.Airport gdansk = new Airport("Gdansk");
        Airport wroclaw = new Airport("Wroclaw");
        Airport krakow = new Airport("Krakow");
        Airport poznan = new Airport("Poznan");

        airportsList.add(gdansk);
        airportsList.add(wroclaw);
        airportsList.add(krakow);
        airportsList.add(poznan);

        flightsList.add(new Flight(gdansk,wroclaw));
        flightsList.add(new Flight(gdansk,krakow));
        flightsList.add(new Flight(krakow,wroclaw));
        flightsList.add(new Flight(krakow,poznan));

        return new DataRequest(flightsList, airportsList, new Flight(gdansk, poznan), new SearchingArrival());
    }
}