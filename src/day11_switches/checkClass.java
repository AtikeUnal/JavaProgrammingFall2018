package day11_switches;

import java.util.Scanner;

public class checkClass {
	public static void main(String[] args){
		String classAtSchool="";
		String weekdayName="";
		/*Warm up task:
		 * Write a program called 
		 */
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter a day:");
		int day=scan.nextInt();
		
		if (day==1) {
			classAtSchool="Group Project";
			weekdayName="Monday";
		}else if(day==2) {
			classAtSchool="JAVA";
			weekdayName="Tuesday";
		}else if(day==3) {
			classAtSchool="JAVA";
			weekdayName="Wednesday";
		}else if(day==4) {
			classAtSchool="Manual Testing";
			weekdayName="Thursday";
		}else if(day==5) {
			classAtSchool="No class";
			weekdayName="Friday";
		}else if(day==6) {
			classAtSchool="JAVA";
			weekdayName="Saturday";
		}else if(day==2) {
			classAtSchool="JAVA";
			weekdayName="Sunday";
		}else {
			classAtSchool="You entered invalid day";
			weekdayName="You entered invalid day";
			//System.out.println("Invalid day");
		}System.out.println("Day of week: "+weekdayName+"\n"+
							"Class: "+classAtSchool);
			
		
	}
}
