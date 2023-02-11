package com.google.staff;

public class Doctor extends Employee{

	
	public Doctor(String name, long id) {
		super(name, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doWork() {
		
		// TODO Auto-generated method stub
		super.doWork();
		
		System.out.println("Doctor will treat patient");
	}
}
