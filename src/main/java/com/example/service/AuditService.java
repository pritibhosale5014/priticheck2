package com.example.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.model.Address;
import com.example.model.AuditDetails;

public interface AuditService {

		public AuditDetails saveAudit(AuditDetails p);
		
		public List<AuditDetails> getallAudit();
		
		public AuditDetails getAuditByid(int aid);
	
		public AuditDetails updateaudit(AuditDetails p);
	
		public void deleteaudit(int aid);
		
		//===============================

		public Address saveAddress(Address a);

		public Address updateadderss(Address p);

		public List<Address> getallAddress();
}
