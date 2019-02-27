package day25_arrays;

public class SumOfArray {
	public static void main(String[] args) {
		/*create variable nums-assign several values
		 * using a loop calculate the sum and print it
		 * calculate sum of evens
		 * calculate sum of odds 
		 * 
		 */
		int sum=0;
		int[] numbers= {10,20,30,15,25,35};
		for(int n:numbers) {
			sum=sum+n;
		}//System.out.println(sum);
		int SumOfOdds=0;
		int SumOfEvens=0;
		for (int n:numbers) {
			if (n%2==0) {
		SumOfEvens+=n;
		
			}else {
			SumOfOdds+=n;
			}
			}System.out.println("Sum of all is "+sum);
			System.out.println("Sum of evens is "+SumOfEvens);
			System.out.println("Sum of odds is "+SumOfOdds);
	}
}
