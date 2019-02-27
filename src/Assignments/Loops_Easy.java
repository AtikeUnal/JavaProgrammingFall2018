package Assignments;

import java.util.Scanner;

public class Loops_Easy {
	public static void main(String[] args) {

		// Write a program which accepts an integer (N) and print its first 10
		// multiples. Each multiple
		// should be printed on a new line in the form: N x i = result.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int N = scan.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(N + " x " + i + "= " + N * i);
		}

			
		
	}
}
