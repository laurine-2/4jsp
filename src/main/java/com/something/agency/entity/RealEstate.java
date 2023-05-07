package com.something.agency.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="realEstate")
public class RealEstate {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private double price;
	@Enumerated(EnumType.STRING)
	public Purpose purpose;
	@Column
	private int bedroomNumber;
	@Column
	private String description;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
	private Agency agency;

	public RealEstate() {
		super();
	}

	public RealEstate(double price, Purpose purpose, int bedroomNumber, String description) {
		super();
		this.price = price;
		this.purpose = purpose;
		this.bedroomNumber = bedroomNumber;
		this.description = description;
	}
	

	public RealEstate(double price, Purpose purpose, int bedroomNumber, String description, Agency agency) {
		super();
		this.price = price;
		this.purpose = purpose;
		this.bedroomNumber = bedroomNumber;
		this.description = description;
		this.agency = agency;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Purpose getPurpose() {
		return purpose;
	}

	public void setPurpose(Purpose purpose) {
		this.purpose = purpose;
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

	

}
