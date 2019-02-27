package day20_loops;

import java.util.Scanner;

public class printTheCharacters {
	public static void main(String[] args) {
		/*
		 * 2. Write a program that accepts a String word

and using while loop and charAt print each char in separate line.

Ex: Enter word:

Pen

P

e

n
		 * 
		 * 
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter word:");
		String word=scan.next();
		int index=0;
		while(index < word.length()) {
			System.out.println(word.charAt(index));
			index++;
		}
		
	}
}
