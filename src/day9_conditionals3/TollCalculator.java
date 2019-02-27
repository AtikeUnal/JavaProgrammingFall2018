package day9_conditionals3;

import java.util.Scanner;

public class TollCalculator {
	public static void main(String[] args) {
		//*0-100 ->5$
		//101-500->8$
		//501-1000->10$
		//more than 1000->12$
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter distance you will drive:");
		int miles=scan.nextInt();
		double tollCost=0.0;
		
		if (miles>=0 && miles<=100) {
			tollCost=5;
	}	else if(miles>=101 && miles<=500) {
		tollCost=8;
	}	else if(miles>=501 && miles<=1000) {
		tollCost=10;
	}	else if(miles>1000) {
		tollCost=12;
	}	else {System.out.println("Can not be negative distance");}
		if (miles>0)
		System.out.println("You will pay: "+tollCost);
	}
}
