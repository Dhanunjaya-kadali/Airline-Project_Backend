package com.example.ams.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.ams.beans.Flight;

@Repository
public class FlightDaoImpl implements FlightDao {
	
	@PersistenceContext
	EntityManager em;

	
	@Transactional
	public long addFlight(Flight flight) {
		em.persist(flight);
		return flight.getFlightNumber();
	}

	
	public Flight findFlightById(long flightNumber) {
		Flight fl = em.find(Flight.class, flightNumber);
	  	 return fl;
	}

	
	public List<Flight> listAllFlight() {
		String sql = "Select f from Flight f";
		Query qry = em.createQuery(sql);
		List<Flight> flight = qry.getResultList();
		//System.out.println(flight);
		return flight;
	}


	@Transactional
	public long updateFlight(long flightNumber, String from) {
		Flight ad = em.find(Flight.class, flightNumber);
		ad.setFrom(from);
		em.merge(ad);
		return ad.getFlightNumber();
	}

	@Transactional
	public long deleteById(long flightNumber) {
		Flight fn = em.find(Flight.class, flightNumber);
		em.remove(fn);
		return fn.getFlightNumber();
	}

}
