package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    public static Double getAverage(int[] numbers) {

        IntStream.range(0, numbers.length)
                .map(n-> Integer.valueOf(numbers[n]))
                .forEach(System.out::println);

        Double result = IntStream.range(0, numbers.length)
                .map(n-> Integer.valueOf(numbers[n]))
                .average().getAsDouble();
        System.out.println("Average: "+result);
        return result;
    }
}