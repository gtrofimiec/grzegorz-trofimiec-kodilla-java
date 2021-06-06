package com.kodilla.good.patterns.challenges.Wyzwanie_loty;

public class FlightsSearchApp {

    public static void main(String[] args) {
        DataRequestRetriever dataRequestRetriever = new DataRequestRetriever();
        DataRequest dataRequest = dataRequestRetriever.retrieve();

        FlightSearchingProcessor flightSearchingProcessor =
                new FlightSearchingProcessor();

        flightSearchingProcessor.searchingProcess(dataRequest);
    }
}