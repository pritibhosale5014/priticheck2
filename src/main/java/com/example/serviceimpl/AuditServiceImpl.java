package com.example.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Address;
import com.example.model.AuditDetails;
import com.example.repository.AddressRepository;
import com.example.repository.AuditRepository;
import com.example.service.AuditService;
@Service
public class AuditServiceImpl implements AuditService{

	@Autowired
	private AuditRepository pri;
	
	@Autowired
	private AddressRepository ari;
	
	@Override
	public AuditDetails saveAudit(AuditDetails p) {
		AuditDetails audit=pri.save(p);
		return audit;
	}

	@Override
	public List<AuditDetails> getallAudit() {
		List<AuditDetails> list=pri.findAll();
		return list;
	}

	@Override
	public AuditDetails getAuditByid(int aid) {
		Optional<AuditDetails> optional=pri.findById(aid);
		return optional.get();
	}

	@Override
	public AuditDetails updateaudit(AuditDetails p) {
		AuditDetails au=pri.save(p);
		return au;
	}

	@Override
	public void deleteaudit(int aid) {
		pri.deleteById(aid);
	}
	//=================================================

	@Override
	public Address saveAddress(Address a) {
		Address ad=ari.save(a);
		return ad;
	}

	@Override
	public Address updateadderss(Address p) {
	Address ad=ari.save(p);
	return ad;
		
	}

	@Override
	public List<Address> getallAddress() {
		List<Address> list=ari.findAll();
		return list;
	}
	
	

}
