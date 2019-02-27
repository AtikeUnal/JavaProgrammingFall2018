package day17_review;

import java.util.Scanner;

public class Substring {
	public static void main(String[] args) {
		
	Scanner scan= new Scanner (System.in);	
	System.out.println("Enter country name:");
	String countryName=scan.nextLine();
	
	String abbreviated=countryName.substring(0, 2);
	System.out.println(abbreviated=abbreviated.toUpperCase());
	
	System.out.println(abbreviated.length()==2 ? "2 chars detected" : "2 chars were not detected");//or
//	
//	//or you can do with variables
//	
	String m1="2 chars detected";
	String m2="2 chars were not detected";
	String result=abbreviated.length()==2 ? m1:m2;
	System.out.println(result);
	
	/*
	 * if 2 chars 
	 * 		if first char is U
	 * 			say "May be USA"
	 * 
	 * 
	 * 
	 * 
	 */
		String msg1="May be USA";
		String msg2="Not USA for sure";
		String msgerror="2 chars were not found";
		String end=abbreviated.length()==2? abbreviated.charAt(0)=='U'? msg1:msg2:msgerror;
		System.out.println(end);
		
	}
}
