package com.google.staff;

public class Employee {

	// state 
	
	private String name;
	private long id;
	private Object object;
	
	
	public Employee(String name, long id) {
		super();
		this.name = name;
		this.id = id;
	}
	// behavior 
	
	public void doWork() {
		System.out.println("\tEmployee marking attendence");
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Employee) {
			Employee new_name = (Employee) obj;
			return new_name.id==this.id;
		}
		return false;
	}
}
