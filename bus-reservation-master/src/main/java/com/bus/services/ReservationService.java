package com.bus.services;

import com.bus.entities.Bus;
import com.bus.entities.Passenger;
import com.bus.entities.Reservation;

public interface ReservationService {

	public Reservation bookTrip(Bus bus, Passenger passenger);
}
