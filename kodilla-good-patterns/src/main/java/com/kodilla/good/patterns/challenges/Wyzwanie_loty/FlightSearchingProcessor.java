package com.kodilla.good.patterns.challenges.Wyzwanie_loty;

import java.util.List;

public class FlightSearchingProcessor {

    public void searchingProcess(DataRequest dataRequest) {
        List<Flight> searchingResult = dataRequest.getSearchingService()
                .searchProcess(dataRequest);

        for(Flight flight : searchingResult) {
            System.out.println(flight);
        }
    }
}