package day39_classes;

public class Iphone {

	/**
	 * 1.Properties--> Instance variables
	 *  String model;
	 *  int memory;
	 *  String color;
	 */
	//========================================================================================
	
	/**
	 * we can create our own data type class
	 * we can call it as decleration of custom data type
	 * 
	 * The variables below are not local veriables , they are instance variables because they were not
	 * created in a custom or main method. So they would have default values.
	 * As they have default values we dont need to intialize them before using. Their default value is 0. 
	 */
	
	String model;
	int memory;
	String color;
	
	/**
	 * A class can have 2 things: 1)Instance variables, 2)Methods
	 * 
	 * How to create method for a class
	 * static will not be used when creating a method in custom class
	 */
	public void printPhoneInfo() {
		
		System.out.println("Model: "+model);
		System.out.println("Memory: "+memory);
		System.out.println("Color: "+color);
	}
}
