package com.synergy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.synergy.domain.InsuranceType;

public interface InsuranceTypeRepository extends JpaRepository<InsuranceType, Integer> {

}
