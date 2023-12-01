package com.synergy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.synergy.domain.AutoMakeAndModel;

public interface AutoModelRepository extends JpaRepository<AutoMakeAndModel, Integer> {
	
}
