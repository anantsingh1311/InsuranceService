package com.synergy.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="AutoModel")
public class AutoMakeAndModel {
	
	@Id
	@GeneratedValue
	private int auid;
	private String autoModel;
	private int year;
	private double discount;
	/**
	 * @return the autoMake
	 */
	/**
	 * @return the autoModel
	 */
	public String getAutoModel() {
		return autoModel;
	}
	/**
	 * @param autoModel the autoModel to set
	 */
	public void setAutoModel(String autoModel) {
		this.autoModel = autoModel;
	}
	/**
	 * @return the autoYear
	 */
	/**
	 * @return the discount
	 */
	public double getDiscount() {
		return discount;
	}
	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	

}
