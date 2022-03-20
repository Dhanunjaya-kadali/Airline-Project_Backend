package com.example.ams.services;

import java.util.List;

import com.example.ams.beans.Passengers;

public interface PassengerService {
	
	public abstract String addPassengers(Passengers p);
	
	public abstract Passengers findPassengerById(String passId);
	
	public abstract List<Passengers> listAllPassengers();
	
	public String updateFirstName(String passId,String fName);

	public abstract String deleteById(String passId);
}
