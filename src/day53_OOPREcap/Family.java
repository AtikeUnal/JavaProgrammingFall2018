package day53_OOPREcap;

import java.util.Scanner;

public class Family {

	String mansionName;
	String car1;
	String car2;
	
	public void spendDaily(int moneySpent){
		String answer;
		Scanner scn=new Scanner(System.in);
		if(moneySpent>50000000) {
			System.out.println("Sir you are spending "+moneySpent+" dollars, are you sure?");
			
		}else {
			System.out.println("Purchase granted have a nice day");
		}
		answer=scn.nextLine();
		String password;
		if(answer.equals("Yes")) {
			System.out.println("Enter password:");
		password=scn.nextLine();
		if(password.equals("123")) {
			System.out.println("You are authorized");
		}else {
			System.out.println("Your banker will contact you.");
		}
		}
		
		
		
	}
	
}
