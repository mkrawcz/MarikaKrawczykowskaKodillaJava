package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSchedule {

    private Map<String, Boolean> possibilityOfFlight;

    public FlightSchedule () {
        possibilityOfFlight = new HashMap<>();
        possibilityOfFlight.put("Rio de Janeiro Galeao", false);
        possibilityOfFlight.put("Zurich Airport", false);
        possibilityOfFlight.put("Warsaw Chopin", true);
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        String arrival = flight.getArrivalAirport();
        if (!possibilityOfFlight.containsKey(arrival)) {
            throw new RouteNotFoundException(flight);
        }

        return possibilityOfFlight.get(arrival);
    }

    /*public boolean findFlight(Flight flight) throws RouteNotFoundException {
        String arrivalAirport = flight.getArrivalAirport();
        Boolean result = possibilityOfFlight.get(arrivalAirport);

        if (result == null) {
            throw new RouteNotFoundException(flight);
        }

        return result;
    }*/

}
