package com.cisc181.core;

import java.util.Date;

public class PersonException extends Exception {
	
	private Date DOB;
	private String phonenumber;
	public PersonException(Date DOB){
		this.DOB = DOB;
	}
	public Date getDOB(){
		return DOB;
	}
	
	public PersonException(String phonenumber){
		this.phonenumber = phonenumber;
	}
	public String getpn(){
		return phonenumber;
	}

}
