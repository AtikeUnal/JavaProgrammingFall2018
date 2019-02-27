package Assignments;

import java.util.Scanner;

public class TipCalculator {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter Check Amount");
		Double checkAmount=scan.nextDouble();
		int tipRate=0;
		double totalTip=(checkAmount*tipRate)/100;
		double totalAmount=checkAmount+totalTip;
		System.out.println("Please enter quality of service:(Poor, Fair, Good, Great, Excellent )");//Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25% 
		String qualityOfService=scan.nextLine();
		System.out.println(qualityOfService);
		if (qualityOfService=="Poor") {
			tipRate=5;
		}else if(qualityOfService=="Fair") {
			tipRate=10;
		}else if(qualityOfService=="Good") {
			tipRate=15;
		}else if(qualityOfService=="Great") {
			tipRate=20;
		}else if(qualityOfService=="Excellent") {
			tipRate=25;
		}
				
		
		System.out.println("Do you want to split the bill?(Yes or No):");
		String split=scan.nextLine();
		
		if(split=="Yes") {
			System.out.println("Please enter amount of people to split:");
			int amountOfPeople=scan.nextInt();
			System.out.println("Bill Type: Split");
			System.out.println("Number of people entered: "+amountOfPeople);
			System.out.println("Total Tip "+totalTip);
			System.out.println("Total Amount: "+totalAmount);
			System.out.println("Total Per Person: "+totalAmount/amountOfPeople);
			System.out.println("Tip Per Person: "+totalTip/amountOfPeople);
				
			}else {
				System.out.println("Bill Type: Non Split");
				System.out.println("Total Tip "+totalTip);
				System.out.println("Total Amount: "+totalAmount);
			}
			
			
		}
		
	}
		

