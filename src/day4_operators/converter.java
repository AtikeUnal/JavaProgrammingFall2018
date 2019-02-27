package day4_operators;

import java.util.Scanner;

public class converter {
public static void main(String[] args) {
	Scanner scan=new Scanner (System.in);
	System.out.println("Enter Fahrenheit:");
	int Fahrenheit=scan.nextInt();
	System.out.println("it is: "+(50.0/9)*(Fahrenheit-32));
	
	
}
}
