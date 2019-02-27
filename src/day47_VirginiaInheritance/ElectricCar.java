package day47_VirginiaInheritance;

public class ElectricCar extends Car{
	
	int batteryLevelMiles;
	static boolean hasBattery=true;
	
	public void charge() {
		System.out.println("Charging Electric Car");
		batteryLevelMiles = 500;
	}

}
