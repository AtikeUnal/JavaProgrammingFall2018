package Assignments;

import java.util.Scanner;

public class printTwice {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word:");
		String word = scan.nextLine();

		for (int i = 0; i <= word.length() - 1; i++) {
			System.out.print(word.charAt(i));
			System.out.print(word.charAt(i));
		}
	}
}
