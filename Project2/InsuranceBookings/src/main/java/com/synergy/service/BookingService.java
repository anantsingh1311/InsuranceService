package com.synergy.service;

import java.util.List;

import com.synergy.domain.InsuranceBooking;

public interface BookingService {

	public InsuranceBooking SaveBooking(InsuranceBooking booking);
	public List<InsuranceBooking> findByBookingId();
	public InsuranceBooking findByID(int id);
	public List<InsuranceBooking> findByStatus(String status);
}
