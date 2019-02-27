package Assignments;

import java.util.Scanner;

public class LCM {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1=scan.nextInt();
		System.out.println("Enter second number: ");
		int num2=scan.nextInt();
		int lcm;
		lcm=num1>num2?num1:num2;
		while(true) {
			if (lcm%num1==0&&lcm%num2==0) {
				System.out.println("LCM of "+num1+" and "+num2+" is "+lcm);
				break;
			}lcm++;
		}
		
	}
}
