package com.kodilla.good.patterns.challenges.wyzwanie_loty;

import java.util.ArrayList;
import java.util.List;

public class FlightsRepositoryRetriever implements FlightsRepository {

    public List<Flight> getFlightsRepository() {
        AirportsRepositoryRetriever airportsRepository = new AirportsRepositoryRetriever();
        List<Flight> flightList = new ArrayList<>();
        List<Airport> airportsList = airportsRepository.getAirportsRepository();

        flightList.add(new Flight(airportsList.get(0), airportsList.get(1)));
        flightList.add(new Flight(airportsList.get(0), airportsList.get(2)));
        flightList.add(new Flight(airportsList.get(2), airportsList.get(1)));
        return flightList;
    }
}