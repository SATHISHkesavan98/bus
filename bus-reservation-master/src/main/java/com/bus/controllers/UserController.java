package com.bus.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bus.entities.User;
import com.bus.repos.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	UserRepository userRepository;

	@RequestMapping("/showRegister")
	public String showRegister() {
		
		return "login/registerUser";
		
	}
	
	@RequestMapping("/showLogin")
	public String showLogin() {
		
		return "login/login";
		
	}
	
	@RequestMapping("/registerUser")
	public String registerUser(@ModelAttribute("user") User user) {
		
		userRepository.save(user);
		
		return "login/login";
		
	}
	
	@RequestMapping("/login")
	public String login(@RequestParam("email") String email, @RequestParam("password") String password, ModelMap modelMap) {
		
		User user = userRepository.findByEmail(email);
		
//		if(user.getPassword().equals(password))
//			return "findBuses";
		if(user.getEmail().equals(email)) {
			if(user.getPassword().equals(password))
				return "findBuses";
			else
				modelMap.addAttribute("msg", "Password does not match. Try again");
		}
		else {
			modelMap.addAttribute("msg", "Email is not registered.");
		}
		
		return "login/login";
		
	}
	
	
}
