package com.example.ams.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ams.beans.Flight;
import com.example.ams.dao.FlightDao;

@Service("flightService")
public class FlightServicesImpl implements FlightServices {

	@Autowired
	FlightDao dao;
	
	public FlightDao getDao() {
		return dao;
	}

	public void setDao(FlightDao dao) {
		this.dao = dao;
	}

	
	public long addFlight(Flight flight) {
		long fl = dao.addFlight(flight);
		return fl;
	}

	
	public Flight findFlightById(long flightNumber) {
		Flight ad = dao.findFlightById(flightNumber);
		return ad;
	}

	
	public List<Flight> listAllFlight() {
		List<Flight> ad = dao.listAllFlight();
		return ad;
	}

	
	public long updateFlight(long flightNumber, String from) {
		long flight = dao.updateFlight(flightNumber, from);
		return flight;
	}

	public long deleteById(long flightNumber) {
		long del = dao.deleteById(flightNumber);
		return del;
	}

	
}
