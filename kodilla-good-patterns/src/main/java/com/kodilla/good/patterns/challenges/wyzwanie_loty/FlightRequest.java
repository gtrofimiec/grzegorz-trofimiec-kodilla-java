package com.kodilla.good.patterns.challenges.wyzwanie_loty;

public class FlightRequest {
    Airport flightFrom;
    Airport flightTo;
    Airport flightVia;

    public FlightRequest(Airport flightFrom, Airport flightTo, Airport flightVia) {
        this.flightFrom = flightFrom;
        this.flightTo = flightTo;
        this.flightVia = flightVia;
    }

    public Airport getFlightFrom() {
        return flightFrom;
    }

    public Airport getFlightTo() {
        return flightTo;
    }

    public Airport getFlightVia() {
        return flightVia;
    }
}
