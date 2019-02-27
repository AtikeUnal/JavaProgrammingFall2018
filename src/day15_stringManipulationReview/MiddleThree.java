package day15_stringManipulationReview;

import java.util.Scanner;

public class MiddleThree {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a word:");
		String soz=scan.nextLine();
		
		//check if the word has odd number of characters
		boolean isOdd=soz.length()%2==1;
		System.out.println("isOdd: "+isOdd);
		
		boolean has5OrMore=soz.length()>=5;
		System.out.println("has 5 or more: "+has5OrMore);
		int length=soz.length();
		char mid=soz.charAt(length/2);
		System.out.println(mid);
		
		int middle=soz.indexOf(mid);
		
		
		char beforeMiddle=soz.charAt(middle-1);
		System.out.println(beforeMiddle);
		
		char afterMiddle=soz.charAt(middle+1);
		System.out.println(afterMiddle);
		
		if (isOdd && has5OrMore) {
		System.out.print(beforeMiddle);
		System.out.print(mid);
		System.out.print(afterMiddle);
		}
		
		
}
}