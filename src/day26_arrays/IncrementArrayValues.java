package day26_arrays;

public class IncrementArrayValues {
	public static void main(String[] args) {
		/*
		 * 1. Declare array nums and assign {1,2,3,4,5,6,7,8,9}

		2. Print out all values in single line separated by space:

			1 2 3 4 5 6 7 8 9

		3. Using a Loop write some code to do the following:

       if the value is even - double it and assign back. If the value is odd - triple it and assign back.

			4. Print out all values in single line separated by space:

				3 4 9 8 15 12 21 16 27
		 * 
		 */
		int [] nums= {1,2,3,4,5,6,7,8,9};
		for(int n:nums) {
			System.out.print(n+" ");
				
		}
		System.out.println();
		for(int n:nums) {
			if(n%2==0) {
				n=n*2;
			}else if(n%2==1) {
				n=n*3;
			}System.out.print(n+" ");
		}
	}
}
