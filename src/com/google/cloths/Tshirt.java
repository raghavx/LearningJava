package com.google.cloths;

public class Tshirt {

	private Size size;
	// "XXS", "XS","M", "L", "XL", "XXL", "XXXL"

	public static final String XXS = "XXS";
	
	public static final String XS = "XS";
	
	//,"M", "L", "XL", "XXL", "XXXL"
	public Tshirt(Size size) {
		
		this.size = size;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Size is : "+this.size;
	}
	
}
