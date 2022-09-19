package com.bus.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus.entities.Bus;
import com.bus.entities.Passenger;
import com.bus.entities.Reservation;
import com.bus.repos.BusRepository;
import com.bus.repos.PassengerRepository;
import com.bus.repos.ReservationRepository;
import com.bus.util.EmailUtil;
import com.bus.util.PdfGenerator;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	BusRepository busRepository;
	
	@Autowired
	PassengerRepository passengerRepository;
	
	@Autowired
	ReservationRepository reservationRepository;
	
	@Autowired
	PdfGenerator pdfGenerator;
	
	@Autowired
	EmailUtil emailUtil;
	
	@Override
	public Reservation bookTrip(Bus bus, Passenger passenger) {
		
		Reservation reservation = new Reservation();
		reservation.setBus(bus);
		reservation.setPassenger(passenger);
		reservation.setCheckedIn(false);
		Reservation savedReservation = reservationRepository.save(reservation);
		
		String filePath = "D:/Azad/Documents/reservations/reservation"+savedReservation.getId()+".pdf";
		pdfGenerator.generateItinerary(savedReservation, filePath);
		emailUtil.sendItinerary(passenger.getEmail(), filePath);
		
		return savedReservation;
	}

}
