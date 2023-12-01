package com.synergy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.synergy.domain.InsuranceBooking;

public interface BookingRepository extends JpaRepository<InsuranceBooking, Integer> {
	
	public InsuranceBooking findByBookingId(int bookingId); 
	public List<InsuranceBooking> findByStatus(String status);

}
