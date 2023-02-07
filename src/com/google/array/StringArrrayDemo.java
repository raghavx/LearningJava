package com.google.array;

public class StringArrrayDemo {

	public static void main(String[] args) {

		String[] names = new String[50];
		names[0] =  "Ram";
		names[4] = "Shyam";
		
		for(String name : names) {
			System.out.println(name);
		}
	}

}
