package day19_loops;

import java.util.Scanner;

public class warmUpTask {
	public static void main(String[] args) {
		/*
		 * 1.  Write a program that takes string word and converts first letter to uppercase and the rest to lowercase. Print it after conversion.
2.  Write a program to print numbers from 1 to 10.
in same line, separated by space
3.  Write a program to print numbers from 10 to 1.
in same line, separated by space

	
		 * 
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a word:");
		String word=scan.nextLine();
		String firstLetter=word.substring(0,1);
		firstLetter=firstLetter.toUpperCase();
		String rest=word.substring(1);
		rest=rest.toLowerCase();
		System.out.println(firstLetter+rest);
		
	int k=1;
	while (k<=10) {
	System.out.print(k+" ");
	k++;}	
	System.out.println(k);// println printi yazidan saymiyor, o satira ilk yazi yazanin kendisi oldugunu saniyor
	
	
	int kk=10;
	while (kk>=1) {
	System.out.print(kk+" ");
	kk--;
		
		
		
	}
	}
}
