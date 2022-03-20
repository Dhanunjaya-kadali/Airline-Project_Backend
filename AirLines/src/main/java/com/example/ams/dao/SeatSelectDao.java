package com.example.ams.dao;

import java.util.List;

import com.example.ams.beans.SeatSelect;

	public interface SeatSelectDao {

	public abstract long addSeatSelect(SeatSelect seatSelect);
	
	public abstract SeatSelect findSeatById(long seatNumber);
	
	public List<SeatSelect> listAllSeatSelect();
	
	public abstract long deleteSeatById(long seatNumber);
}
