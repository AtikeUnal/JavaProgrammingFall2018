package day4_operators;

import java.util.Scanner;

public class ageCalculatorWithScanner {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);//System.in=sistemanyn icine input edilebilecek code.
		System.out.println("Enter year of birth");
		
		int yearOfBirth = scan.nextInt();//let user to enter an int number
		System.out.println("Please enter  year of death ");
		int deathYear=scan.nextInt();
		int lived=deathYear-yearOfBirth;
		System.out.println("He lived "+lived+" years");
		System.out.println("Enter your name below:");
	
		
	}
}
