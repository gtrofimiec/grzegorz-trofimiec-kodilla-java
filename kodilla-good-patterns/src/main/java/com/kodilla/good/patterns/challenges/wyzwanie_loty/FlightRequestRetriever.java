package com.kodilla.good.patterns.challenges.wyzwanie_loty;

import java.util.Map;

public class FlightRequestRetriever implements FlightsRepository {

    @Override
    public Map<Airport, String> getFlight(Airport departureFrom, Airport departureTo, Airport departureVia) {
        return null;
    }

    FlightRequest retrieve() {
        Airport airport1 = new Airport("Gdansk");
        Airport airport2 = new Airport("Wroclaw");
        Airport airport3 = new Airport("Poznan");

        return new FlightRequest(airport1, airport2, airport3);
    }
}
