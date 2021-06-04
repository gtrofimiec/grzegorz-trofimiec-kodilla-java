package com.kodilla.good.patterns.challenges.wyzwanie_loty;

public class FlightsSearchApp {

    public static void main(String[] args) {

        FlightSearchingRequest searchingRequest = new FlightSearchingRequest(new FlightsRepositoryRetriever(),
                new AirportsRepositoryRetriever());

////        List<Flight> result = searchingRequest.flightSearchingArrival(searchingRequest.flightsRepository,
////                searchingRequest.getAirportRepository().getAirport(0));
//        System.out.println("Searching result:\n" +result);
//
//        result = searchingRequest.flightSearchingDeparture("Gdansk");
//        System.out.println("Searching result:\n" +result);
    }
}