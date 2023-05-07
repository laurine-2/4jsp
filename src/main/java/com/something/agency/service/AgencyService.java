package com.something.agency.service;

import org.springframework.stereotype.Service;

import com.something.agency.dto.AgencyDto;
import com.something.agency.entity.Agency;
import com.something.agency.repository.AgencyRepository;

@Service
public class AgencyService {
	private AgencyRepository repos;

	public AgencyService(AgencyRepository repos) {
		super();
		this.repos = repos;
	}
	
	public int addAgency(AgencyDto agencyDto)
	{
		Agency agency = new Agency(agencyDto.getCity());
		return repos.save(agency).getIdA();				
	}
	public AgencyDto getAgency(int id) {
		
		Agency agency = repos.findById(id).get();
		return new AgencyDto(agency.getCity());
	}
	
	

}
