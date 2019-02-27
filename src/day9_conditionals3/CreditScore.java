package day9_conditionals3;

import java.util.Scanner;

public class CreditScore {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your credit score");
		int creditScore=scan.nextInt();
		String creditStatus;
		int percentage;
		if(creditScore>=300 && creditScore<=579) {
			creditStatus="Very Poor";
			percentage=16;
		}else if(creditScore>=580 && creditScore<=669) {
			creditStatus="Fair";
			percentage=18;
		}else if(creditScore>=670 && creditScore<=739) {
			creditStatus="Good";
			percentage=21;
		}else if(creditScore>=740 && creditScore<=799) {
			creditStatus="Very Good";
			percentage=25;
		}else if (creditScore>=800 && creditScore<=850) {
			creditStatus="Exceptional";
			percentage=20;
		}else if (creditScore>=1 && creditScore<=299) {
			creditStatus="Bad Credit";
			percentage=10;
		}else {
			creditStatus="Invalid Score";
			percentage=1;
		}System.out.println("Your credit is "+creditStatus+" and "+percentage+" of americans do own that credit!");
	}
}
