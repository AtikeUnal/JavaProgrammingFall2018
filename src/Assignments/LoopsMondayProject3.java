package Assignments;

import java.util.Scanner;

public class LoopsMondayProject3 {
	public static void main(String[] args) {
		/*
		 * 2. Write a program to prompt the user to enter the numbers till the user wants (by asking user if he wants to continue) 
		 * and at the end it should display the count of positive, negative and zeros entered. 

Example:

Enter the number 9

Do you want to continue y/n? y

Enter the number -5

Do you want to continue y/n? y

Enter the number 0

Do you want to continue y/n? y

Enter the number 66

Do you want to continue y/n? n

Positive numbers: 2

Negative numbers: 1

Zero numbers: 1
		 * 
		 * 
		 * 
		 */
		Scanner scan=new Scanner(System.in);
		String answer="";
		int positive=0;
		int negative=0;
		int zero=0;
		do {System.out.println("Enter a number:");
		int number=scan.nextInt();
		System.out.println("Do you want to continue?- y or n");
		answer=scan.next();
	while(	 (!answer.equals("y")&&!answer.equals("n")))  {
			System.out.println("You need to enter y or n");
			System.out.println("Do you want to continue?- y or n");
			answer=scan.next();	}
		
		
		if (number>0) {
			positive++;
		}else if(number<0) {
			negative++;
		}else if(number==0) {
			zero++;
		}
		}while(!answer.equalsIgnoreCase("n"));
	
		System.out.println("Positive numbers: "+positive);
		System.out.println("Negative numbers: "+negative);
		System.out.println("Zeros : "+zero);
	}
}
