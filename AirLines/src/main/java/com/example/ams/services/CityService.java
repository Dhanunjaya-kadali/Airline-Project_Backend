package com.example.ams.services;

import java.util.List;

import com.example.ams.beans.City;

public interface CityService {
	
	public abstract City addCity(City c);
	
	public abstract City findCityById(int cityId);
	
	public List<City> listAllCity();

}
