package com.google.staff;

public class Main {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee("A",1);
		
		Employee employee2 = new Employee("B",2);
		System.out.println(employee1.equals(employee2));
		
	}

}
