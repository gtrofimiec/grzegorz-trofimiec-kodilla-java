package com.kodilla.good.patterns.challenges.Wyzwanie_loty2;

import java.util.List;
import java.util.stream.Collectors;

public class SearchingDeparture implements SearchingService {

    @Override
    public String toString() {
        return "Searching departure";
    }

    @Override
    public List<Flight> searchProcess(DataRequest dataRequest) {

        System.out.println("Flights from "+dataRequest.getSearchedFlight().getDepartureAirport());
        return dataRequest.getFlightsList().stream()
                .filter(airport->airport.getDepartureAirport().
                        equals(dataRequest.getSearchedFlight().getDepartureAirport()))
                .collect(Collectors.toList());
    }
}