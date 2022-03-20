package com.example.ams.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ams.beans.City;
import com.example.ams.dao.CityDao;
import com.example.ams.services.CityService;

@Service
public class CityServiceImpl implements CityService{
	
	@Autowired
	CityDao dao;

	public CityDao getDao() {
		return dao;
	}

	public void setDao(CityDao dao) {
		this.dao = dao;
	}

	
	public City addCity(City c) {
		return dao.addCity(c);
	}

	
	public City findCityById(int cityId) {
		City c = dao.findCityById(cityId);
		return c;
	}


	public List<City> listAllCity() {
		List<City> city = dao.listAllCity();
		return city;
	}

}
