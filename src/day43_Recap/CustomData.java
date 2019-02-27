package day43_Recap;
import java.util.*;
public class CustomData {
/**
 * Create class CustomData
Create static method generateUsername. This method should accept string and return String.
Logic: check if given string is one word or more. If more, then concatenate all together and add
random number between 0 - 100. Return only lower case string.
Input: James Bond
Output: jamesbond74
Input: John
Output: john23
 */
	
	
	public static void main(String[] args) {
		String s=generateUsername("James Bond");
		System.out.println(s);
	}
	
	public static String generateUsername(String word) {
		
		word=word.replace(" ", "");
		Random r= new Random();
		word =word+r.nextInt(100);
		
		
		return word.toLowerCase();
	}
	
	/**
	 * Create static method generate password. This method should accept string and return string.
Logic: check if given string is one word or more. If more, then concatenate all together. Reverse
the string and add random number in the end between 0 - 500. And return the string. Return
only lowercase string.
Input: James
Output: semaj245
	 */
	
	public static String generatePassword(String word) {
		word=word.replace(" ", "");
		
		StringBuilder sb=new StringBuilder(word);
		sb.reverse();
		Random r=new Random();
		sb.append(r.nextInt(500));
		return sb.toString().toLowerCase();
		
		
	}
}
