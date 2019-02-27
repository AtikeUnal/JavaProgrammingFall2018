package day17_review;

import java.util.Scanner;

public class Strings02 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//if first and last chars are same print "firsts nmae"
		//if second and second from the last are same -print "sconds name"
		//scanner with next() method
		System.out.println("Enter a word:");
		String word=scan.nextLine();
		char first=word.charAt(0);
		char last=word.charAt(word.length()-1);
		char second=word.charAt(1);
		char secondFromLast=word.charAt(word.length()-2);
		if(first==last) {
			System.out.println("Firsts same");
		} 
		if (second==secondFromLast) {
			System.out.println("Seconds same");
		}
		
		//if we use (else if) it will not chekc seconde it first one is true.
		
	}
}
