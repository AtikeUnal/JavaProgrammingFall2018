package day42_Encapsulation;

public class BMW {
/**
 * 1. Create a class BMW
Instance variables: model, year, color, price
Static variables: totalCars
Methods: drive —> print “%model is driving”
stop —> print “%model is stopping”
2.Encapsulate all instance variables of BMW and generate
getters and setters for all.
 * 
 */
	private String model;
	private int year;
	private String color;
	private int price;
	static int totalCars;
	
	
	
	public void drive() {
		System.out.println(model+" is driving");
	}
	
	public void stop() {
		System.out.println(model+" is stopping");
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setModel(String model){
		this.model=model;
	}
	
	public void setYear(int year) {
		if(year>=1900&&year<=2018) {
		this.year=year;
		}
	}
	public void setColor(String color) {
		this.color=color;
	}
	
	public void setPrice(int price) {
		if(price>=0&&price<=1000000) {
		this.price=price;
		}else {
			System.out.println("This is not proper price");
		}
	}
	/**
	 * Modify setters:
For year: year has to be between 1900 - 2018
For price: price has to be between 0 - 1000000;
	 * Add constructor to BMW
Constructor: takes model, year and sets values to model and
year instance variables. Also increments totalCars by 1
	 */
	
	public BMW(String model, int year) {
		this.model=model;
		this.year=year;
		totalCars++;
	}
	/**
	 * Add static method wash for BMW class.
This method accepts BMW object and prints “%model is
washed”
	 * 
	 *  
	 */
	
	public static void wash(BMW car) {
		System.out.println(car.model+" is washed");
	}
}


