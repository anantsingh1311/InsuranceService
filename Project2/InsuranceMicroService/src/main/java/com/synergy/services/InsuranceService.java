package com.synergy.services;

import java.util.List;

import com.synergy.domain.AutoMakeAndModel;
import com.synergy.domain.InsuranceType;
import com.synergy.domain.Providers;

public interface InsuranceService {
	
	public List<Providers> searchProvider(String search); //To search for Auto-insurance provider
	public List<AutoMakeAndModel> findAutoModel();
	public List<InsuranceType> findInsuranceType();

}
