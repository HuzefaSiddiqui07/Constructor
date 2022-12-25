// Parameterized Constructor ( A constructor with arguments )
package com.constructor01;

public class Constructor_05 {
	// Initialization
	int a;
	int b;
	int add;
	int subtract;
	int multiply;
	int divide;
	// Create a Constructor
	public Constructor_05 (int addition, int subtraction, int multiplication, int division) {
		a = 500;
		b =300;
		add = addition;
		subtract = subtraction;
		multiply = multiplication;
		divide = division;
		
		System.out.println("Addition is :" + add);
		System.out.println("Subtraction is :" + subtract);
		System.out.println("Multiplication is :" + multiply);
		System.out.println("Division is :" + divide);
		
	}

	public static void main(String[] args) {
		// Create an Object
		Constructor_05 obj = new Constructor_05(500+300, 500-300, 500*300, 500/300);
	}

 }
