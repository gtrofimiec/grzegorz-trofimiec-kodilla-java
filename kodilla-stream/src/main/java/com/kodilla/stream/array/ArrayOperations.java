package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    public static Double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .forEach(System.out::println);
        Double result = IntStream.range(0, numbers.length)
                .average().getAsDouble();
        return result;
    }
}