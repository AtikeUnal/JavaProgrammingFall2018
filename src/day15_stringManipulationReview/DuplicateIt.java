package day15_stringManipulationReview;

import java.util.Scanner;

public class DuplicateIt {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter first word:");
		String word1=scan.nextLine();
		System.out.println("Please enter second word:");
		String word22=scan.nextLine();
		System.out.println(word1.concat(word22).concat(word22).concat(word1));
	}
	
}
