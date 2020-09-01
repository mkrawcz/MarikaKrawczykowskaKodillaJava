package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
       SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(15, 15);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("I'm gonna be here... always!");
        }

    }
}
