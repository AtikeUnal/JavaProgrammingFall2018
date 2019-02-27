package day41_Constructors;

public class CatOwner {
	public static void main(String[] args) {
		
		
		
		Cat c=new Cat("male", "regular american");//--> every single time we create an object constructor is being called.
		c.eat();
		System.out.println(c.gender);
		
		Cat c1=new Cat("male", "Van kedisi", 5);
		System.out.println(c1.age);
	}
}
