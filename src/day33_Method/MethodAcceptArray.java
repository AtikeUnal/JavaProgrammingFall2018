package day33_Method;

import java.util.Arrays;

public class MethodAcceptArray {
	public static void main(String[] args) {
		
		int [] arr= {23,12,43,23,5,3,1};
		int number=10;
		
		ReturnIntegerArray(arr,number);
		
		//how to catch result of method
		int[] newArray=ReturnIntegerArray(arr,number);
		System.out.println("Printing from main method after catching");
		System.out.println(Arrays.toString(newArray));
		
	}
	public static int[] ReturnIntegerArray(int nums [],int target ) {
		System.out.println(Arrays.toString(nums));
		System.out.println(target);
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
			nums[i]=target;
		}
		System.out.println("After the loop:");
		System.out.println(Arrays.toString(nums));
		return nums;
	}
}
