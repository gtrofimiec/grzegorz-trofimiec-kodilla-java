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

        List<Flight> resultList= dataRequest.getFlightsList().stream()
                .filter(a->a.getArrivalAirport().
                        equals(dataRequest.getSearchedFlight().getArrivalAirport())
                        && a.getDepartureAirport().equals(dataRequest.getSearchedFlight().getDepartureAirport()))
                .collect(Collectors.toList());
        System.out.println("No "+ dataRequest.getSearchedFlight());
        if(resultList.size()==0) {
            SearchingStopoverFlight searchingStopoverFlight = new SearchingStopoverFlight();
            searchingStopoverFlight.searchProcess(dataRequest);
        }
        return resultList;
    }
}