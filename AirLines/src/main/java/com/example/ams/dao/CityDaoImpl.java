package com.example.ams.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.ams.beans.City;
import com.example.ams.dao.CityDao;

@Repository
public class CityDaoImpl implements CityDao{

	@PersistenceContext
	EntityManager em;
	

	@Transactional
	public City addCity(City c) {
		em.persist(c);
		return c;
	}

	
	public City findCityById(int cityId) {
		City city = em.find(City.class, cityId);
		return city;
	}

	
	public List<City> listAllCity() {
		String sql = "Select c from City c";
		Query qry = em.createQuery(sql);
		List<City> city = qry.getResultList();
		//System.out.println(flight);
		return city;
	}

}