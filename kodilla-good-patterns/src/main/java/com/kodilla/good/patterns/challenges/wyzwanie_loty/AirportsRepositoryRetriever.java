package com.kodilla.good.patterns.challenges.wyzwanie_loty;

import java.util.ArrayList;
import java.util.List;

public class AirportsRepositoryRetriever implements AirportsRepository {

    List<Airport> airportsList;

    public List<Airport> getAirportsRepository() {
        airportsList = new ArrayList<>();
        airportsList.add(new Airport("Gdansk"));
        airportsList.add(new Airport("Wroclaw"));
        airportsList.add(new Airport("Krakow"));
        return airportsList;
    }

    public Airport getAirport(int i) {
        Airport airport = getAirportsRepository().get(i);
        return airport;
    }
}