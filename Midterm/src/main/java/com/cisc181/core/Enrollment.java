package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
/*data fields*/
	
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	/*constructors*/
	
	private Enrollment(){
		
	}
	
	public Enrollment(UUID SectionID, UUID StudentID){
		
		this.SectionID = SectionID;
		this.StudentID = StudentID;
		UUID EnrollmentID;
		double Grade;
		
	}
	
	/*setters and getters*/
	
	public void setSectionID(UUID SectionID){
		this.SectionID = SectionID;
	}
	
	public UUID getSectionID(){
		return this.SectionID;
	}
	

	public void setStudentID(UUID StudentID){
		this.StudentID = StudentID;
	}
	
	public UUID getStudentID(){
		return this.StudentID;
	}
	
	public void setEnrollmentID(UUID EnrollmentID){
		this.EnrollmentID = EnrollmentID;
	}
	
	public UUID getEnrollmentID(){
		return this.EnrollmentID;
	}
	
	public void setGrade(double Grade){
		this.Grade = Grade;
	}
	
	public double getGrade(){
		return this.Grade;
	}
	
	public void SetGrade(double grade){
		this.Grade = grade;
		
	}

}
