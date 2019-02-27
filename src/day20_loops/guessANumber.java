package day20_loops;

import java.util.Random;
import java.util.Scanner;

public class guessANumber {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Random random=new Random();//it is a class type
		System.out.println(random.nextInt(50));
		int secretNumber =random.nextInt(10);
		int guessedNumber;
	
	do {
		System.out.println("Guess the number:");
		guessedNumber = input.nextInt();
		
		if (guessedNumber==secretNumber) {
			System.out.println("Congrats you win");
			
		}else {
			System.out.println("Incorrect guess.Try again");
		}
	}while(secretNumber != guessedNumber);
	}
}
