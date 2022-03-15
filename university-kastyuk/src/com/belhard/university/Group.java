package com.belhard.university;

import java.util.Arrays;

public class Group {

	private String numberOfGroup;
	private int numberOfStudents;
	
	private Teacher curator;
	private final Student[] students = new Student[8];

	
	public boolean addStudent(Student student) {
		if (numberOfStudents < students.length) {
			students[numberOfStudents++] = student;
			return true;
		}
		return false;
	}
	
	public boolean removeStudent(Student student) {
		boolean isRemoved = false;
		for (int i = 0; i < numberOfStudents; i++) {
			Student elements = students[i];
			if (elements.getId() == student.getId()) {
				students[i] = null;
				isRemoved = true;
			}
			if (isRemoved) {
				if(i != numberOfStudents - 1) {
					students[i] = students[i + 1];
				}
				else {
					students[i] = null;
				}
			}
		}
		
		if (isRemoved) {
			numberOfStudents--;
		}
		return isRemoved;
	}
	
	
	public String getNumber() {
		return numberOfGroup;
	}
	public void setNumber(String number) {
		this.numberOfGroup = number;
	}
	
	public Teacher getCurator() {
		return curator;
	}
	public void setCurator(Teacher curator) {
		this.curator = curator;
	}

	
	public String getlist() {
		String list = "************Group # " + numberOfGroup + "************ \n";
		list += "Teacher: id= [" + curator.getId() + "] " + curator.gerFirstName() + " " + curator.getLastName() + "\n";
		if(curator != null) {
			list += "id=[" + curator.getId() + "] " + curator.gerFirstName() + " " + curator.getLastName() + "\n";
		}
		else {
			list += "NOT APPOINTED \n";
		}
		list += "Students: \n";
		for(int i = 0; i < students.length; i++) {
			Student student = students[i];
			if(student == null) {
				break;
			}
			list += (i + 1) + ". id=[" + student.getId() + "] " + student.gerFirstName() + " " + student.getLastName() + "\n";
		}
		return list;
	}
	
}
