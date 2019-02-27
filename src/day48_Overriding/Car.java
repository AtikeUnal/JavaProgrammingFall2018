package day48_Overriding;

public class Car {

	String model;
	int year;
	boolean sportEdition;
	
	
	public void seeDetails() {
		System.out.println(this.model);
		System.out.println(this.year);
		System.out.println(this.sportEdition);
	}
	
	public void seeDetails(Car c) {
		
	}
	
	public static void main(String [] args) {
		Car c1=new Car();
		c1.model="Toyota Camry";
		c1.year=2018;
		c1.sportEdition=false;
		
		Car c2=new Car ();
		c2.model="Honda civic";
		c2.year=2019;
		c2.sportEdition=true;
		c2.seeDetails();
	}
}
