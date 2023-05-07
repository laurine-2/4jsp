package com.something.agency.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.something.agency.entity.Agency;
@Repository
public interface AgencyRepository extends JpaRepository<Agency, Integer>{

}
