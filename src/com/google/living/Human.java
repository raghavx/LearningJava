package com.google.living;

public class Human {
// state 
	private int eyes;
	private int ears;
	
	
	
	// behaviour 
	public void talk() {
		System.out.println("I am talking ");
	}
	
	public void walk() {
		System.out.println("I am walking ");
	}
	
	// identity 
	
	@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			return super.equals(obj);
		}
	
	@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return super.hashCode();
		}
	
	
}
