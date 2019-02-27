package day9_conditionals3;

import java.util.Scanner;

public class ShippingCalculator {
	public static void main(String[] args) {
	/*
	 * price, speed
	 * 
	 * Regular shipping rates:
	 * purchase price			cost
	 * 
	 * 
	 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Please select shipping type 1 or 2:");
		int shippingMode = scan.nextInt(); //1 -regular, 2=express
		System.out.println("Please enter Purchase Price:");
		double purchasePrice=scan.nextDouble();
		double shippingCost=0.0;	
		if (shippingMode==1) {
			System.out.println("------REGULAR SHIPPING SELECTED------");
			if (purchasePrice>=1.0 && purchasePrice<=100.0) {
				shippingCost=17.0;
			}else if(purchasePrice>100.0 && purchasePrice<=300.0) {
				shippingCost=10.0;
			}else if(purchasePrice>300.0) {
				shippingCost=0.0;
			}
		}else if(shippingMode==2) {
			System.out.println("-----EXPRESS SHIPPING SELECTED------");
			if (purchasePrice>=1.0 && purchasePrice<=100.0) {
				shippingCost=35.0;
			}else if(purchasePrice>100.0 && purchasePrice<=300.0) {
				shippingCost=25.0;
			}else if(purchasePrice>300.0) {
				shippingCost=15.0;
			}
		}
	System.out.println("Total shipping cost: "+shippingCost);
	}
	}
