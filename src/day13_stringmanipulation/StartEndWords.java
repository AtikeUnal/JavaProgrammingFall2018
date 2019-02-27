package day13_stringmanipulation;

import java.util.Scanner;

public class StartEndWords {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Write down a word with 5 characters:");
		String word1=scan.next();
		System.out.println("Write down second word with 5 characters: ");
		String word2=scan.next();
		int countW1=word1.length();
		int countW2=word2.length();
		char char1=word1.charAt(4);
		char char2=word2.charAt(0);
		if ((countW1!=5)||(countW2!=5)) {
			System.out.println("need to be exactly 5 chars length");
		} else if(char1==char2) {
			System.out.println("Fizz");
		}else {System.out.println("Buzz");
			}
	}
}
