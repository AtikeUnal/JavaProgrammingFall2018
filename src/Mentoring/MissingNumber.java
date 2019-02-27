package Mentoring;
import java.util.Arrays;

public class MissingNumber {
		public static void main(String[] args) {
			int [] a = {4,6,7,10};
			int b = 10;
			findMissingNum(a,b);
		}
		public static void findMissingNum(int[] arr, int max) {
			Arrays.sort(arr);
			int currentValue = 1;
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] != currentValue) {
					for(int j = currentValue; j < arr[i]; j++) {
						System.out.println("Missing numbers: "+j);
					}
				}
				currentValue = arr[i]+1;
			}
		}
}




