package com.something.agency.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.something.agency.entity.RealEstate;

@Repository
public interface RealEstateRepository extends JpaRepository<RealEstate, Integer>{

}
