package day15_stringManipulationReview;

import java.util.Scanner;

public class Concatenation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first word");
		String one = scan.nextLine();
		System.out.println("Please enter second word:");
		String second = scan.nextLine();
		System.out.println(one.concat(second));
		// CTRL+SHIFT+F (WINDOWS FORMATTING YOUR CODE)
		// CMD+SHIFT+F (MAC FORMATTING YOUR CODE)

		// first get the length of first word.
		int firstWordsLength = one.length();
		System.out.println(firstWordsLength);

		char last = one.charAt(firstWordsLength - 1);// last char of first word(aciklasamasi mesela 4 harfli soz ise 4-1=3 oluyor. CharAt(3) son harf oluyor.
		System.out.println("last letter of first word is "+last);
		char first = second.charAt(0);//first letter of second word
		System.out.println("first letter of second word is "+first);
		
		if (last == first) {
			System.out.println(one.concat(second.substring(1)));
		} else {
			System.out.println(one.concat(second));
		}

	}
}
