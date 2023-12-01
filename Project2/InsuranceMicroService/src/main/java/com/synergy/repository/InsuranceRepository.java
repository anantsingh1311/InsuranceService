package com.synergy.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.synergy.domain.AutoMakeAndModel;
import com.synergy.domain.Providers;

@Repository
public interface InsuranceRepository extends JpaRepository<Providers, Integer> {
	
public List<Providers> findByProviderNameLike(String providerName); 

}
