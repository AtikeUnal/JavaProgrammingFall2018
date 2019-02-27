package day31_ArraysRecap;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysCopyOfRange {
	public static void main(String[] args) {
		//Arrays.copyOfRange(originalArray, from, to);
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int sizeOfArray=scan.nextInt();
		int count=1;
		int[] array= new int[sizeOfArray];
		for (int i=0; i<sizeOfArray; i++) {
			System.out.println("Please enter element N "+count);
			array[i]=scan.nextInt();
			count++;
		}System.out.println("String value of your array is "+Arrays.toString(array));
		int [] arr1= Arrays.copyOfRange(array, 0, array.length/2);
		int [] arr2=Arrays.copyOfRange(array, array.length/2, array.length);
		System.out.println("First half of your array is "+Arrays.toString(arr1));
		System.out.println("First half of your array is "+Arrays.toString(arr2));
	}
}
