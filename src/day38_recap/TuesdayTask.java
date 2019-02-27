package day38_recap;

import java.util.*;
import java.util.ArrayList;

public class TuesdayTask {
	public static void main(String[] args) {
		String test = "Consequenses";
		String newTest = removeCon(test);
		System.out.println(newTest);
		int cap=3;
		int bou=100;
		System.out.println(assignNumbers(cap, bou));
		/**
		 * 1. Create a method that accepts String. Method should check if given String
		 * contains word “con”. If yes then it removes word “con” from the given String
		 * and returns modified String. Special cases: 1. You need to check if given
		 * String is ONLY one word. If given string is two or more words then print
		 * “Invalid data”, terminate the method and return empty String. 2. You need to
		 * check if given String length is at least 3. If less than 3 then print
		 * “Invalid data”, terminate the method and return empty String. 3. If given
		 * String doesn’t contain word “con” return the given word itself.
		 */
	}

	public static String removeCon(String word) {
		word = word.trim();
		word = word.toLowerCase();
		int startingPoint = word.indexOf("con");
		int endingPoint = startingPoint + 3;
		StringBuilder newWord = new StringBuilder(word);
		if (word.contains(" ")) {
			System.out.println("Invalid data");
			return "";
		} else if (word.length() < 3) {
			System.out.println("Invalid data");
			return "";
		} else if (word.contains("con")) {
			newWord.delete(startingPoint, endingPoint);
			return newWord.toString();
		} else {

			return word;
		}
	}
	/**
	 * 2. Create overloaded method for the first task that accepts 2 Strings
parameters. First String - word, second String - target word to remove.
Method should do same function. If first given word contains target word
then remove target word from first String.
Note: When removing word use StringBuilder’s delete method.
	 */
	public static String removeCon(String word, String targetWord) {
		
		word=word.trim();
		word=word.toLowerCase();
		targetWord=targetWord.toLowerCase();
		StringBuilder newWord=new StringBuilder(word);
		if(word.contains(" ")) {
			System.out.println("invalid data");
			return "";
		}else if(word.length()<targetWord.length()) {
			System.out.println("Invalid data");
			return "";
		}else if(word.contains(targetWord)) {
			newWord.delete(word.indexOf(targetWord), word.indexOf(targetWord)+targetWord.length());
			return newWord.toString();
		}else {
			return word;
		}
		
		
		  
	}
	/**
	 * 3. Create a method that takes integer(size), integer(bound) and returns List
of Integers.
Method idea: method should create list of integers and assign random
numbers between zero to given bound. Size of list should be given size.
	 * @param lists
	 * @param size
	 * @return
	 */
	public static List<Integer> assignNumbers( int size, int bound){
		List<Integer> newList=new ArrayList<>();
		Random random=new Random();
		for (int i=0; i<size; i++) {
			newList.add(random.nextInt(bound));
			
		}
		
		
		return newList;
	}
}
