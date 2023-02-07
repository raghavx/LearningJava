package com.google.array;

public class ArrayDemo {

	
	public static void main(String[] args) {

		// ways to create the array 
		// 1. 
		int[] numbers = new int[5];
		//2. 
		int[] numbers2 = new int[] {1,2,3,4,5,7,8,9};
		//3. 
		int[] numbers3;
		numbers3 = new int[] {1,2,3};
		numbers3 = new int[4];
		
		for(int i : numbers2) {
			System.out.println(i);
		}
		numbers2[0] = 100;
		
		for(int i : numbers2) {
			System.out.println(i);
		}
		
		
	}
}
