package com.synergy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synergy.domain.AutoMakeAndModel;
import com.synergy.domain.InsuranceType;
import com.synergy.domain.Providers;
import com.synergy.repository.AutoModelRepository;
import com.synergy.repository.InsuranceRepository;
import com.synergy.repository.InsuranceTypeRepository;

@Service
public class InsuranceServiceImpl implements InsuranceService {
	
	@Autowired
	InsuranceRepository insuranceRepository;
	
	@Autowired
	AutoModelRepository automodelrepository;
	
	@Autowired
	InsuranceTypeRepository insurancetyperepository;

	@Override
	public List<Providers> searchProvider(String search) {
		// TODO Auto-generated method stub
		search = "%"+search+"%";
		
		return insuranceRepository.findByProviderNameLike(search); // to find by name
		
	}

	@Override
	public List<AutoMakeAndModel> findAutoModel() { // to find by AutoModel
		// TODO Auto-generated method stub
		return automodelrepository.findAll();
	}

	@Override
	public List<InsuranceType> findInsuranceType() { // to find by InsuranceType
		// TODO Auto-generated method stub
		return insurancetyperepository.findAll();
	}
}
