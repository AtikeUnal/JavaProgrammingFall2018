package day17_review;

import java.util.Scanner;

public class AgeAndStatus {
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		
		
		System.out.println("Please enter number of month as your age:");
		int month=scan.nextInt();
		if (month<=1 && month>0) {
			System.out.println(month+" month old infant");
		}else if( month>1 && month<=12) {
			System.out.println(month+" years old Infant");
		}else if(month>12 && month<=36) {
			System.out.println((month/12)+ " year old Toddler");
		}else if(month>36 && month<=(12*5)) {
			System.out.println((month/12)+ " year old Pre-School child");
		}else if(month>(12*5)&& month<=(12*12)) {
			System.out.println(((month/12)+ " year old School Age Child"));
		}else if(month>(12*12) && month<=(18*12)) {
			System.out.println(((month/12)+ " year old Adolescent"));
		}else if (month>(18*12) && month<=(40*12)) {
			System.out.println(((month/12)+" year old young adult"));
		}else if (month>(40*12)&& month<=(65*12)) {
			System.out.println((month/12)+" year old middle age adult");
		}else {System.out.println(month/12+ " year old older adult");
			}
	}
}
