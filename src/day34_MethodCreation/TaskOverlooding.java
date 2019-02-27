package day34_MethodCreation;

import java.util.Arrays;

public class TaskOverlooding {
	public static void main(String[] args) {
		int [] nums= {1,2,3,5,8};
		String [] words= {"Ashgabat", "Mike", "John Wick", "Elize"};
		buildString(nums);
		System.out.println();
		buildString(words);
	}
	public static void buildString(int [] arr) {
		for(int each:arr) {
			System.out.print(each+", ");
		}
	}
	public static void buildString(String [] str) {
		for (String each:str) {
			System.out.print(each+", ");
		}
	}
	
}
