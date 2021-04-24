package com.kodilla.exception.test;

import java.util.HashMap;

public class FindRoute {

    public void findFlight(Flight flight) throws RouteNotFoundException {

        boolean foundRoute = false;
        String arrivalAirport = flight.getArrivalAirport();

        HashMap<String, Boolean> airports = new HashMap<>();
        airports.put("Tokyo", true);
        airports.put("Berlin", true);
        airports.put("Paris", false);

        if(airports.size()==0) {
            throw new RouteNotFoundException("List of airports empty!");
        }

        foundRoute = airports.getOrDefault(arrivalAirport,false);

        if(foundRoute) {
            System.out.println("Flight to " + arrivalAirport + " is available");
        } else {
            throw new RouteNotFoundException("No flight found!");
        }

    }

    public static void main(String[] args) {
        Flight flight1 = new Flight("Tokyo", "Berlin");
        FindRoute findRoute = new FindRoute();

        try {
            findRoute.findFlight(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println("Error: " + e);
        }
    }
}