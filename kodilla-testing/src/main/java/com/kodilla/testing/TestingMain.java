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

        //TEST: PIERWSZY TEST JEDNOSTKOWY ===========================
        System.out.println("\nTest - pierwszy test jednostkowy:\n");

        Calculator calc = new Calculator();

        int a = 2;
        int b = 2;
        int resultAdd = calc.add(a,b);

        System.out.println("Wynik dodawania cyfr " + a + " i " + b + ": " + resultAdd);
        //test dodawania
        if(resultAdd==(a+b)) {
            System.out.println("Add test OK");
        } else {
            System.out.println("Error!");
        }

        a = 3;
        b = 2;
        int resultSubstract = calc.substract(a,b);

        System.out.println("\nWynik odejmowania " + b + " od " + a + ": " + resultSubstract);
        //test odejmowania
        if(resultSubstract==(a-b)) {
            System.out.println("Substract test OK");
        } else {
            System.out.println("Error!");
        }
    }
}