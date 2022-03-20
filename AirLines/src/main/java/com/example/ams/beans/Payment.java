package com.example.ams.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Payment")
public class Payment {
	
	@Id
	@Column(name = "Tr_Id")
	private int TrId;
	
	@Column(name = "Pass_Id")
	private String passangerId;

	@Column(name = "Flight_Number")
	private String FlightNo;

	@Column(name = "Booking_Date")
	private String BookingDate;

	@Column(name = "city_id")
	private int cityId;

	@Column(name = "Seat_Number")
	private String SeatNo;

	@Column(name = "total_fair")
	private int Tfair;

	@Column(name = " P_Status")
	private String PStatus;

	public Payment() {
		super();
	}

	
	public Payment(int trId, String passangerId, String flightNo, String bookingDate, int cityId, String seatNo,
			int tfair, String pStatus) {
		super();
		this.TrId = trId;
		this.passangerId = passangerId;
		this.FlightNo = flightNo;
		this.BookingDate = bookingDate;
		this.cityId = cityId;
		this.SeatNo = seatNo;
		this.Tfair = tfair;
		this.PStatus = pStatus;
	}


	public int getTrId() {
		return TrId;
	}

	public void setTrId(int trId) {
		this.TrId = trId;
	}

	public String getPassangerId() {
		return passangerId;
	}

	public void setPassangerId(String passangerId) {
		this.passangerId = passangerId;
	}

	public String getFlightNo() {
		return FlightNo;
	}

	public void setFlightNo(String flightNo) {
		this.FlightNo = flightNo;
	}

	public String getBookingDate() {
		return BookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.BookingDate = bookingDate;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getSeatNo() {
		return SeatNo;
	}

	public void setSeatNo(String seatNo) {
		this.SeatNo = seatNo;
	}

	public int getTfair() {
		return Tfair;
	}

	public void setTfair(int tfair) {
		this.Tfair = tfair;
	}

	public String getPStatus() {
		return PStatus;
	}

	public void setPStatus(String pStatus) {
		this.PStatus = pStatus;
	}


	@Override
	public String toString() {
		return "Payment [TrId=" + TrId + ", passangerId=" + passangerId + ", FlightNo=" + FlightNo
				+ ", BookingDate=" + BookingDate + ", cityId=" + cityId + ", SeatNo=" + SeatNo + ", Tfair=" + Tfair
				+ ", PStatus=" + PStatus + "]";
	}
	

}
