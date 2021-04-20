package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] numbers = new int[20];
        for(int i=0; i<= numbers.length-1; i++) {
            numbers[i] = i*2;
        }

        //When
        Double avgResult = ArrayOperations.getAverage(numbers);

        //Then
        int sum = 2+4+6+8+10+12+14+16+18+20+22+24+26+28+30+32+34+36+38;
        double avg = sum/20;
        assertEquals(avg, avgResult);
    }
}