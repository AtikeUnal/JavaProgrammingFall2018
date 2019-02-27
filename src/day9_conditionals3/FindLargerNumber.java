package day9_conditionals3;

import java.util.Scanner;

public class FindLargerNumber {
	public static void main(String[] args) {
		int num1, num2, num3, max;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		num1=scan.nextInt();
		num2=scan.nextInt();
		if(num1>num2) {
			max=num1;
		}else {
		max=num2;
	}
		System.out.println("Max: "+max);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		num1=scan.nextInt();
		num2=scan.nextInt();
		num3=scan.nextInt();
		if(num1>num2 && num1>num3) {
			max=num1;
		}else if(num2>=num1&& num2>=num3) {
			max=num2;
		}else {max=num3;
				}
		System.out.println("Max: "+max);
	}
}
