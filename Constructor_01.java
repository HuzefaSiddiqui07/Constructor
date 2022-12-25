// No Arguments Constructor Type 
package com.constructor01;
public class Constructor_01 {
	
	// Declaration
	String name;
	int age;
	float weight;
	char nameFisrtLetter;
	long contactNumber;
	
	// Create a Constructor
	public Constructor_01() {
		
		// Initialization
		name = "Huzefa Siddiqui";
		age = 23;
		weight = 62.7f;
		nameFisrtLetter = 'H';
		contactNumber = 8433786334L;
	}
	   public static void main(String[] args) {
		   
		   // Create Constructor Object
		   Constructor_01 obj = new Constructor_01();
		   //  All Initialize Variable Call by Constructor Object With Sys.out
		   System.out.println("Name :" + obj.name);
		   System.out.println("Age  :" + obj.age);
		   System.out.println("Weight :" + obj.weight);
		   System.out.println("Fisrt Letter Of Name Is :" + obj.nameFisrtLetter);
		   System.out.println("Contact Number :" + obj.contactNumber);
		}
	 }
