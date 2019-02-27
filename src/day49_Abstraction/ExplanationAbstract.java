package day49_Abstraction;

public class ExplanationAbstract {

	
	/**
	 * Abstract is something exists in thoughts or idea but not existing physically, 
	 * Example: Flying, studying, 
	 * 
	 * In java abstraciotn is handled in two ways.
	 * 1. Abstract class: if you want to create (public abstract class Student{} )
	 * 				-->An abstract class can not be instantiated: means you can not create an object from it
	 * 				-->to create abstract class we add 'abstract' keyword to class signature.
	 * 				-->Abstract class can have both abstract and non-abstract methods in it
	 * 				-->Abstratct classes CANNOT be instantiated. Because it will have abstract method which
	 * 					doesn't have implementation.
	 * 				-->Abstract class DOES not have to have abstract methods.
	 * 				-->//Abstract class can not have private or final,  static ABSTRACT methods
	 * 				-->Abstract methods can only be defined in abstract classes
	 * 				
	 * 
	 * *Concrete class: child of abstract class that implements all abstract methods. Concrete class MUST
	 * 					override and implement all the methods of abstract class. 
	 * 2. Interface: Additional feature for a certain datatype. (interface is kind of abstratct but not class.
	 * 	class Phone implements WiFi{
	 * 	
	 * 
	 * }
	 * 	public interface WiFi{
	 * 	
	 * 	public abstract void searchWifi();
	 * public abstract void connectWifi();
	 * 
	 * } 
	 * 
	 */
}
