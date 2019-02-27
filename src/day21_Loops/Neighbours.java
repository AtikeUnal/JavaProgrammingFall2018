package day21_Loops;

import java.util.Scanner;

public class Neighbours {
	public static void main(String[] args) {
		/*
		 * String word and you need to check for some character side by side
		 * if found say "baap-" character
		 * ex:
		 * abccddefg
		 * 
		 * 
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a word:");
		String word=scan.nextLine();
		
		for(int i=0; i<word.length()-1;i++) {
			if(word.charAt(i)==word.charAt(i+1)) {
			System.out.println("Beep- "+word.charAt(i));
			}
			
		}
		
		
		
		
		
	}
}
