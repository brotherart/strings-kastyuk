package com.belhard.university;

import java.time.LocalDate;

public class App {

	public static void main(String[] args) {

		Student student1 = new Student("Andrei", "Morozov", new Address("Minsk", "Zhukovskogo", "23", 15), LocalDate.of(2003, 7, 24), 2, false);
		Student student2 = new Student("Petr", "Voronov", new Address("Minsk", "Mayakovskogo", "18", 155), LocalDate.of(2003, 6, 23), 2, false);
		Student student3 = new Student("Masha", "Kovolenko", new Address("Brest", "Kosmonavtov", "66", 37), LocalDate.of(2002, 12, 2), 2, true);
		Student student4 = new Student("Ivan", "Kuzmich", new Address("Zhodino", "Moscovskay", "25"), LocalDate.of(2002, 10, 22), 2, false);
		Student student5 = new Student("Liza", "Ivanova", new Address("Minsk", "Maksima Tanka", "30-2", 31), LocalDate.of(2003, 4, 13), 2, false);
		Student student6 = new Student("Vadim", "Kozakov", new Address("Minsk", "Derzhinskogo", "22", 24), LocalDate.of(2003, 1, 30), 2, true);
		Student student7 = new Student("Egor", "Fomichev", new Address("Minsk", "Igumenski trakt", "32", 134), LocalDate.of(2001, 11, 18), 3, true);
		Student student8 = new Student("Kirill", "Snitko", new Address("Slutsk", "Lenina", "125"), LocalDate.of(2003, 5, 31), 2, false);
		
		Teacher teacher1 = new Teacher("Nikita", "Brui", "Object-oriented programming", new Address("Minsk", "Denisovskaya", "41"), LocalDate.of(1995, 9, 13), 6, 1038.55);
		
		
		Group group = new Group();
		group.setNumber("014302");
		group.setCurator(teacher1);
		
		group.addStudent(student1);
		group.addStudent(student2);
		group.addStudent(student3);
		group.addStudent(student4);
		group.addStudent(student5);
		group.addStudent(student6);
		group.addStudent(student7);
		group.addStudent(student8);
		
		System.out.println("INITIAL GROUP \n" + group.getlist());
		
		group.removeStudent(student4);
		System.out.println("REMOVE STUDENT \"4\" \n" + group.getlist());
		
		group.addStudent(new Student("Vasya", "Kolosov", new Address("Minsk", "Lenina", "125"), LocalDate.of(2001, 5, 10) , 3, true));
		System.out.println("ADD NEW STUDENT \n" + group.getlist());
	}

}
