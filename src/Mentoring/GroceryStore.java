package Mentoring;

public class GroceryStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//(int weight, String color, String taste, int size
		Apple apple1=new Apple(1, "red", "sour", "small");
		Apple apple2=new Apple(5, "green", "sweet","medium");
		Apple apple3=new Apple(2, "yellow", "sour", "small");
		
		apple1.printInfo();
		System.out.println("----------------------------");
		apple2.printInfo();
		System.out.println("----------------------------");
		apple3.printInfo();
	}

}
