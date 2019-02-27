package Assignments;

import java.util.Scanner;

public class CalculatePhoneBill {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number of Calls: ");
		int numberOfCalls = scan.nextInt();
		double bill;

		if (numberOfCalls < 100) {
			bill = 200;
		} else if (numberOfCalls >= 100 && numberOfCalls < 150) {
			bill = 200 + (numberOfCalls % 100) * 0.60;
		} else if (numberOfCalls >= 150 && numberOfCalls < 200) {
			bill = 200 + (numberOfCalls % 100) * 0.50;
		} else {
			bill = 200 + (numberOfCalls % 100) * 0.40;
		}
		System.out.println("Your bill is: " + bill);

	}
}
