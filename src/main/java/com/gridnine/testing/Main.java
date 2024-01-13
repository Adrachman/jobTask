package com.gridnine.testing;

import com.gridnine.testing.models.Flight;
import com.gridnine.testing.models.FlightBuilder;
import com.gridnine.testing.service.FilterImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Flight> flights = FlightBuilder.createFlights();
        List<Flight> departure = new FilterImpl(flights)
                .departure()
                .build();
        List<Flight> arrival = new FilterImpl(flights)
                .arrival()
                .build();
        List<Flight> interval = new FilterImpl(flights)
                .interval()
                .build();


        System.out.println("Unfiltered flies " + flights);
        System.out.println("Departure to the current point in time " + departure);
        System.out.println("Arrival date is earlier than departure date " + arrival);
        System.out.println("Interval between arrival of one segment and departure " + interval);
    }
}