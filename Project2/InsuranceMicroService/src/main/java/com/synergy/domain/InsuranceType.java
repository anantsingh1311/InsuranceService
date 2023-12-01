package com.synergy.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="InsuranceType")
public class InsuranceType {

	@Id
	private int iid;
	private String insurancetype;
	private double cost;
	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}
	/**
	 * @param cost the cost to set
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}
	/**
	 * @return the i_id
	 */
	public int getI_id() {
		return iid;
	}
	/**
	 * @param i_id the i_id to set
	 */
	public void setI_id(int i_id) {
		this.iid = i_id;
	}
	/**
	 * @return the insurance_type
	 */
	public String getInsurance_type() {
		return insurancetype;
	}
	/**
	 * @param insurance_type the insurance_type to set
	 */
	public void setInsurance_type(String insurance_type) {
		this.insurancetype = insurance_type;
	}
	
}
