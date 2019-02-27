package day42_Encapsulation;

public class BmwCar {
	public static void main(String[] args) {
		
		BMW blackCar=new BMW("X6", 2018);
		blackCar.drive();
		
		blackCar.stop();
		
		BMW.wash(blackCar);
		
		BMW whiteCar=new BMW("X5", 2017);
		System.out.println(whiteCar.getModel());
		whiteCar.setColor("white");
		System.out.println(whiteCar.getColor());
		blackCar.drive();System.out.print("while "); whiteCar.stop();
		
		
		blackCar.setPrice(1200000);
	}

}
