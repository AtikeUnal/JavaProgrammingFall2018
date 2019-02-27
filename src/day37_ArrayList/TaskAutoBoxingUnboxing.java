package day37_ArrayList;
import java.util.*;
public class TaskAutoBoxingUnboxing {
	public static void main(String[] args) {
		/**
		 * 1.Create list of integers
		 * 2.Ask 5 integer from user and store into int type using scanner
		 * 3.then add each number if it is even number
		 */
		List<Integer> num=new ArrayList<>();
		Scanner scan=new Scanner(System.in);
		for(int i=0; i<=5; i++) {
			System.out.println("Enter a number please: ");
			int nums=scan.nextInt();
			if(nums%2==0) {
				num.add(nums);
			}
		}System.out.println(num);
	}
}
