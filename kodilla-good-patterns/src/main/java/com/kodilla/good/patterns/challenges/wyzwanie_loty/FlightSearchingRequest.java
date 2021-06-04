package com.kodilla.good.patterns.challenges.wyzwanie_loty;

import java.util.List;

public class FlightSearchingRequest {

    AirportsRepository airportsRepository;
    FlightsRepository flightsRepository;

    public FlightSearchingRequest(FlightsRepository flightsRepository, AirportsRepository airportsRepository) {
        this.flightsRepository = flightsRepository;
        this.airportsRepository = airportsRepository;
    }

    public AirportsRepository getAirportRepository() {
        return airportsRepository;
    }

//    public FlightsRepository getFlightsRepository() {
//        return flightsRepository;
//    }

    public void flightSearchingArrival(FlightsRepository flightsRepository,
                                               Airport searchedAirport){
//        FlightsRepositoryRetriever flightsRepository = new FlightsRepositoryRetriever();
        FlightSearchingProcessor searchingProcessor = new FlightSearchingProcessor();

        searchingProcessor.searchingArrival(flightsRepository.getFlightsRepository(),
                searchedAirport);
    }

    public List<Flight> flightSearchingDeparture(String searchedAirport){
        FlightsRepositoryRetriever flightsRepository = new FlightsRepositoryRetriever();

        FlightSearchingProcessor searchingProcessor = new FlightSearchingProcessor();
        return searchingProcessor.searchingDeparture(flightsRepository.getFlightsRepository(),
                searchedAirport);
    }
}