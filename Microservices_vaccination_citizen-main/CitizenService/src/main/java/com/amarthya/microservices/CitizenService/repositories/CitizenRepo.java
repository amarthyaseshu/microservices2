package com.amarthya.microservices.CitizenService.repositories;

import java.util.List;

import com.amarthya.microservices.CitizenService.Entity.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitizenRepo extends JpaRepository<Citizen, Integer>{
	
	public List<Citizen> findByVaccinationCenterId(Integer id);

}
