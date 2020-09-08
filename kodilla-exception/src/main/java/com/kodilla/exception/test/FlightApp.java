package com.kodilla.exception.test;

public class FlightApp {

    public static void main(String[] args) {

        FlightSchedule flightSchedule = new FlightSchedule();

        Flight flight = new Flight("Warsaw Chopin", "Rio de Janeiro Galeao");

        try {
            boolean found = flightSchedule.findFlight(flight);

            if (found) {
                System.out.println("Ok");
            } else {
                System.out.println("Bad");
            }
        } catch (RouteNotFoundException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }

}
