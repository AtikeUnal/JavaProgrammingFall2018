package day13_stringmanipulation;

import java.util.Scanner;

public class login {
	public static void main(String[] args) {
		String secretUserName="admin";
		String secretPassword="abc";
		
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("User name:");
		String userName=scan.next();
		System.out.println("Enter password:");
		String password=scan.next();
		if ((userName.equalsIgnoreCase(secretUserName))&&(password.equals(secretPassword))) {
			System.out.println("Successful");
		}else {
			if ((!userName.equalsIgnoreCase(secretUserName)&&(password.equals(secretPassword)))) {
				System.out.println("please enter correct username");
				}else if ((userName.equalsIgnoreCase(secretUserName)&&!(password.equals(secretPassword)))){
					System.out.println("Please enter correct password");
				}else {
					System.out.println("Both of them  are wrong");
				}
			}
	}
}
