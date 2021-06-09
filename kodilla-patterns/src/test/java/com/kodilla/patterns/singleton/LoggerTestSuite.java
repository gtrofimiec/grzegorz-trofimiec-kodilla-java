package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

    @Test
    void getLastLogTest() {

        //Given
        Logger logger = Logger.INSTANCE;
        logger.log("line1");
        logger.log("line2");
        logger.log("line3");

        //When
        String lastLog = logger.getLastLog();

        //Then
        System.out.println("Last log: " + lastLog);
    }
}
