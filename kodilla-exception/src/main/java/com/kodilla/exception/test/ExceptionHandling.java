package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(0,2);
        } catch (Exception e) {
            System.out.println("Numbers out fo range! Error: "+e);
        } finally {
            System.out.println("Process complete");
        }
    }
}
