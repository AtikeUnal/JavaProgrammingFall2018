package day28_arrays;

public class ArraysTwoDimension {
	public static void main(String[] args) {
		
		//what arrays can take?
		//int[][]nums=new int[3][];//when declaring two dimension arrays you can leave empty inner box
		int[] [] numbers= {{1,2,3}, {10,20,30},{100,200,300}};
		System.out.println(numbers[1][0]); //it prints out arrays item which is located index(1) of outer array and index(0) inner array.
		System.out.println(numbers[2][0]);// get print out of number 100 
		
	//	===============================================================
		int[][]nums=new int[3][];
		int[]ages= {26,25,50,100};
		
		nums[0]=ages;
		System.out.println(nums[0][2]);
	}
}
