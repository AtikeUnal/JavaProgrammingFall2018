package day33_Method;

import java.util.Arrays;

import day7_conditions.Char;

public class CharcterOfArray {
	public static void main(String[] args) {
		
		String word="Huseyin";
		
		char [] newArray=characterArray(word);
		
		
		
	}
	
	public static char[] characterArray(String name) {
		int size=name.length();
		char [] character=new char[size];
		
		for(int i=0; i<size; i++) {
		
		character[i]=name.charAt(i);
		
		}
		System.out.println(Arrays.toString(character));
		return character;
	}
	
}
/**
 * Create method that accepts String and returns
character array.
Input: “James”
Output: [j, a, m, e, s]
 * 
 * 
 */


