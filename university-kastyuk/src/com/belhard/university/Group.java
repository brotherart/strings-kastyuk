package com.belhard.university;

public class Group {

	private int number;
	private int numberOfStudents;
	
	private Teacher curator;
	private final Student[] students = new Student[8];
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public Teacher getCurator() {
		return curator;
	}
	public void setCurator(Teacher curator) {
		this.curator = curator;
	}
	
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
			if (isRemoved == true) {
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
}
