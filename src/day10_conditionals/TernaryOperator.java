package day10_conditionals;

import java.util.Scanner;

public class TernaryOperator {
	public static void main(String[] args){
	
		//ternary operator is "?" question mark
		// "?" is yes or no question
		//  passing score 60
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter your score");
		int score=scan.nextInt();
		String status;
		status= (score>=60)? "pass" : "fail";
		System.out.println(status);
		//==================================================================================================
		//boolean variable express
		//if true --> shipping=25$
		//if false--> shipping=15$
		boolean express=true;
		
		int shipping =(express)? 25:15;// or System.out.println((express)? 25:15);
		System.out.println("shipping");
		
	}
}
