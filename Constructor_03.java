// No Arguments Constructor Type 
package com.constructor01;
public class Constructor_03 {
	
	// Declaration
	int addition;
	int subtraction;
	int multiplication;
	int division;
	int ab;
	int bc;
	
	// Create Constructor
	public Constructor_03() {
		
		// Initialization
		ab = 60;
		bc = 20;
		addition = ab+bc;
		subtraction = ab-bc;
		multiplication = ab*bc;
		division = ab/bc;
	}

	public static void main(String[] args) {
		
		// Create Constructor Object
		Constructor_03 obj =new Constructor_03();
		// All Initialization Is Call by Constructor Object & Print On Console
		System.out.println("ab Is :" + obj.ab);
		System.out.println("bc Is :" + obj.bc);
		System.out.println("Addition Is :" + obj.addition);
		System.out.println("Subtraction Is :" + obj.subtraction);
		System.out.println("Multiplication Is :" + obj.multiplication);
		System.out.println("Division Is :" + obj.division);
	}
 }