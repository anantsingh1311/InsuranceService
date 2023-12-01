package com.synergy.domain;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class InsuranceBooking {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bookingId;
	private String firstName;
	private String lastName;
	private int age;
	private String city;
	private String state;
	private String adress1;
	private String adress2;
	private String doyouHaveInsurance;
	private String dateofInsurance;
	private String carMakeModel;
	private String insuranceType;
	private String emailId;
	private String status; // To get the status of booking
	
	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}
	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	/**
	 * @return the bookingId
	 */
	public int getBookingId() {
		return bookingId;
	}
	/**
	 * @param bookingId the bookingId to set
	 */
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the adress1
	 */
	public String getAdress1() {
		return adress1;
	}
	/**
	 * @param adress1 the adress1 to set
	 */
	public void setAdress1(String adress1) {
		this.adress1 = adress1;
	}
	/**
	 * @return the adress2
	 */
	public String getAdress2() {
		return adress2;
	}
	/**
	 * @param adress2 the adress2 to set
	 */
	public void setAdress2(String adress2) {
		this.adress2 = adress2;
	}
	/**
	 * @return the doyouHaveInsurance
	 */
	public String getDoyouHaveInsurance() {
		return doyouHaveInsurance;
	}
	/**
	 * @param doyouHaveInsurance the doyouHaveInsurance to set
	 */
	public void setDoyouHaveInsurance(String doyouHaveInsurance) {
		this.doyouHaveInsurance = doyouHaveInsurance;
	}
	/**
	 * @return the dateofInsurance
	 */
	public String getDateofInsurance() {
		return dateofInsurance;
	}
	/**
	 * @param dateofInsurance the dateofInsurance to set
	 */
	public void setDateofInsurance(String dateofInsurance) {
		this.dateofInsurance = dateofInsurance;
	}
	/**
	 * @return the carMakeModel
	 */
	public String getCarMakeModel() {
		return carMakeModel;
	}
	/**
	 * @param carMakeModel the carMakeModel to set
	 */
	public void setCarMakeModel(String carMakeModel) {
		this.carMakeModel = carMakeModel;
	}
	/**
	 * @return the insuranceType
	 */
	public String getInsuranceType() {
		return insuranceType;
	}
	/**
	 * @param insuranceType the insuranceType to set
	 */
	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
	
	
	
	

}
