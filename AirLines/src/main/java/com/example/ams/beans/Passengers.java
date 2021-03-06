package com.example.ams.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="PASSENGERS")
public class Passengers {
	
     @Id
     @Column(name="PASS_ID")
	 private String passId;
     
     @Column(name="P_FIRSTNAME")
	 private String fName;
 
     @Column(name="P_LASTNAME")
	 private String lName;
     
     @Column(name="GENDER")
	 private char gender;
     
     @Column(name="EMAIL")
     private String email;
     
     @Column(name="PASSWORD")
	 private String password;
     
     @Column(name="DOB")
	 private String DoB;
     
     @Column(name="PHONE_NUM")
	 private long phoneNum;
	 
	 
	public Passengers(String passId, String fName, String lName, char gender, String email, String password, String doB,
			long phoneNum) {
		super();
		this.passId = passId;
		this.fName = fName;
		this.lName = lName;
		this.gender = gender;
		this.email = email;
		this.password = password;
		this.DoB = doB;
		this.phoneNum = phoneNum;
	}
	
	public Passengers() {
		super();
	}
	
	public String getPassId() {
		return passId;
	}
	public void setPassId(String passId) {
		this.passId = passId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDoB() {
		return DoB;
	}
	public void setDoB(String doB) {
		this.DoB = doB;
	}
	public long getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}
	@Override
	public String toString() {
		return "\n Passengers [passId=" + passId + ", fName=" + fName + ", lName=" + lName + ", gender=" + gender
				+ ", email=" + email + ", password=" + password + ", DoB=" + DoB + ", phoneNum=" + phoneNum + "]";
	}
	 
	 
	 
}