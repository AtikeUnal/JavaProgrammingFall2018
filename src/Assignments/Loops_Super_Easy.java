package Assignments;

import java.util.Scanner;

public class Loops_Super_Easy {
	public static void main(String[] args) {
		/*
		 * Write a Java program that reads in 3 numbers from the user in a loop (one at
		 * a time) And prints largest number and the summation of all numbers
		 * 
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		// System.out.println("Enter Number 1:");
		// int n1=scan.nextInt();
		// System.out.println("Enter Number 2:");
		// int n2=scan.nextInt();
		// System.out.println("Enter Number 3:");
		// int n3=scan.nextInt();
		int largest = 0;
		int sum = 0;
		for (int n = 1; n <= 3; n++) {
			System.out.print("Enter Number " + n + " :");
			int num = scan.nextInt();
			sum = sum + num;
			if (num > largest) {
				largest = num;

			}
		}
		System.out.println("Sum is: " + sum);
		System.out.println("Largest number is: " + largest);
	}
}
