package com.kodilla.good.patterns.challenges.Wyzwanie_loty2;

public class FlightsSearchApp {

    public static void main(String[] args) {
        DataRequestRetriever dataRequestRetriever = new DataRequestRetriever();
        DataRequest dataRequest = dataRequestRetriever.retrieve();

        FlightSearchingProcessor flightSearchingProcessor =
                new FlightSearchingProcessor();

        flightSearchingProcessor.searchingProcess(dataRequest);
    }
}