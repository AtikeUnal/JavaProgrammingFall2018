package day21_Loops;

import java.util.Scanner;

public class warmUpTask {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word:");

		String word = scan.nextLine();

		String reversed = "";
		for (int index = word.length() - 1; index >= 0; index--) {
			reversed = reversed + word.charAt(index);
		}
		System.out.println(reversed);
		if (word.equals(reversed)) {
			System.out.println("It is palindrome");
		} else {
			System.out.println("It is not palindrome");
		}

		// ==================================================================================================
		
	System.out.println("Enter Second word: ");
	String word2=scan.nextLine();
	System.out.println("Enter a character:");
	char ch=scan.next().charAt(0);
	int counter=0;
	for(int i=0; i<=word.length(); i++) {
		System.out.println(word.charAt(i));
		if (word.charAt(i)==ch) {
			System.out.println("found "+ch);
			counter++;
		}
	}
	System.out.println(counter);
	
	//=============================================================================================================
	
	
	}
}
