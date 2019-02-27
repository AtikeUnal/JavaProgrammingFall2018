package Assignments;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {

		/*
		 * Write a Java program which accepts a number from user and check if the number
		 * is prime or not? A prime number is a number is divisible by itself and 1
		 * only.
		 * 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number:  ");
		int number=scan.nextInt();
		boolean isPrime=true;
		for (int i=2; i<number; i++) {
			if(number%i!=0) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
			
		}
	}
}
