package day31_ArraysRecap;

import java.util.Arrays;

public class Grocery {
	public static void main(String[] args) {
		String[] groceryList= {"apple", "carrot", "orange", "cherry", "strawberry"};
		Arrays.sort(groceryList);
		System.out.println("Index of apple is: "+Arrays.binarySearch(groceryList,"apple"));
		System.out.println("Index of apple is: "+Arrays.binarySearch(groceryList,"orange"));
	}
}
