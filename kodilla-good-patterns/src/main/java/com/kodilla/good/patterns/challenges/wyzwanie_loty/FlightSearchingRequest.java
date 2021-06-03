package com.kodilla.good.patterns.challenges.wyzwanie_loty;

import java.util.List;

public class FlightSearchingRequest {

    public List<Flight> flightSearchingArrival(Airport searchedAirport){
        FlightsRepositoryRetriever flightsRepository = new FlightsRepositoryRetriever();

        FlightSearchingProcessor searchingProcessor = new FlightSearchingProcessor();
        return searchingProcessor.searchingArrival(flightsRepository.getFlightsRepository(),
                searchedAirport);
    }

    public List<Flight> flightSearchingDeparture(String searchedAirport){
        FlightsRepositoryRetriever flightsRepository = new FlightsRepositoryRetriever();

        FlightSearchingProcessor searchingProcessor = new FlightSearchingProcessor();
        return searchingProcessor.searchingDeparture(flightsRepository.getFlightsRepository(),
                searchedAirport);
    }
}
