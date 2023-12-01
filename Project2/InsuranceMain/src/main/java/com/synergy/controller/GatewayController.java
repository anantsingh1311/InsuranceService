package com.synergy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.synergy.component.InsuranceComponent;
import com.synergy.dto.EmailDetails;
import com.synergy.service.EmailServiceImpl;

@RestController
public class GatewayController {

	@Autowired
	InsuranceComponent insuranceComponent;

	@Autowired
	EmailServiceImpl emailsent;

	// To look for Insurance provider
	@RequestMapping(value = "/searchProvider/{searchString}", method = RequestMethod.GET)
	public JsonNode searchProvider(@PathVariable String searchString) {
		return insuranceComponent.searchProviderBySearchText(searchString);
	}

	// For the drop down menu to get the autoModel
	@RequestMapping(value = "/getAutoModel", method = RequestMethod.GET)
	public JsonNode findAutoModel() {
		return insuranceComponent.searchAutoModelAndMake();

	}

	// To get the insurance type
	@RequestMapping(value = "/getIsuranceType", method = RequestMethod.GET)
	public JsonNode findinsuranceType() {
		return insuranceComponent.searchInsurance();

	}

	// To send email to clients
	@RequestMapping(value = "/sendEmail", method = RequestMethod.POST)
	public String SendMail(@RequestBody EmailDetails email) {
		return emailsent.sendSimpleMail(email);
	}

	// To submit the details on the main insurance page
	@RequestMapping(value = "/saveBooking", method = RequestMethod.POST)
	public ResponseEntity<JsonNode> saveBooking(@RequestBody JsonNode json) {

		System.out.println("json:----" + json);
		JsonNode booking = insuranceComponent.saveBooking(json);
		System.out.println("booking:----" + booking);
		return new ResponseEntity<>(booking, HttpStatus.OK);

	}

	// To find the current booking and get them on the bookings page
	@RequestMapping(value = "/findBookingCurrent", method = RequestMethod.GET)
	public JsonNode findByBookingId() {
		// TODO Auto-generated method stub
		return insuranceComponent.findBookingCurrentId();
	}

	// tO FIND BOOKINGS THAT ARE COMPLETED
	@RequestMapping(value = "/findCompleted/{status}", method = RequestMethod.GET)
	public JsonNode CompletedBookings(@PathVariable String status) {

		return insuranceComponent.findBookingCompletedId(status);

	}
	@RequestMapping(value="/findCancelled/{status}", method= RequestMethod.GET)
	public JsonNode getCancelledBookings(@PathVariable String status) {
		return insuranceComponent.findBookingCancelledId(status); 
		
	}
	@RequestMapping(value="/cancelBooking/{bookingId}", method = RequestMethod.GET)
	public JsonNode cancelBooking(@PathVariable int bookingId) {
		return insuranceComponent.cancelBooking(bookingId);
	
	}

}
