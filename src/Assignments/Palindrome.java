package Assignments;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {

		/*
		 * Write a Java program which accepts a number from user and check if the number
		 * is palindrome or not? A palindrome number is a number which remains the same
		 * when it is reversed.
		 * 
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number: ");
		String num=scan.nextLine();
		String reversed="";
		for (int index=num.length()-1; index>=0; index--) {
			reversed=reversed+num.charAt(index);
			
		}System.out.println(reversed);
		if (reversed.equals(num)) {
			
			System.out.println("This number is palindrome");
		}else {
			System.out.println("It is  not a palindrome");
		}
		
	}
}
