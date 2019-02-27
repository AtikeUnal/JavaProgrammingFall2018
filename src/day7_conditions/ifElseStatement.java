package day7_conditions;

import java.util.Scanner;

public class ifElseStatement {
	public static void main(String[] args) {
		double coffeePrice = 6.50;
		
		if(coffeePrice<=6.0) {
			System.out.println("I will get coffee");
			
		}else {System.out.println("Aljak dal, gymmada");
			
		}
		double accountBalance=450.50;
		double price=500;//here casting int into double
		//if you have enough money, you buy the item 
		//otherwise you say not enough balance
		if(accountBalance>=price) {System.out.println("alaysammykam");
		System.out.println("I am ordering online");
			
		}else {System.out.println("not enough balance");
			   System.out.println("aylyga garashjakmy?");
		}
		
		int speedLimit;
		int currentSpeed;
		Scanner scan=new Scanner(System.in);
		speedLimit=40;
		System.out.println("Enter your current speed");
		currentSpeed=scan.nextInt();
		if (currentSpeed>speedLimit) {
			System.out.println("Gaty gidip baryan ekenina");
		} else {System.out.println("bolya gidiber onda");
			
		}
		//create a boolean variable isPrime
		//if isPrime is true then shipping is 0.0
		//if not then shipping is 7.99
		//print shipping price
	}
}
