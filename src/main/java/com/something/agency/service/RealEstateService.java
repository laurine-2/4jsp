package com.something.agency.service;

import org.springframework.stereotype.Service;

import com.something.agency.dto.AgencyDto;
import com.something.agency.dto.RealEstateDto;
import com.something.agency.entity.Agency;
import com.something.agency.entity.Purpose;
import com.something.agency.entity.RealEstate;
import com.something.agency.repository.RealEstateRepository;

@Service
public class RealEstateService {
	private RealEstateRepository repos;

	public RealEstateService(RealEstateRepository repos) {
		super();
		this.repos = repos;
	}
	
	public int addRealEstate(RealEstateDto realEstateDto) {
		RealEstate realEstate = new RealEstate(realEstateDto.getPrice(), realEstateDto.getPurpose(), realEstateDto.getBedroomNumber(),realEstateDto.getDescription(), new Agency(realEstateDto.getAgencyDto().getCity()));
				
		return repos.save(realEstate).getId();
		
	}
	public int updatePrice(int id, double price) {
	
	RealEstate realEstate = repos.findById(id).get();
	realEstate.setPrice(price);
	return repos.save(realEstate).getId();
	}
	

}
