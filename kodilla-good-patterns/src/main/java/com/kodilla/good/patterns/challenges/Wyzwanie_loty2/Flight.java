package com.kodilla.good.patterns.challenges.Wyzwanie_loty2;

public class Flight implements FlightService {

    Airport departureAirport;
    Airport arrivalAirport;

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

    public Flight getFlight() {
        return this;
    }

    @Override
    public String toString() {
        return "Flight from: " + departureAirport + ", to: " + arrivalAirport;
    }
}