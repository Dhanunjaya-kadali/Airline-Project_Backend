package com.example.ams.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.ams.beans.SeatSelect;

@Repository
public class SeatSelectDaoImpl implements SeatSelectDao {
	
	@PersistenceContext
	EntityManager em;

	
	@Transactional
	public long addSeatSelect(SeatSelect seatSelect) {
		em.persist(seatSelect);
		return seatSelect.getSeatNumber();
	}

	
	public SeatSelect findSeatById(long seatNumber) {
		SeatSelect ad = em.find(SeatSelect.class, seatNumber);
	  	 return ad;
	}

	
	public List<SeatSelect> listAllSeatSelect() {
		String sql = "Select a from SeatSelect a";
		Query qry = em.createQuery(sql);
		List<SeatSelect> seatSelect = qry.getResultList();
		//System.out.println(flight);
		return seatSelect;
	}


	@Transactional
	public long deleteSeatById(long seatNumber) {
		SeatSelect ad = em.find(SeatSelect.class, seatNumber);
		em.remove(ad);
		return ad.getSeatNumber();
	}


}
