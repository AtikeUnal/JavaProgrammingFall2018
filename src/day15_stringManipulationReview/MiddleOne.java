package day15_stringManipulationReview;

import java.util.Scanner;

public class MiddleOne {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a word:");
		String word=scan.nextLine();
		int length=word.length();
		char middle=word.charAt((length)/2);// ortadaki harfi bulmak icin
		
		if ((length%2!=0) && (length>3)) {
			System.out.println("Middle charachter of your word is: "+middle);
			
		}
	}
}
