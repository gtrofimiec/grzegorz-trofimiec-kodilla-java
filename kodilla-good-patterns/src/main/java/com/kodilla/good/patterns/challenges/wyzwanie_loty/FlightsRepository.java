package com.kodilla.good.patterns.challenges.wyzwanie_loty;

import java.util.Map;

public interface FlightsRepository {
    Map<Airport, String> getFlight(Airport departureFrom, Airport departureTo, Airport departureVia);
}
