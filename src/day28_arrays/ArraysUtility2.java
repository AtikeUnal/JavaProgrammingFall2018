package day28_arrays;

import java.util.Arrays;

public class ArraysUtility2 {
	public static void main(String[] args) {
		
		String[] students= {"obama","donald","bush","john","adam"};
		System.out.println(Arrays.toString(students));//this is the way to print out the value of array string
		
	Arrays.sort(students);	//it sort array value alphabetically
	System.out.println(Arrays.toString(students));
		
//===================================================================================================================================
	int i=	Arrays.binarySearch(students,"john");//binary returns index of an item. And it requires array to be sorted.

		
		System.out.println(i);
	}
}
//binary search returns integer that represents index of a target element.
//returns negative integer if target element doesn't exist in arra'