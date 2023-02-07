package com.google;

import java.awt.Color;

import com.google.living.Human;

public class Automobile {
	
	//  state 
	private int headlight;
	private int wheel;
	private Color color;
	private boolean petrolEngine;
	
	// behaviour 
	public static void main(String[] args) {
		Automobile automobile = new Automobile();
		automobile.move();
		Human human = new Human();
		human.walk();
		
	}
	
	public void honk() {
		System.out.println("Noise pollution ");
	}
	
	public void move() {
		System.out.println("I am moving");
	}
	
	public void generatePower() {
		System.out.println("I am generating power ");
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
