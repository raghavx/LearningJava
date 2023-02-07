package com.google.living;

import com.google.Automobile;

public class Human {
// state 
	private int eyes;
	private int ears;
	
	
	
	public static void main(String[] args) {
		Automobile automobile = new Automobile();
		automobile.move();
		Human human = new Human();
		human.walk();
		
	}
	
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
