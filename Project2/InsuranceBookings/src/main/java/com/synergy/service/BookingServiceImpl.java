package com.synergy.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synergy.domain.InsuranceBooking;
import com.synergy.repository.BookingRepository;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	BookingRepository bookingrepository;

	@Override
	public InsuranceBooking SaveBooking(InsuranceBooking booking) {
		// TODO Auto-generated method stub
		return bookingrepository.save(booking);
	}

	@Override
	public List<InsuranceBooking> findByBookingId() {
		// TODO Auto-generated method stub
		return bookingrepository.findAll();
	}

	@Override
	public InsuranceBooking findByID(int id) {
		// TODO Auto-generated method stub
		return bookingrepository.findByBookingId(id);
	}

	@Override
	public List<InsuranceBooking> findByStatus(String status) {
		// TODO Auto-generated method stub
		return bookingrepository.findByStatus(status);
	}

	
	

}
