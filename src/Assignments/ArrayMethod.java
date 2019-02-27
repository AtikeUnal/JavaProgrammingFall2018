package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMethod {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int groupSize = 0;

		System.out.println("Please Enter The Size of Group: ");
		groupSize = scan.nextInt();
		String[] group = new String[groupSize];
		int counter = 1;
		for (int i = 0; i <= group.length - 1; i++) {
			System.out.println("Please Enter Member " + counter);
			group[i] = scan.next();
			counter++;
		}
		System.out.println("Group members: ");
		System.out.print(Arrays.toString(group));
		System.out.println();
		System.out.print("Words tarting with A: ");
		for (String each : group) {
			printALetter(each);
			
		}
		System.out.println();
		char ch;
		System.out.println("Please enter a character: ");
		ch=scan.next().charAt(0);
		for(int i=0; i<=group.length-1; i++) {
		printCharName(ch, group[i]);
		}

	}// Create method that prints out the student name that starts with ‘a’ or ‘A’.

	public static void printALetter(String word) {
		if (word.startsWith("A") || word.startsWith("a")) {
			System.out.print(word + " ");
		}

	}// Create method that takes char and prints out student name that starts with
		// given char

	public static void printCharName(char cha, String word) {
		
		System.out.println();
				
		if (word.charAt(0) == cha) {
			System.out.println(word);
		}//else {System.out.println("No matching word found!");}
	}
}
