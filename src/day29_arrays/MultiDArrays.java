package day29_arrays;

public class MultiDArrays {
	public static void main(String[] args) {
		
		int[][] nums=new int[2][3];
		nums[0][0]=10;
		nums[0][1]=20;
		nums[0][2]=30;
		
		nums[1][0]=40;
		nums[1][1]=50;
		nums[1][2]=60;
		
		int [][] nums2= { {10,20,30}, {40,50,60}};
		System.out.println(nums[0][0]);// prints 10
		System.out.println(nums[0][2]);//prints 30
		
		
		//teading lrngth from 2d array:
		//find out how many 1d arrays are in 2d array
		System.out.println("number of arays: sout"+nums.length);
		//find out how many items in first array:index0
		System.out.println("number of values in first array:"+nums[0].length);
		
		int [][] nums3= {{10,20,30}, {40,50,60}, {70,80}};
		System.out.println(nums2.length);//2
		System.out.println(nums2[0].length);//3
		System.out.println(nums[1].length);//3
		
	}
}
