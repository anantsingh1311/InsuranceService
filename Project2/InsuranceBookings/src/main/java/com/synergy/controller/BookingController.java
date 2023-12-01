package com.synergy.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.synergy.domain.InsuranceBooking;
import com.synergy.service.BookingServiceImpl;

@RestController
public class BookingController {

	@Autowired
	BookingServiceImpl bookingService;

	@RequestMapping(value = "/saveBooking", method = RequestMethod.POST)
	public InsuranceBooking saveBooking(@RequestBody InsuranceBooking booking) {

		return bookingService.SaveBooking(booking);
	}

	@RequestMapping(value = "/findBookingCurrent", method = RequestMethod.GET)///Get to get the booking on bookings page
	public List<InsuranceBooking> findByBookingId() {
		// TODO Auto-generated method stub
		return bookingService.findByBookingId();
	}
	@RequestMapping(value = "/findCompleted/{status}", method = RequestMethod.GET)
	public List<InsuranceBooking> CompletedBookings(@PathVariable String status) {
		List<InsuranceBooking> booking = bookingService.findByStatus(status);
		List<InsuranceBooking> completed = new ArrayList<>();

		for (InsuranceBooking book : booking) {
			if (book.getStatus().equals("completed") || book.getStatus().equals("Completed")) {
				completed.add(book);
			}
		}
		return completed;
	}
	@RequestMapping(value="/findCancelled/{status}", method= RequestMethod.GET)
	public List<InsuranceBooking> getCancelledBookings(@PathVariable String status) {
		
		List<InsuranceBooking> newListCancelled = new ArrayList<>();
		
		List<InsuranceBooking> bookings = bookingService.findByStatus(status);
		
		for(InsuranceBooking booking:bookings) {
			if(booking.getStatus().equals("cancelled")) {
				newListCancelled.add(booking);
			}
		}
		
		return newListCancelled;
	}
	
	@RequestMapping(value="/cancelBooking/{bookingId}", method = RequestMethod.GET)
	public InsuranceBooking cancelBooking(@PathVariable int bookingId) {
		InsuranceBooking booking =  bookingService.findByID(bookingId);
		booking.setStatus("cancelled");
		return bookingService.SaveBooking(booking);
		//return booking;
	}

}
