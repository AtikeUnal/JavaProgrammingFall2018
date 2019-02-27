package day23_loops;

import java.util.Scanner;

public class PhoneNumWarmUpTask_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your phone number: ");
		String phoneNum = scan.next();
		String AreaCode = "";
		if (phoneNum.startsWith("(")) {
			AreaCode = phoneNum.substring(1, 4);
		} else {
			AreaCode = phoneNum.substring(0, 3);
		}

		String theRest = phoneNum.substring(3);
		String state = "";
		switch (AreaCode) {
		case "202":
			state = "Washington";
			break;
		case "703":
			state = "Virginia";
			break;
		case "209":
			state = "California";
			break;
		case "312":
			state = "Illinois";
			break;
		case "347":
			state = "New York";
			break;
		case "201":
			state = "New Jersey";
			break;
		default:
			state = "Not in database";
		}
		System.out.println("Your area code is: " +  AreaCode);
		System.out.println("According to your area code you are from " + state);
		//**************************************************************************************************************
		
		
		
		
		
		
		
	}
}
