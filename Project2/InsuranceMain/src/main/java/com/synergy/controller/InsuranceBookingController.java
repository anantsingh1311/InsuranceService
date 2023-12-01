package com.synergy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InsuranceBookingController {
	
	@RequestMapping(value = "/InsuranceBooking")
	public String InsuranceBook() {
		return "InsuranceBooking";
	}

}
