package com.google.maths;

public class Table {
	// state 
	private int number;
	// constructor 
	public Table(int numb) {
		this.number = numb;
	}
	// Behavior 
	public void writeTable() {
		for(int i = 1; i <= 10; i++) {
			System.out.println(number * i);
		}
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
	// Entry point 
	public static void main(String[] args) {
		
		Table table = new Table(Integer.parseInt(args[0]));
		table.writeTable();
	}
	
}
