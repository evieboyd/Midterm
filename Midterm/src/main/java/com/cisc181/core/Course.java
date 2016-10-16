package com.cisc181.core;
import java.util.UUID;

public class Course {
	
	/*data fields*/
	
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	
	/*constructors*/
	
	public Course(){
		
	}
	
	public Course(UUID CourseID, String CourseName, int GradePoints){
		
		this.CourseID =  CourseID;
		this.CourseName = CourseName;
		this.GradePoints = GradePoints;
		
	}
	
	/*setters and getters*/
	
	public void setCourseID(UUID CourseID){
		this.CourseID = CourseID;
	}
	
	public UUID getCourseID(){
		return this.CourseID;
	}
	
	public void setCourseName(String CourseName){
		this.CourseName = CourseName;
	}
	public String getCourseName(){
		return this.CourseName;
	}
	
	public void setGradePoints(int GradePoints){
		this.GradePoints = GradePoints;
	}
	
	public int getGradePoints(){
		return this.GradePoints;
	}

}
