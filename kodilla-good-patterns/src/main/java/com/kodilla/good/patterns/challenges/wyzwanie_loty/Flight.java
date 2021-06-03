package com.kodilla.good.patterns.challenges.wyzwanie_loty;

public class Flight {
    public Airport departureAirport;
    public Airport arrivalAirport;

    public Flight(Airport departureAirport, Airport arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public String toString() {
        return "Flight (from: " + departureAirport + ", to: " + arrivalAirport+")";
    }
}
