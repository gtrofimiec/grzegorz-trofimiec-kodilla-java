package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindRoute {

    public void findFlight(Flight flight) throws RouteNotFoundException {

        boolean foundRoute = false;
        String arrivalAirport = flight.getArrivalAirport();

        HashMap<String, Boolean> airports = new HashMap<>();
        //airports.put("Tokyo", true);
        //airports.put("Berlin", true);
        //airports.put("Paris", false);

        if(airports.size()==0) {
            throw new RouteNotFoundException("List of airports empty!");
        }

        for (Map.Entry<String, Boolean> entry : airports.entrySet()) {
            if(entry.getKey() == arrivalAirport){
                foundRoute = entry.getValue();
            }
        }

        if(foundRoute==true) {
            System.out.println("Flight to " + arrivalAirport + " is available");
        } else {
            System.out.println("Flight to " + arrivalAirport + " is not available");
        }
    }

    public static void main(String[] args) {
        Flight flight1 = new Flight("Tokyo", "Berlin");
        FindRoute findRoute = new FindRoute();

        try {
            findRoute.findFlight(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println("Error: "+e);
        }
    }
}
