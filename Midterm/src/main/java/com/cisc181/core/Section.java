package com.cisc181.core;

import java.util.UUID;

public class Section {
/*data fields*/
	
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;

	
	/*constructors*/
	
	public Section(){
		
	}
	
	public Section(UUID CourseID, UUID SemesterID, UUID SectionID, int RoomID){
		
		this.CourseID =  CourseID;
		this.SemesterID = SemesterID;
		this.SectionID = SectionID;
		this.RoomID = RoomID;
		
	}
	
	/*setters and getters*/
	
	public void setCourseID(UUID CourseID){
		this.CourseID = CourseID;
	}
	
	public UUID getCourseID(){
		return this.CourseID;
	}
	
	public void setSemesterID(UUID SemesterID){
		this.SemesterID = SemesterID;
	}
	
	public UUID getSemesterID(){
		return this.SemesterID;
	}
	
	public void setSectionID(UUID SectionID){
		this.SectionID = SectionID;
	}
	
	public UUID getSectionID(){
		return this.SectionID;
	}
	
	public void setRoomID(int RoomID){
		this.RoomID = RoomID;
	}
	
	public int getRoomID(){
		return this.RoomID;
	}
	


}
