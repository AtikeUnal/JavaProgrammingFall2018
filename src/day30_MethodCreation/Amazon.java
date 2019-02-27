package day30_MethodCreation;

import java.util.Scanner;

public class Amazon {
	public static void main(String[] args) {
		System.out.println("This is Amazon Application");
		System.out.println("Please login");
		System.out.println("username");
		Scanner sc=new Scanner(System.in);
		String username=sc.nextLine();
		System.out.println("password: ");
		String pass=sc.nextLine();
		welcomMessage(username);
		System.out.println(username);
		System.out.println(username.hashCode());
		System.out.println("\n\nEnd of Amazon program");
	}
	public static void welcomMessage(String user) {
		System.out.println("Welcome, "+user+"!!!");
	}
	
	public static void generateNewGroup(String [] students, int groupSize) {
		
	}
}
