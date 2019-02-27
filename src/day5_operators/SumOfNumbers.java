package day5_operators;

import java.util.Scanner;

public class SumOfNumbers {
	public static void main(String[] args) {
		/*Write a program that asks user to enter 3 numbers from keyboard and 
		 * calculates the sum of those numbers then show result
		 * 
		 */
		Scanner input=new Scanner (System.in);
		System.out.println("Please enter first number");
		int n1=input.nextInt();
		System.out.println("Please enter second number");
		int n2=input.nextInt();
		System.out.println("Please enter third number ");
		int n3=input.nextInt();
		System.out.println(n1+n2+n3);
		
		input.close();//it is not important for this example
	}

}
