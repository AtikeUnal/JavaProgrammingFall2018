package day8_conditionals2;

import java.util.Scanner;

public class WarmUpTasks {
	public static void main(String[] args) {
		int pincode;
		pincode=122;
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter pin code:");
		int userPin=scan.nextInt();
		if (pincode==userPin) {System.out.println("Access granted");}
		else {System.out.println("Yok bol");
		
		System.out.println("======================");
		System.out.println("Enter a number:");
		int number=scan.nextInt();
		if (number%2==0) {System.out.println("it is even number!");}
		else {System.out.println("it is odd!!!!");
			
		}
		
			
		}
	}
}
