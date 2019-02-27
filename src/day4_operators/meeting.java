package day4_operators;

import java.util.Scanner;

public class meeting {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Hello, what is your name?");
		String name =scan.nextLine();
		System.out.println("Nice to meet you! "+name);
		
		
		System.out.println("What is your date of birth:");
		int dateOfBirth=scan.nextInt();
		int age=2018-dateOfBirth;
		System.out.println("So you are "+age+" years old!");
	}

}
