package day41_Constructors;

public class Carsss {
	public static void main(String[] args) {
		
		Car myCar=new Car();
		
		myCar.make="Audi";
		myCar.year=2018;
		myCar.sportEdition=true;
		myCar.mileage=12000;
		
		
		myCar.drive();
		String destination1="Chicago";
		myCar.drive(destination1);
		myCar.drive(18);
		System.out.println("Final mealage is: "+myCar.mileage);
		
	}
}
