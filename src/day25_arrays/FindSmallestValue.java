package day25_arrays;

public class FindSmallestValue {
	public static void main(String[] args) {
		
		int[] numbers= {10,20,30,15};
		
		int smallest=numbers[0];
		for(int nums:numbers) {
			System.out.print(nums+" ");
			if(smallest>nums) {
				smallest=nums;
			}
			
		}
		System.out.println();
		System.out.println(smallest+" is smallest number.");
	}
}
