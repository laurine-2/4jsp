package com.something.agency.dto;

import com.something.agency.entity.Purpose;

public class RealEstateDto {
	private double price;
	
	private  int bedroomNumber;
	private String description;
	private AgencyDto agencyDto;
	private Purpose purpose;
	public RealEstateDto(double price, int bedroomNumber, String description) {
		super();
		this.price = price;
		this.bedroomNumber = bedroomNumber;
		this.description = description;
	}
	
	
	
	public RealEstateDto() {
		super();
	}
	
	



	public RealEstateDto(double price) {
		super();
		this.price = price;
	}



	public RealEstateDto(double price, int bedroomNumber, String description, AgencyDto agencyDto) {
		super();
		this.price = price;
		this.bedroomNumber = bedroomNumber;
		this.description = description;
		this.agencyDto = agencyDto;
	}
	
	

	public RealEstateDto(double price, int bedroomNumber, String description, AgencyDto agencyDto, Purpose purpose) {
		super();
		this.price = price;
		this.bedroomNumber = bedroomNumber;
		this.description = description;
		this.agencyDto = agencyDto;
		this.purpose = purpose;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getBedroomNumber() {
		return bedroomNumber;
	}
	public void setBedroomNumber(int bedroomNumber) {
		this.bedroomNumber = bedroomNumber;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public AgencyDto getAgencyDto() {
		return agencyDto;
	}

	public void setAgencyDto(AgencyDto agencyDto) {
		this.agencyDto = agencyDto;
	}

	public Purpose getPurpose() {
		return purpose;
	}

	public void setPurpose(Purpose purpose) {
		this.purpose = purpose;
	}
	
	
	

}
