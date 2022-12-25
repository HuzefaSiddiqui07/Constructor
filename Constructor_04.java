// Parameterized Constructor ( A constructor with arguments )
package com.constructor01;
public class Constructor_04 {
	// Declaration
	String name;
	int age;
	String address;
	char gender;
	double weight;
	// Create a Parameterized Constructor
	public Constructor_04 (String userName, int userAge, String userAddress, char userGender, double userWeight) {
		
		// Initialization
		name = userName;
		age = userAge;
		address = userAddress;
		gender = userGender;
		weight = userWeight;
		
		// Print All Information
		System.out.println("Name :" + name);
		System.out.println("Age :" + age);
		System.out.println("Address :" + address);
		System.out.println("Gender :" + gender);
		System.out.println("Weight :" + weight);
		
	}
       public static void main(String[] args) {
		
		// Create an Object
		Constructor_04 obj = new Constructor_04("Huzefa", 23, "Mumbai", 'M', 63.7);
		Constructor_04 obj1 = new Constructor_04 ("Priyanka", 31, "Amravati", 'F', 57.6);
	 }
  }
