package com.synergy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.synergy.domain.AutoMakeAndModel;
import com.synergy.domain.InsuranceType;
import com.synergy.domain.Providers;
import com.synergy.services.InsuranceService;

@RestController
public class InsuranceController {

	@Autowired
	InsuranceService service;
	
	@RequestMapping(value = "/searchProvider/{searchString}", method = RequestMethod.GET)
	public List<Providers> searchProvider(@PathVariable String searchString){
		return service.searchProvider(searchString);
	}
	
	@RequestMapping(value ="/getAutoModel/", method = RequestMethod.GET)
	public List<AutoMakeAndModel> findAutoModel(){
		return service.findAutoModel();
		
	}
	
	@RequestMapping(value ="/getIsuranceType/", method = RequestMethod.GET)
	public List<InsuranceType> findinsuranceType(){
		return service.findInsuranceType();
		
	}
}
