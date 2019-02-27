package day19_loops;

import java.util.Scanner;

public class GiveMe5Dollars {
	public static void main(String[] args)throws InterruptedException {
	Scanner input=new Scanner(System.in);
	
	int amount;
	do {System.out.println("Give me 5 dollars");
	amount=input.nextInt();	
	}while (amount!=5 );
	
	System.out.println("tank u");
	}
}
