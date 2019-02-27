package day23_loops;

import java.util.Scanner;

public class phoneNumberValidator {
	public static void main(String[] args) {
		/*
		 * Program PhoneNumberValidator -  simple phone number format check.

Accepts phone number in one of two formats: (202)3334444 or 2023334444

Checks:

- if length is not 12 or 10 characters, then -> show error message : invalid length - must be either 12 or 10 characters.

- If first character is '(' then 1. fifth character must be ')' -> if not show error message: Invalid format -there is no closing parenthesis.

- Get rid of parentheses using replace method - code:

phoneNumber = phoneNumber.replace( "(", "");

phoneNumber = phoneNumber.replace( ")", "");

- Using a loop check if each character is a number between 0-9. -> if not show error message: Invalid character - must be a number between 0-9.
		 * 
		 * 
		 * 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your phone number:");
		String phoneNum=scan.next();
		int length=phoneNum.length();
		
		if(phoneNum.startsWith("(")) {
			if(length!=12) {
				System.out.println("invalid length - must be either 12 or 10 characters.");
				return;
			}
		}else {if(length!=10) {
			System.out.println("invalid length - must be either 12 or 10 characters.");
			return;
		}
			
		}
		if(phoneNum.charAt(0)=='(') {
			if(phoneNum.charAt(4)!=')') {
				System.out.println("Invalid format-there is not closing paranthesis");
				return;
			}
			
		}
		
	phoneNum=phoneNum.replace("(","");
	phoneNum=phoneNum.replace(")","");
		
		for(int i=0; i<phoneNum.length(); i++ ) {
		if(!(phoneNum.charAt(i)>='0' && phoneNum.charAt(i)<='9')) {
			System.out.println("Invalid character - must be a number between 0-9"+phoneNum.charAt(i));
			return;
		}
		}
		System.out.println("All number detected");
	}
}
