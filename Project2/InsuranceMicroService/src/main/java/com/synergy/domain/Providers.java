package com.synergy.domain;
import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Providers")
public class Providers {
	@Id
	@GeneratedValue
	private int insuranceId;
	private String providerName;
	private String imageurl;
	private String companyName;
	
	@ManyToMany
	private Set<ClientDetails> clientDetails = new HashSet<>();
	
	@ManyToMany
	private Set<InsuranceType> insuranceType = new HashSet<>();
	
	/**
	 * @return the insuranceId
	 */
	public int getInsuranceId() {
		return insuranceId;
	}

	/**
	 * @param insuranceId the insuranceId to set
	 */
	public void setInsuranceId(int insuranceId) {
		this.insuranceId = insuranceId;
	}

	/**
	 * @return the providerName
	 */
	public String getProviderName() {
		return providerName;
	}

	/**
	 * @param providerName the providerName to set
	 */
	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	/**
	 * @return the imageurl
	 */
	public String getImageurl() {
		return imageurl;
	}

	/**
	 * @param imageurl the imageurl to set
	 */
	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * @return the clientDetails
	 */
	public Set<ClientDetails> getClientDetails() {
		return clientDetails;
	}

	/**
	 * @param clientDetails the clientDetails to set
	 */
	public void setClientDetails(Set<ClientDetails> clientDetails) {
		this.clientDetails = clientDetails;
	}

	/**
	 * @return the insuranceType
	 */
	public Set<InsuranceType> getInsuranceType() {
		return insuranceType;
	}

	/**
	 * @param insuranceType the insuranceType to set
	 */
	public void setInsuranceType(Set<InsuranceType> insuranceType) {
		this.insuranceType = insuranceType;
	}

	/**
	 * @return the autoMakeModel
	 */
	public Set<AutoMakeAndModel> getAutoMakeModel() {
		return autoMakeModel;
	}

	/**
	 * @param autoMakeModel the autoMakeModel to set
	 */
	public void setAutoMakeModel(Set<AutoMakeAndModel> autoMakeModel) {
		this.autoMakeModel = autoMakeModel;
	}

	@ManyToMany
	private Set<AutoMakeAndModel> autoMakeModel = new HashSet<>();
	
	

	
	
	
	
	
}
