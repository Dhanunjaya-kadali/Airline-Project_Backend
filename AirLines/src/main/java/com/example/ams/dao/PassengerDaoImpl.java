package com.example.ams.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.ams.beans.Passengers;
import com.example.ams.dao.PassengerDao;

@Repository
public class PassengerDaoImpl implements PassengerDao {
     
	@PersistenceContext
	EntityManager em;
	

	@Transactional
	public String addPassengers(Passengers p) {
		em.persist(p);
		return p.getPassId();
		
	}

	
	public Passengers findPassengerById(String passId) {
		Passengers p=em.find(Passengers.class,passId);
		return p;
	}

	
	public List<Passengers> listAllPassengers() {
		String sql="Select p From Passengers p";
		Query qry=em.createQuery(sql);
		List<Passengers> passList=qry.getResultList();
		//System.out.println("On do server: "+passList);
		return passList;
	}


	@Transactional
	public String updateFirstName(String passId, String fName) {
		Passengers pass =em.find(Passengers.class,passId);
		pass.setfName(fName);
		em.merge(pass);
		return pass.getfName();
	}

	
	@Transactional
	public String deleteById(String passId) {
		Passengers p=em.find(Passengers.class,passId);
		 em.remove(p);
		return p.getPassId(); 
		
	}

}