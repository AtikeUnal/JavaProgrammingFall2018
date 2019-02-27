package day11_switches;

import java.util.Scanner;

public class Grades {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a grade");
		char grade=scan.next().charAt(0);
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("Excellent");
			break;
		case 'B':
		case 'b':
			System.out.println("Good");
			break;
		case 'C':
		case 'c':
			System.out.println("Acceptable");
			break;
		case 'D':
		case 'd':
			System.out.println("Poor");
			break;
		default:
			System.out.println("Error:invalid grade");
		}
	}
}
