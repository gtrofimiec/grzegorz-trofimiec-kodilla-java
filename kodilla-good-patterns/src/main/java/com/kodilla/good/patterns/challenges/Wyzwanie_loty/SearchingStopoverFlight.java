package com.kodilla.good.patterns.challenges.Wyzwanie_loty;

import java.util.List;
import java.util.stream.Collectors;

public class SearchingStopoverFlight {

    public void searchProcess(DataRequest dataRequest) {
        List<Flight> stopoverFlight1;
        List<Flight> stopoverFlight2;

        stopoverFlight1 = dataRequest.getFlightsList().stream()
                .filter(a->a.getArrivalAirport().equals(dataRequest.getSearchedFlight().getArrivalAirport()))
                .collect(Collectors.toList());

        stopoverFlight2 = dataRequest.getFlightsList().stream()
                .filter(a->a.getArrivalAirport().equals(stopoverFlight1.get(0).getDepartureAirport()))
                .collect(Collectors.toList());

        System.out.println("Found flight with stopover:\n"+stopoverFlight2+"\n"+stopoverFlight1);
    }
}