package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    Calculator calculator;

    double result;

    @Test
    public void testAdd() {
        //Given
        //When
        result = calculator.add(2,3);
        //Then
        assertEquals(5, result);
    }

    @Test
    public void testSub() {
        //Given
        //When
        result = calculator.sub(3,2);
        //Then
        assertEquals(1, result);
    }

    @Test
    public void testMul() {
        //Given
        //When
        result = calculator.mul(3,2);
        //Then
        assertEquals(6, result);
    }

    @Test
    public void testDiv() {
        //Given
        //When
        result = calculator.div(4,2);
        //Then
        assertEquals(2, result);
    }
}