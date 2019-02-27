package day6_operators;

import java.util.Scanner;

public class WarmUpTasks {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter mile:");
		Double mi=scan.nextDouble();
		Double km=mi*1.60;
		System.out.println("It is:"+km+" kilometers");
		
		System.out.println("Enter please current odmeter:");
		int current=scan.nextInt();
		System.out.println("Enter please previous odometer:");
		int previous=scan.nextInt();
		System.out.println("Enter number of gallons put:");
		int gallon=scan.nextInt();
		System.out.println("Enter price per gallon:");
		double pricePerGallon=scan.nextDouble();
		int MPG=(current-previous)/gallon;
		double fuelExpense=MPG/pricePerGallon;
		double totalCost=pricePerGallon*gallon;
		System.out.println("You drive "+MPG+" miles per gallon");
		System.out.println("You spend "+fuelExpense+" miles per dollar");
		System.out.println("You paid "+totalCost+" for total");
		
	}

}
