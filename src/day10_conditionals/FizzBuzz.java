package day10_conditionals;

import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args){
		
		/*3. For each multiple 3, print"Fizz" intsead of the number.
		 * For each multiple if 5, print "Buzz" instead of the number.
		 * For numbers which are multiples of both 3 and 5, print "FizzBuzz".
		 * else print number itself
		 */
		
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		if(number%5==0&&number%3==0) {
			System.out.println("FizzBuzz");
		}else if (number%5==0) {
			System.out.println("Buzz");
			}else if (number%3==0) {
				System.out.println("Fizz");
			}else {
				System.out.println(number);
			}
		
	}
}
