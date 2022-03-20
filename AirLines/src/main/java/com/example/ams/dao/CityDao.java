package com.example.ams.dao;

import java.util.List;

import com.example.ams.beans.City;

public interface CityDao {
	
public abstract City addCity(City c);
	
	public abstract City findCityById(int cityId);
	
	public List<City> listAllCity();

}
