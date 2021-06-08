package com.kodilla.good.patterns.challenges.Wyzwanie_loty2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SearchingStopoverFlight implements SearchingService {

    public List<Flight> searchProcess(DataRequest dataRequest) {

        SearchingArrival searchingArrival = new SearchingArrival();
        SearchingDeparture searchingDeparture = new SearchingDeparture();

        List<Flight> resultList = new ArrayList<>();
        List<Flight> stopoverFlightArrival = searchingArrival.searchProcess(dataRequest);
        List<Flight> stopoverFlightDeparture = searchingDeparture.searchProcess(dataRequest);

        System.out.println("Flights from " + dataRequest.getSearchedFlight().getDepartureAirport()
                + " to " + dataRequest.getSearchedFlight().getArrivalAirport() + " with stopover:");


        Map<Airport, Flight> collect = stopoverFlightDeparture.stream()
                .collect(Collectors.toMap(Flight::getArrivalAirport, flight -> flight));

        stopoverFlightArrival.stream()
                .filter(flight->flight.getDepartureAirport().equals
                        (collect.entrySet().stream().map(Map.Entry::getKey)))
                .collect(Collectors.toList());


        return resultList;
    }
}