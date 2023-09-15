package com.jsp.vehicle.registration;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Registration {
	
	@Id
	private String reg_no;
	private String city;
	
	public String getReg_no() {
		return reg_no;
	}
	public void setReg_no(String reg_no) {
		this.reg_no = reg_no;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
