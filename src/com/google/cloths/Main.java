package com.google.cloths;

public class Main {

	public static void main(String[] args) {
		

		Tshirt tshirt = new Tshirt(Size.L);
		System.out.println(tshirt);
		
		tshirt = new Tshirt(Size.XXS);
		System.out.println(tshirt);
		
		tshirt = new Tshirt(Size.M);
		System.out.println(tshirt);
		
		tshirt = new Tshirt(Size.XL);
		System.out.println(tshirt);
		

		tshirt = new Tshirt(Size.XXL);
		System.out.println(tshirt);
				
	}

}
