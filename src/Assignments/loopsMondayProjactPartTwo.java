package Assignments;

import java.util.Scanner;

public class loopsMondayProjactPartTwo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter any number from 1 to 10: ");
		int num=scan.nextInt();
		int sum=0;
		for (int i=1;i<=10; i++) {
			sum=num*i;
			System.out.println(num+" x "+i+" = "+sum);
		}
	//========================================================================================================
		
		
		
		
	}
}
