package day10_conditionals;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args){
		//=========================================================================================
		//*2.leap year (February 29 days):
		//if any year is dividable with 400 it is a leap year
		//2)multiple of 4 but not multiple of 100 then its leap year 
			    //year%4-->0 and year%100 not 0
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter any year:");
		int year=scan.nextInt();
		if ((year%400==0)||(year%4==0&&year%100!=0)) {
			System.out.println(year+" is leap year");
		}else {
			System.out.println("it is not a leap year");
		}
	}
}
