package day20_loops;

import java.util.Random;
import java.util.Scanner;

public class guessANumberV2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Random random=new Random();//it is a class type
		//System.out.println(random.nextInt(50));
		int secretNumber =random.nextInt(10);
		int guessedNumber;
	//only 5 chances to guesss
		int iTries=0;
		
	do {
		System.out.println("Guess the number:");
		guessedNumber = input.nextInt();
		iTries++;
		
		if (guessedNumber==secretNumber) {
			System.out.println("Congrats you win");
			break; // return is more powerful if write here return it would stop whole program.
		}else if(guessedNumber>secretNumber){
			System.out.println("Too large");
		}else {
			System.out.println("Too small");
		}
		
		if(iTries==5) {
			System.out.println("You Lost");
			System.out.println("Secrer number is: "+secretNumber);
			break;
		}
	}while(secretNumber != guessedNumber && iTries<=5);
	
	
	}
}
