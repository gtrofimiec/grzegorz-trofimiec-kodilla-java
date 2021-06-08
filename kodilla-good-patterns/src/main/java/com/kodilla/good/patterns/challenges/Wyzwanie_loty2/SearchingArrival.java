package com.kodilla.good.patterns.challenges.Wyzwanie_loty2;

import java.util.List;
import java.util.stream.Collectors;

public class SearchingArrival implements SearchingService {


    @Override
    public String toString() {
        return "Searching arrival";
    }

    @Override
    public List<Flight> searchProcess(DataRequest dataRequest) {

        System.out.println("Flights to "+dataRequest.getSearchedFlight().getArrivalAirport());
        return dataRequest.getFlightsList().stream()
                .filter(airport->airport.getArrivalAirport().
                        equals(dataRequest.getSearchedFlight().getArrivalAirport()))
                .collect(Collectors.toList());
    }
}