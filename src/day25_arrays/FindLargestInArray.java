 package day25_arrays;

import java.util.Scanner;

public class FindLargestInArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter How many items in array: ");
		int count=scan.nextInt();
		int[] numbers=new int [count];
		//using a loop enter values one by one
		for(int i=0; i<count; i++) {
			System.out.println("Enter number "+(i+1) );
			numbers[i]=scan.nextInt();
			
		}//System.out.println(numbers[0]);
		for (int range:numbers){
			System.out.print(range+" ");
		}
		System.out.println();
		//iterate in array and find the largest value
		//loop through the rest and check if they are greater than value of largest
		//if true -->> assign that value into largest
		//print out"Largest:+ largest after the loop
		int largest=numbers[0];
		int smallest=numbers[0];
		for(int indx=0; indx<count; indx++) {
			if(largest<numbers[indx]) {
				largest=numbers[indx];
			}
			
			
		}for (int nums:numbers) {
			if(smallest>nums) {
				smallest=nums;
			}
		}
		System.out.println(largest+" is"+" "+"the largest after the loop");
		System.out.println(smallest+" is"+" "+"the smallest after the loop");
	}
}
