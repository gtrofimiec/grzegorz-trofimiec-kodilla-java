package com.kodilla.good.patterns.challenges.Wyzwanie_loty2;

import java.util.List;

public class DataRequest {

    private List<Flight> flightsList;
    private List<Airport> airportsList;
    private Flight searchedFlight;
    private SearchingService searchingService;

    public DataRequest(List<Flight> flightsList, List<Airport> airportsList,
                       Flight searchedFlight, SearchingService searchingService) {
        this.flightsList = flightsList;
        this.airportsList = airportsList;
        this.searchedFlight = searchedFlight;
        this.searchingService = searchingService;
    }

    public List<Flight> getFlightsList() {
        return flightsList;
    }

    public Flight getSearchedFlight() {
        return searchedFlight;
    }

    public SearchingService getSearchingService() {
        return searchingService;
    }
}