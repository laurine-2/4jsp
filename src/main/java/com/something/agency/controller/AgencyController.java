package com.something.agency.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.something.agency.dto.AgencyDto;
import com.something.agency.dto.RealEstateDto;
import com.something.agency.entity.Agency;
import com.something.agency.service.AgencyService;
import com.something.agency.service.RealEstateService;
@RestController
public class AgencyController {
	private AgencyService agencyService;
	private RealEstateService realEstateService;

	public AgencyController(AgencyService agencyService,RealEstateService realEstateService) {
		super();
		this.agencyService = agencyService;
		this.realEstateService=realEstateService;
	}
	
    // TODO Add an agency
	@RequestMapping(value="/agencies", method = RequestMethod.POST)
	public int addAgency(@RequestBody AgencyDto agencyDto) {
		return agencyService.addAgency(agencyDto);
	}

    // TODO Get an agency
	@RequestMapping(value="/agencies/{id}", method = RequestMethod.GET)
	public AgencyDto getAgency(@PathVariable("id") int id) {
		
		
		
		return agencyService.getAgency(id);
	}
	
	// TODO Add a real estate to an agency
	
	@RequestMapping(value="/agencies/{id}/real-estates", method = RequestMethod.POST)
	public int addRealEstates(@PathVariable("id") int id,@RequestBody RealEstateDto real) {
		AgencyDto agency=agencyService.getAgency(id);
		real.setAgencyDto(agency);
		return realEstateService.addRealEstate(real);
		
	}

    
	
}
