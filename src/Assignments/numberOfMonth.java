package Assignments;

import java.util.Scanner;

public class numberOfMonth {
	public static void main(String[] args) {
		int number;
		Scanner scan=new Scanner(System.in);
		do {System.out.println("Enter number of a month: ");
		number=scan.nextInt();
		} while( number<=12&&number>0);
		
		System.out.println("You entered incorrect number");
		
		
	}
}
