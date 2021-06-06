package com.kodilla.good.patterns.challenges.Wyzwanie_loty;

import java.util.List;
import java.util.stream.Collectors;

public class SearchingDeparture implements SearchingService {

    @Override
    public String toString() {
        return "Searching departure";
    }

    @Override
    public List<Flight> searchProcess(DataRequest dataRequest) {

        return dataRequest.getFlightsList().stream()
                .filter(airport->airport.getDepartureAirport().
                        equals(dataRequest.getSearchedFlight().getDepartureAirport()))
                .collect(Collectors.toList());
    }
}