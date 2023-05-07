package com.something.agency.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="agencies")
public class Agency {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idA;
	@Column
	private String city;
	
	@OneToMany(mappedBy ="agency", cascade = CascadeType.ALL)
	private List<RealEstate> realEstate;

	public Agency() {
		super();
	}
	
	

	public Agency(String city, List<RealEstate> realEstate) {
		super();
		this.city = city;
		this.realEstate = realEstate;
	}



	public Agency(String city) {
		super();
		this.city = city;
	}

	public int getIdA() {
		return idA;
	}

	public void setIdA(int idA) {
		this.idA = idA;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<RealEstate> getRealEstate() {
		return realEstate;
	}

	public void setRealEstate(List<RealEstate> realEstate) {
		this.realEstate = realEstate;
	}
	

	
	
	
	

}
