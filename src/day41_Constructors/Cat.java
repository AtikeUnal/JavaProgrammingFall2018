package day41_Constructors;

public class Cat {
	
	String gender;
	String breed;
	boolean shy;
	int age;
	String color;
	String behaviour;
	
	
	public Cat(String gender1, String breed1) {//as constructor acts same as methods we we can pass parameters as well.
		System.out.println("Cat constructor is getting called");
	gender=gender1;//if you assign parameters to instance variables you will have that variable in another class already intialized.
	breed=breed1; 
	}
	
	public Cat(String gender1, String breed1, int age1) {
		gender=gender1;
		breed=breed1;
		if (age1<0) {
			age=age1;
			
		}
		
	}
	
	public void eat() {
		System.out.println("Cat is eating");
	}

}
