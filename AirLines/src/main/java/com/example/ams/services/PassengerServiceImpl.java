package com.example.ams.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ams.beans.Passengers;
import com.example.ams.dao.PassengerDao;
import com.example.ams.services.PassengerService;

@Service("passService")
public class PassengerServiceImpl implements PassengerService{

	
	@Autowired
	PassengerDao dao;
	
	public PassengerDao getDao() {
		return dao;
	}

	public void setDao(PassengerDao dao) {
		this.dao = dao;
	}
	
	
	 public String addPassengers(Passengers p) {
		  System.out.println("Service layer");
		  String passId= dao.addPassengers(p);
		  return passId;
	  }

	
	public Passengers findPassengerById(String passId) {
		Passengers p= dao.findPassengerById(passId);
		return p;
	}

	
	public List<Passengers> listAllPassengers() {
		List<Passengers> passList=dao.listAllPassengers();
		return passList ;
	}


	public String updateFirstName(String passId, String fName) {
		String fn=dao.updateFirstName(passId,fName);
		return fn;
	}

	
	public String deleteById(String passId) {
	String p=dao.deleteById(passId);
	return p;
		
	}
}
