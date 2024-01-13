package com.gridnine.testing.service;

import com.gridnine.testing.models.Flight;

import java.util.List;

public interface Filter {
    List<Flight> build();

    Filter departure();

    Filter arrival();

    Filter interval();
}
