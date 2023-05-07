package com.something.agency.dto;

import java.util.List;


public class AgencyDto {
private String city;
	
	private List<RealEstateDto> realEstate;

	public AgencyDto(String city) {
		super();
		this.city = city;
	}
	
	

	public AgencyDto() {
		super();
	}



	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	

}
