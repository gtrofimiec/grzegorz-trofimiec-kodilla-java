package com.kodilla.good.patterns.challenges.Wyzwanie_loty2;

import java.util.ArrayList;
import java.util.List;

public class DataRequestRetriever {

    public DataRequest retrieve() {
        List<Airport> airportsList = new ArrayList<>();
        List<Flight> flightsList = new ArrayList<>();

        Airport gdansk = new Airport("Gdansk");
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

        return new DataRequest(flightsList, airportsList, new Flight(gdansk, poznan),
                new SearchingStopoverFlight());
    }
}