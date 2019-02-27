package Assignments;

import java.util.Scanner;

public class Alphabet {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Pls enter any character between A-Z:");
		char ch=scan.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='u'||ch=='i'||ch=='o'||ch=='A'||ch=='E'||ch=='U'||ch=='I'||ch=='O') {
			System.out.println("It is vowel");
		}else if(ch>='a'&&ch<='z') {
			System.out.println("It is consonant");
		}else if(ch>='A'&&ch<='Z') {
			System.out.println("It is consonant");
		
	}else {System.out.println("You entered wrong character");}
}
}