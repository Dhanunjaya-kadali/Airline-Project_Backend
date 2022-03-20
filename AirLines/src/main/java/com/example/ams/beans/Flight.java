package com.example.ams.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FLIGHTS")
public class Flight {
	
	@Id
	@Column(name="FLIGHT_NUMBER")
	private long flightNumber;
	
	@Column(name="ORIGIN")
	private String from;
	
	@Column(name="DESTINATION")
	private String to;
	
	@Column(name="DEPARTURE_TIME")
	private int depart;

	@Column(name="ARRIVAL_TIME")
	private int arrive;
	
	@Column(name="RETURN_DATE")
	private int duration;
	
	@Column(name="CABIN")
	private int cabin;

	public long getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(long flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public int getDepart() {
		return depart;
	}

	public void setDepart(int depart) {
		this.depart = depart;
	}

	public int getArrive() {
		return arrive;
	}

	public void setArrive(int arrive) {
		this.arrive = arrive;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getCabin() {
		return cabin;
	}

	public void setCabin(int cabin) {
		this.cabin = cabin;
	}

	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", from=" + from + ", to=" + to + ", depart=" + depart
				+ ", arrive=" + arrive + ", duration=" + duration + ", cabin=" + cabin + "]";
	}

	public Flight(long flightNumber, String from, String to, int depart, int arrive, int duration, int cabin) {
		super();
		this.flightNumber = flightNumber;
		this.from = from;
		this.to = to;
		this.depart = depart;
		this.arrive = arrive;
		this.duration = duration;
		this.cabin = cabin;
	}
	
	public Flight() {
		
	}
	
	
}
