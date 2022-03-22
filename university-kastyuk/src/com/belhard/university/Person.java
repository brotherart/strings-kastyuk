package com.belhard.university;

import java.time.LocalDate;

public class Person {

	private String firstName;
	private String lastName;
	private Address address;
	
	private LocalDate dateOfBirth;
	
	
	public Person(String firstName, String lastName, Address address, LocalDate dateOfBirth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	class EmployeePerson {
		
		private int yearsOfWork;
		private int workHoursOfWeek;
		private int numberOfVacationDays;
		
		private double salary;
		
		
		
		public EmployeePerson(int yearsOfWork, int workHoursOfWeek, int numberOfVacationDays, double salary) {
			this.yearsOfWork = yearsOfWork;
			this.workHoursOfWeek = workHoursOfWeek;
			this.numberOfVacationDays = numberOfVacationDays;
			this.salary = salary;
		}
		
		
		public int getYearsOfWork() {
			return yearsOfWork;
		}
		public void setYearsOfWork(int yearsOfWork) {
			this.yearsOfWork = yearsOfWork;
		}

		public int getWorkHoursOfWeek() {
			return workHoursOfWeek;
		}
		public void setWorkHoursOfWeek(int workHoursOfWeek) {
			this.workHoursOfWeek = workHoursOfWeek;
		}

		public int getNumberOfVacationDays() {
			return numberOfVacationDays;
		}
		public void setNumberOfVacationDays(int numberOfVacationDays) {
			this.numberOfVacationDays = numberOfVacationDays;
		}

		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
	}

	class TeacherPerson extends EmployeePerson {
		
		private String areaOfEducation;
		private String academicDegree;
		

		public TeacherPerson(int yearsOfWork, int workHoursOfWeek, int numberOfVacationDays, double salary, String areaOfEducation, String academicDegree) {
			super(yearsOfWork, workHoursOfWeek, numberOfVacationDays, salary);
			
			this.areaOfEducation = areaOfEducation;
			this.academicDegree = academicDegree;
		}
		
		
		public String getAreaOfEducation() {
			return areaOfEducation;
		}
		public void setAreaOfEducation(String areaOfEducation) {
			this.areaOfEducation = areaOfEducation;
		}
		
		public String getAcademicDegree() {
			return academicDegree;
		}
		public void setAcademicDegree(String academicDegree) {
			this.academicDegree = academicDegree;
		}
	}

	class CleanerPerson extends EmployeePerson {
		
		private int numbersOfClasses;

		public int getNumbersOfClasses() {
			return numbersOfClasses;
		}

		public void setNumbersOfClasses(int numbersOfClasses) {
			this.numbersOfClasses = numbersOfClasses;
		}
	}

	class StudentPerson {
		
		private int yearsOfStudy;
		
		private double scholarship;
		
		private boolean isBudget;
		
		public int getYearsOfStudy() {
			return yearsOfStudy;
		}
		public void setYearsOfStudy(int yearsOfStudy) {
			this.yearsOfStudy = yearsOfStudy;
		}

		public double getScholarship() {
			return scholarship;
		}
		public void setScholarship(double scholarship) {
			this.scholarship = scholarship;
		}

		public boolean isBudget() {
			return isBudget;
		}
		public void setBudget(boolean isBudget) {
			this.isBudget = isBudget;
		}
	}

}