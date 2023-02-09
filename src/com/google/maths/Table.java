package com.google.maths;

public class Table {
	// state 
	private int number;
	private int endOfTable;
	// constructor 
	public Table(int numb, int end) {
		this.number = numb;
		this.endOfTable = end;
	}
	// Behavior 
	public void writeTable() {
		for(int i = 1; i <= endOfTable; i++) {
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
		
		int number = Integer.parseInt(args[0]);
		int endOfTable = Integer.parseInt(args[1]);
		Table table = new Table(number,endOfTable);
		table.writeTable();
	}
	
}
