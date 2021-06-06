package com.kodilla.good.patterns.challenges.Wyzwanie_loty;

import java.util.List;

public interface SearchingService {

    List<Flight> searchProcess(DataRequest dataRequest);
}