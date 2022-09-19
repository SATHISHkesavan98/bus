package com.bus.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bus.entities.Bus;
import com.bus.entities.Passenger;
import com.bus.entities.Reservation;
import com.bus.repos.BusRepository;
import com.bus.repos.PassengerRepository;
import com.bus.services.ReservationService;

@Controller
public class ReservationController {
	
	@Autowired
	BusRepository busRepository;
	
	@Autowired
	PassengerRepository passengerRepository;
	
	@Autowired
	ReservationService reservationService;

	@RequestMapping("/showReservationWithPassenger")
	public String showReservationWithPassenger(@RequestParam("busid")Long busid, ModelMap modelMap) {
		
		Bus bus = busRepository.findById(busid).orElse(null);
		modelMap.addAttribute("bus", bus);
		
		return "reservationWithPassenger";
		
	}
//	public String showReservationWithPassenger(@RequestParam("busid")Long busid, 
//			@ModelAttribute("passenger")Passenger passenger, ModelMap modelMap) {
//		
//		passengerRepository.save(passenger);
//		Bus bus = busRepository.findById(busid).orElse(null);
//		modelMap.addAttribute("bus", bus);
//		modelMap.addAttribute("passenger", passenger);
//		
//		return "reservationWithPassenger";
//		
//	}
	
	@RequestMapping("/showReservationWithCard")
	public String showReservationWithCard(@RequestParam("busid")Long busid, @ModelAttribute("passenger")Passenger passenger,
			ModelMap modelMap) {
		
		Bus bus = busRepository.findById(busid).orElse(null);
		Passenger savedPassenger = passengerRepository.save(passenger);
		modelMap.addAttribute("bus", bus);
		modelMap.addAttribute("passenger", savedPassenger);
		
		return "reservationWithCard";
		
	}
	
	@RequestMapping("/completeReservation")
	public String completeReservation(@RequestParam("busid")Long busid, @RequestParam("passengerid")Long passengerid, 
			ModelMap modelMap) {
		
		Bus bus = busRepository.findById(busid).orElse(null);
		Passenger passenger = passengerRepository.findById(passengerid).orElse(null);
		Reservation reservation = reservationService.bookTrip(bus, passenger);
		
//		Reservation reservation = reservationService.bookTrip(request);
		modelMap.addAttribute("msg", "Reservation completed with id " + reservation.getId());
		
		return "reservationConfirmation";
		
	}
}
