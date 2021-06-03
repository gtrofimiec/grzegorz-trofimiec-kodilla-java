package com.kodilla.good.patterns.challenges.wyzwanie_loty;

import java.util.List;

public class FlightsSearchApp {

    public static void main(String[] args) {

        FlightSearchingRequest searchingRequest = new FlightSearchingRequest();
        Airport gdansk = new Airport("Gdansk");

        List<Flight> result = searchingRequest.flightSearchingArrival(gdansk);
        System.out.println("Searching result:\n" +result);

        result = searchingRequest.flightSearchingDeparture("Gdansk");
        System.out.println("Searching result:\n" +result);
    }
}