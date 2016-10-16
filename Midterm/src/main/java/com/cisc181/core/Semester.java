package com.cisc181.core;
import java.util.UUID;
import java.util.Date;

public class Semester {
	
	/*data fields*/
	
	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
	
	/*constructors*/
	
	public Semester(){
		
	}
	public Semester(UUID SemesterID, Date StartDate, Date EndDate){
		this.SemesterID = SemesterID;
		this.StartDate = StartDate;
		this.EndDate = EndDate;
	}
	
	/* setters and getters*/
	
	public void setSemesterID(UUID SemesterID){
		this.SemesterID = SemesterID;
	}
	public UUID getSemesterID(){
		return this.SemesterID;
	}
	public void setStartDate(Date StartDate){
		this.StartDate = StartDate;
	}
	public Date getStartDate(){
		return this.StartDate;
	}
	public void setEndDate(Date EndDate){
		this.EndDate = EndDate;
	}
	public Date getEndDate(){
		return this.EndDate;
	}
	
	

}
