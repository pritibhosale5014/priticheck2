package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Address;
import com.example.model.AuditDetails;
@Repository
public interface AuditRepository extends JpaRepository<AuditDetails, Integer>{

	

	

}
