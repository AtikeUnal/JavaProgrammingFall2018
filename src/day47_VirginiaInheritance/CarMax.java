package day47_VirginiaInheritance;

public class CarMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ElectricCar tesla=new ElectricCar();
		tesla.makeAndModel="Tesla Model-S";
		tesla.year=2015;
		tesla.maxSpeed=200;
		tesla.horsePower=518;
		System.out.println("Has Battery? - " + ElectricCar.hasBattery);
		
		
		
		
		Car.service();
		ElectricCar.service();
	}
	
	
	

}
