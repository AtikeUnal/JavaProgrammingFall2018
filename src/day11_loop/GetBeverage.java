package day11_loop;

import java.util.Scanner;

public class GetBeverage {
	public static void main(String[] args) {
		/*tea>$3
		 * coffee -->$4
		 * water-->$2
		 * juice-->$5
		 * String drink
		 * double price;
		 */
		
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter drink type:");
		String drink=scan.next();
		
		double price=0.0;
		
		switch (drink) {
		case"coffee":
			price=4;
			System.out.println("Coffee is "+price);
			break;
		case "tea":
			price=3;
			System.out.println("Tea is "+price);
			break;
		case "water":
			price=2;
			System.out.println("Water is "+price);
			break;
		case "juice":
			price=5;
			System.out.println("Juice is "+price);
			break;
		default:
			System.out.println("Invalid drink");
			
			
		}System.out.println("Your total is "+price);
		
	}
}
