package Assignments;

import java.util.Scanner;

public class VendingMachineChange {
	public static void main(String[] args) {

	Scanner scan=new Scanner(System.in);
	System.out.println("Enter price in cents:");
	int price=scan.nextInt();
	int change, nickels, dimes, quarters;
	change=100-price;
	
	quarters=change/25;//kod yukaridan asagiya dogru okunur ve asagida ne assagnment edersen bir asagiya o degerde gider.
	change%=25; //burada ilk once change 20 e bolup kac quarter oldugunu cikaryor kalani bulmak icinde change mod uyguluyor.
	
	dimes=change/10;
	change%=10;
	
	nickels=change/5;
	change%=5;
	
	
	System.out.println("Your change is: "+quarters+" quarters,"+dimes+" dimes and "+nickels+" nickels.");
	
}
}