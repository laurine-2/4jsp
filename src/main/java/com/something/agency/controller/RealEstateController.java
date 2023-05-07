package com.something.agency.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.something.agency.dto.RealEstateDto;
import com.something.agency.service.RealEstateService;

@RestController

public class RealEstateController {
	private RealEstateService service;

	public RealEstateController(RealEstateService service) {
		super();
		this.service = service;
	}
	
	
    // TODO Update the price of a real estate
	@RequestMapping(value="/real-estate/{id}", method= RequestMethod.PATCH)
	public int updatePrice(@PathVariable("id") int id, @RequestBody RealEstateDto realEstateDto) {
		
		return service.updatePrice(id,realEstateDto.getPrice());
	}
	
}
