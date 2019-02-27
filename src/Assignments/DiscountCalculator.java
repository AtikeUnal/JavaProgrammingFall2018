package Assignments;

import java.util.Scanner;

public class DiscountCalculator {
	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);	
	System.out.println("Enter unit price:");
	double unitPrice=scan.nextDouble();
	System.out.println("Enter quantity:");
	int quantity=scan.nextInt();
	double grandTotalPrice=quantity*unitPrice;
	int discount=0;
	
	
	if (quantity>=100 && quantity<=120) {
		discount=10;
	} else if (quantity>120) {
		discount=15;
	}else {
		discount=0;
	}
	double discountApplied=(grandTotalPrice*discount)/100;
	double totalPrice=grandTotalPrice-discountApplied;
	
	System.out.println("Grand Total: "+grandTotalPrice+"\n"+"Discount: "+discount+"\n"+"Discount applied: "+discountApplied+"\n"+"Total: "+totalPrice);
		
	}
}
