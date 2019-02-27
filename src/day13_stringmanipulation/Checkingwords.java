package day13_stringmanipulation;

import java.util.Scanner;

public class Checkingwords {
	public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.println("write down a word:");
	String word1=scan.next();
	System.out.println("write down second word");
	String word2=scan.next();
	System.out.println("write third word down:");
	String word3=scan.next();
	int w1=word1.length();
	int w2=word2.length();
	int w3=word3.length();
	if((w1==w2)&&(w2==w3)&&(w1==w3)) 
	{System.out.println("All words are same length");
		}else if((w1==w2)||(w2==w3)||(w1==w3)) {
			System.out.println("Not same nor  Different length");
				
		} else {System.out.println("All different length");}
	}
	
	}

