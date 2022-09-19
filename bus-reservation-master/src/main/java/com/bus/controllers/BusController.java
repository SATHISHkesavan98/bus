package com.bus.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bus.entities.Bus;
import com.bus.repos.BusRepository;

@Controller
public class BusController {
	
	@Autowired
	BusRepository busRepository;

//	@RequestMapping("/findBuses")
//	public String findBuses(@RequestParam("from") String from, @RequestParam("to") String to, 
//			@RequestParam("departureDate") @DateTimeFormat(pattern="mm-dd-yyyy") Date departureDate, ModelMap modelMap) {
//		
//		busRepository.findBuses(from, to, departureDate);
//		
//		return "";
//		
//	}
	
	@RequestMapping("/findBuses")
	public String findBuses(@RequestParam("from") String from, @RequestParam("to") String to, 
			@RequestParam("departureDate") @DateTimeFormat(pattern="MM-dd-yyyy") Date departureDate, ModelMap modelMap) {
		
		List<Bus> buses = busRepository.findBuses(from, to, departureDate);
		modelMap.addAttribute("buses", buses);
		
		return "displayTrips";
	}
}
