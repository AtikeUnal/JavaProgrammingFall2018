package day22_loop;

import java.util.Scanner;

public class register {
	public static void main(String[] args) {

		/*
		 * Create a program called Register.
		 * 
		 * It will ask user how many items he purchased.
		 * 
		 * Then based on that number it will ask item name and price that many times.
		 * 
		 * You need to gather all items in one String variable items separated by comma
		 * 
		 * And calculate sum of each item price into variable totalPrice.
		 * 
		 * Then print out items and total price.
		 * 
		 * Example:
		 * 
		 * How many items are you purchasing?
		 * 
		 * 2
		 * 
		 * What is item 1?
		 * 
		 * Gloves
		 * 
		 * How much is Gloves?
		 * 
		 * 10.44
		 * 
		 * What is item 2?
		 * 
		 * Hat
		 * 
		 * How much is Hat?
		 * 
		 * 13
		 * 
		 * ----------
		 * 
		 * Your items: Gloves, Hat
		 * 
		 * Your total Price: $23.44
		 * 
		 * 
		 * 
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("How many items are you purchasing?");
		int itemNumber = scan.nextInt();
		int itemPrice = 0;
		int totalPrice = 0;
		String itemName = "";
		String allItem = "";
		for (int i = 1; i <= itemNumber; i++) {
			System.out.println("What is item " + i);
			itemName = scan.next();
			if (i == itemNumber) {
				allItem = allItem + itemName;
			} else {
				allItem = allItem + itemName + ",";
			}
			System.out.println("How much is " + itemName);
			itemPrice = scan.nextInt();
			totalPrice = totalPrice + itemPrice;

		}
		System.out.println("Your total Price is: " + totalPrice);
		System.out.println("Your items are: " + allItem);

	}
}
