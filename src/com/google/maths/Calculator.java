package com.google.maths;

public class Calculator {
	// state 
	private int numberA;
	private int numberB;
	private String operation;
	private Operation operation2;
	
	// constructor 
	
	public Calculator(int numberA, int numberB, String operation) {
		this.numberA = numberA;
		this.numberB = numberB;
		this.operation = operation;
	}
	
	public Calculator(int numberA, int numberB, String operation, Operation operation2) {
		this.numberA = numberA;
		this.numberB = numberB;
		this.operation = operation;
		this.operation2 = operation2;
	}
	
	// behavior 
	public void calculate() {
		if(operation.equalsIgnoreCase("add")){
			System.out.println(this.numberA+this.numberB);
		}else if(operation.equalsIgnoreCase("sub")){
			System.out.println(this.numberA-this.numberB);
		}else if(operation.equalsIgnoreCase("mul")){
			System.out.println(this.numberA*this.numberB);
		}else if(operation.equalsIgnoreCase("div")){
			System.out.println(this.numberA/this.numberB);
		}
	}
	
	public void calculate2() {
		switch(operation) {
		case "add":
			System.out.println(this.numberA+this.numberB);
			break;
		case "sub":
			System.out.println(this.numberA-this.numberB);
			break;
		case "mul":
			System.out.println(this.numberA*this.numberB);
			break;
		case "div":
			System.out.println(this.numberA/this.numberB);
			break;
		default:
			System.out.println("Invalid operation");
			break;
		}
	}
	
	public void calculate3() {
		switch(operation2) {
		case ADD:
			System.out.println(this.numberA+this.numberB);
			break;
		case SUB:
			System.out.println(this.numberA-this.numberB);
			break;
		case MUL:
			System.out.println(this.numberA*this.numberB);
			break;
		case DIV:
			System.out.println(this.numberA/this.numberB);
			break;
		default:
			System.out.println("Invalid operation");
			break;
		}
	}
	
	// entry point 
	public static void main(String[] args) {
		Calculator calc = new Calculator(10, 5, "div");
		//calc.calculate2();
		Calculator calc2 = new Calculator(10, 5, "div", Operation.ADD);
		calc2.calculate3();
	}
	
	// identity 
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}
