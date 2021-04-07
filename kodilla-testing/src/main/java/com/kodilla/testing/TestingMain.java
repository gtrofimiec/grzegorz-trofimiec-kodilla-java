package com.kodilla.testing;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();

        if(result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calc = new Calculator();
        int resultAdd = calc.add(2,2);

        System.out.println("\nWynik dodawania: " + resultAdd);

        int resultSubstract = calc.substract(3,2);

        System.out.println("\nWynik odejmowania: " + resultSubstract);
    }
}