package com.example.ams.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="SEAT_SELECT")
public class SeatSelect {

	@Id
	@Column(name="SEAT_NUMBER")
	private long seatNumber;
	
	@Column(name="FLIGHT_NUMBER")
	private long flightNumber;
	
	@Column(name="SEAT_TYPE")
	private String seatType;
	
	@Column(name="SEAT_COST")
	private long seatCost;

	public long getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(long seatNumber) {
		this.seatNumber = seatNumber;
	}

	public long getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(long flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getSeatType() {
		return seatType;
	}

	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}

	public long getSeatCost() {
		return seatCost;
	}

	public void setSeatCost(long seatCost) {
		this.seatCost = seatCost;
	}

	@Override
	public String toString() {
		return "SeatSelect [seatNumber=" + seatNumber + ", flightNumber=" + flightNumber + ", seatType=" + seatType
				+ ", seatCost=" + seatCost + "]";
	}

	public SeatSelect(long seatNumber, long flightNumber, String seatType, long seatCost) {
		super();
		this.seatNumber = seatNumber;
		this.flightNumber = flightNumber;
		this.seatType = seatType;
		this.seatCost = seatCost;
	}
	
	public SeatSelect() {
		
	}
}
