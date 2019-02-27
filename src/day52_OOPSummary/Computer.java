package day52_OOPSummary;

public class Computer {

	
	private int memory;
	 String model;
	/**
	 *            OOP Summary
	 *  1.Encapsulation
	 *  	a.make all variables private so it can't go outside of class.
	 *  	b.provide public getters and setters and apply your condition so you can give proper access to fields.
	 *  2.Inheritance:  2. Inheritance - is an ability to use properties of other classes. This help us to write less code and keep source code organized. 
        IS-A Relationship
        ex: Child class IS-A parent class. 
        class Apple extends Fruit {
        }
        Apple IS-A Fruit.
    * we can inherit all the visible members of other class using 'extends' keyword from the child class.
    a. private - class protected. This member doesn't go outside of class.
    b. default - when we don't declare with access modifiers. It is default. This is package protected. 
    c. protected - it's package protected and visible to subclass in different package. 
    d. public - it's visible to any class and reachable within the project.
	 *  
	 *  3.Abstraction: having the idea /functionality and not focusing on implementation.
	 *  	1.Abstract class- type of class that can have both abstract and non-abstract methods in it.
	 *  						This class can not be instantiated.
	 *  						*Abstract classes meant to be extended.
	 *  						*Any non-abstract class that is extending to abstract class is called Concrete class.
	 *  						*Cocrete class is reponsible to implement /ovrride all the abstract methods.
	 *  	2.Interface- is not a class. It plays as a role of additional feature for a datatype. It cannot be instantiated.
	 *  					*any class that want s to implement interface MUST use 'implements' keyword.
	 *  					*Interface can be extended by another interface.
	 *  
	 *  4.Polymorphism : one reference having many forms.
	 *  				 *On the reference type we can have the object type itself or parent hierarchy type.
	 *  			Ex: Food f=new Apple();
	 *  				Fruit ff=new Apple();
	 *  				Apple a =new Apple();
	 *  				Fruit fff=new Orange();
	 *  				 *Casting- ability to convert between refernce datatypes.
	 *  					a)Downcasting- Convert from Parent to child type.
	 *  					  We must explicitly mention datatype in paranthesis where in upcasting is NOT needed.
	 *  					b)Upcasting- Convert from Child to Parent typee.
	 * 
	 */
	
	
	
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		if(memory < 0) {
			System.out.println("Invalid memory value. Please try again");
		}else {
			this.memory = memory;

		}
	}
	
	
}
