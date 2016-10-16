package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	@BeforeClass
	public static void setup() throws PersonException {
		Course c1 = new Course();
		Course c2 = new Course();
		Course c3 = new Course();
		ArrayList cList = new ArrayList();
		cList.add(c1);
		cList.add(c2);
		cList.add(c3);
		UUID idOne = UUID.randomUUID();
		Date date1 = new Date();
		Date date2 = new Date();
		Semester fall = new Semester(idOne, date1, date2);
		Semester spring = new Semester(idOne, date1, date2);
		ArrayList semList = new ArrayList();
		semList.add(fall);
		semList.add(spring);
		Section c1s = new Section(idOne, idOne, idOne, 5);
		Section c1f = new Section(idOne, idOne, idOne, 5);
		Section c2s = new Section(idOne, idOne, idOne, 5);
		Section c2f = new Section(idOne, idOne, idOne, 5);
		Section c3s = new Section(idOne, idOne, idOne, 5);
		Section c3f = new Section(idOne, idOne, idOne, 5);
		ArrayList<Section> secList = new ArrayList<Section>();
		secList.add(c1s);
		secList.add(c2s);
		secList.add(c3s);
		secList.add(c1f);
		secList.add(c2f);
		secList.add(c3f);
		Student stu1 = new Student(null, null, null, date2, null, null, null, null);
		Student stu2 = new Student(null, null, null, date2, null, null, null, null);
		Student stu3 = new Student(null, null, null, date2, null, null, null, null);
		Student stu4 = new Student(null, null, null, date2, null, null, null, null);
		Student stu5 = new Student(null, null, null, date2, null, null, null, null);
		Student stu6 = new Student(null, null, null, date2, null, null, null, null);
		Student stu7 = new Student(null, null, null, date2, null, null, null, null);
		Student stu8 = new Student(null, null, null, date2, null, null, null, null);
		Student stu9 = new Student(null, null, null, date2, null, null, null, null);
		Student stu10 = new Student(null, null, null, date2, null, null, null, null);
		ArrayList<Student> stuList = new ArrayList<Student>();
		stuList.add(stu1);
		stuList.add(stu2);
		stuList.add(stu3);
		stuList.add(stu4);
		stuList.add(stu5);
		stuList.add(stu6);
		stuList.add(stu7);
		stuList.add(stu8);
		stuList.add(stu9);
		stuList.add(stu10);
		for (Student s : stuList)
			new Enrollment(s.getStudentID(), c1s.getSectionID());
		
		
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}
}