package day14_stringmanipulation;

import java.util.Scanner;

public class StatingTheObvious {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Please entr your email:");
		String email=scan.nextLine();
		int sart=email.indexOf("@");
		System.out.println(sart);
	}
}
