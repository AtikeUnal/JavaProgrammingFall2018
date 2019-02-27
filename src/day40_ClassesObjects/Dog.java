package day40_ClassesObjects;

public class Dog {

	String breed;
	int size;
	int age;
	/**
	 * When creating custom class you give instance variables and define some methods. Later from that class 
	 * we can create objects only in main method.
	 * 
	 */
	public void eat() {
		System.out.println("Dog is eating");
	}
	
	public void sit() {
		
		System.out.println("Dog is sitting");
	}
	
	public void eat (String food) {
		System.out.println("Dog is eating "+ food);
	}
	
}
