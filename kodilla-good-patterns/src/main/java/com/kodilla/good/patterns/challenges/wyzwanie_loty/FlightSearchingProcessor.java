package com.kodilla.good.patterns.challenges.wyzwanie_loty;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSearchingProcessor {

    public List<Flight> searchingArrival(List<Flight> searchedList, Airport searchedAirport) {
        searchedList.stream()
                .map(s->s.getArrivalAirport())
                .map(s->s.hashCode())
                .filter(s-> s.equals(searchedAirport))
                .collect(Collectors.toList());
        return searchedList;
    }

    public List<Flight> searchingDeparture(List<Flight> searchedList, String searchedAirport) {
        searchedList.stream()
                .filter(s-> s.getDepartureAirport().getAirportName().equals(searchedAirport))
                .collect(Collectors.toList());
        return searchedList;
    }

}