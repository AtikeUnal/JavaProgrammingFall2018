package day32_methods_arr;

import java.util.Arrays;
import java.util.Random;

public class SaturdayTasks {
	public static void main(String[] args) {
		
		int [] arr=GetUniqueRandomNumbers(4,15 );
		System.out.println(Arrays.toString(arr));
		
	}
	public static int[] GetUniqueRandomNumbers(int size, int bound ) {
		int [] result=new int[size];
		
		Random random=new Random();
		boolean check=true;
		int index=0;
		while(check) {
			int ranNum=random.nextInt(bound);
			if(!checkNumberInArray(result,ranNum)) {
			index++;	
			result[index]=ranNum;
			}
			if(index==size-1) {
				check=false;
			}
		}
		return result;
	}
	
	public static boolean checkNumberInArray(int [] arr, int target) {
		for (int i:arr) {
			if (i==target) {
				return true;
			}
		}
		return false;
		
	
	}
	
}
