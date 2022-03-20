package com.example.ams.services;

import java.util.List;

import com.example.ams.beans.Flight;

public interface FlightServices {
	
	public abstract long addFlight(Flight flight);
	
	public abstract Flight findFlightById(long flightNumber);
	
	
	public List<Flight> listAllFlight();
	
	public abstract long updateFlight(long flightNumber, String from);
	
	public abstract long deleteById(long flightNumber);

}
