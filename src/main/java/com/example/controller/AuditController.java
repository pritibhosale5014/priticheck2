package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Address;
import com.example.model.AuditDetails;
import com.example.service.AuditService;

@CrossOrigin("*")
@RestController
public class AuditController 
{
			@Autowired
			private AuditService psi;
			
			@PostMapping(value = "/savedata")
			public String savedata(@RequestBody AuditDetails p)
			{
				AuditDetails au=psi.saveAudit(p);
				return "Save To DB";
			}
			
			@GetMapping("/allaudit")
			public List<AuditDetails> getAudit()
			{
				List<AuditDetails> all=psi.getallAudit();
				return all;
			}
			
			@GetMapping("/audits/{aid}")
			public AuditDetails getAuditByid(@PathVariable int aid) 
			{
				AuditDetails au=psi.getAuditByid(aid);
				return au;
			}
			
			@PutMapping("/updateData/{aid}")
			public void updateAudit(@RequestBody AuditDetails p, @PathVariable int aid) 
			{	
				p.setAid(aid);
				psi.updateaudit(p);
				System.out.println("backend.."+p.toString());	
			}
			
			@DeleteMapping("/delete/{aid}")
			public String deleteaudit(@PathVariable int aid) 
			{
				psi.deleteaudit(aid);
				return "audit Deleted";
			}
			
			//==============================Address===================================
			
			@PostMapping("/saveaddr")
			public String saveAddress(@RequestBody Address a)
			{
				Address ad=psi.saveAddress(a);
				return "data saved";
				
			}
			
			@PutMapping("/updateAddr/{adrid}")
			public void updateAddress(@RequestBody Address p, @PathVariable int adrid) 
			{	
				p.setAdrid(adrid);
				psi.updateadderss(p);
				System.out.println("backend.."+p.toString());	
			}
			
			
			@GetMapping("/alladdr")
			public List<Address> getaddr()
			{
				List<Address> all=psi.getallAddress();
				return all;
			}
}
