package com.kodilla.good.patterns.challenges.Wyzwanie_loty2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SearchingStopoverFlight implements SearchingService {

    public List<Flight> searchProcess(DataRequest dataRequest) {

        SearchingDeparture searchingDeparture = new SearchingDeparture();
        SearchingArrival searchingArrival = new SearchingArrival();

        List<Flight> resultList = new ArrayList<>();
        List<Flight> stopoverFlightDeparture = searchingDeparture.searchProcess(dataRequest);
        List<Flight> stopoverFlightArrival = searchingArrival.searchProcess(dataRequest);

        System.out.println("Flights from " + dataRequest.getSearchedFlight().getDepartureAirport()
                + " to " + dataRequest.getSearchedFlight().getArrivalAirport() + " with stopover:");


        Map<Airport, Flight> collectDeparture = stopoverFlightDeparture.stream()
                .collect(Collectors.toMap(Flight::getArrivalAirport, flight -> flight));

        

        Map<Airport,Flight> collectArrival = stopoverFlightArrival.stream()
                .collect(Collectors.toMap(Flight::getDepartureAirport, flight->flight));


        for(Map.Entry<Airport,Flight> entryDep : collectDeparture.entrySet()) {
            for(Map.Entry<Airport,Flight> entryArr : collectArrival.entrySet()) {
                if (entryDep.getKey().equals(entryArr.getKey())) {
                    resultList.add(entryDep.getValue());
                    resultList.add(entryArr.getValue());
                }
            }
        }
        return resultList;
    }
}