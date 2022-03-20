package com.example.ams.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ams.beans.SeatSelect;
import com.example.ams.dao.SeatSelectDao;

@Service("seatSelectService")
public class SeatSelectServicesImpl implements SeatSelectServices {

	@Autowired
	SeatSelectDao dao;
	
	
	public SeatSelectDao getDao() {
		return dao;
	}

	public void setDao(SeatSelectDao dao) {
		this.dao = dao;
	}

	
	public long addSeatSelect(SeatSelect seatSelect) {
		long ad = dao.addSeatSelect(seatSelect);
		return ad;
	}

	
	public SeatSelect findSeatById(long seatNumber) {
		SeatSelect ad = dao.findSeatById(seatNumber);
		return ad;
	}

	
	public List<SeatSelect> listAllSeatSelect() {
		List<SeatSelect> ad = dao.listAllSeatSelect();
		return ad;
	}


	public long deleteSeatById(long seatNumber) {
		long del = dao.deleteSeatById(seatNumber);
		return del;
	}

}
