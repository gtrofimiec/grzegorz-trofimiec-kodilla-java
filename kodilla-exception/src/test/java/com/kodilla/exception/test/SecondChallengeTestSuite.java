package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

    @Test
    public void secondChallengeTest() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();

        // when & then
        assertAll(
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.4,1.6)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1,1.5)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0,2))
        );
    }
}