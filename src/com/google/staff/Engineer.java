package com.google.staff;

public class Engineer extends Employee{

	// behavior 
	
	public Engineer(String name, long id) {
		super(name, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doWork() {
		super.doWork();
		System.out.println("Engineer doing Engineering work");
		
	}
	
}
