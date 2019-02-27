package day33_Method;

import java.util.Arrays;

public class StringArray {
	public static void main(String[] args) {
		
	String [] words= {"ahmet", "kate", "lake","rude"};
	StringWithGivenSize(words,5);
	}
	public static void StringWithGivenSize(String [] arr, int size) {
	
	for (int i=0; i<arr.length; i++) {
		if( arr[i].length()==5) {
			System.out.println(arr[i]);
		}
	}
	System.out.println(Arrays.toString(arr));
	}
}
/**
 * Create method that accepts String array and integer
(size) that prints out Strings with the given size.
Input: [“James”, “john”, “Adam”, “Brian”], 5
Output: James
 * 
 */


