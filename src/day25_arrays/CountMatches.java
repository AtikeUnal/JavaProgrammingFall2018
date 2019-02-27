package day25_arrays;

public class CountMatches {
	public static void main(String[] args) {
	/*create a double array called prices
	 * assign 10 or more different prices
	 * using a loop count how many items that is more than $20
	 * print the count
	 * If no price was found that is more than $20 then print
	 * "No items that costs more than $20
	 * 
	 * 	
	 */
		int count=0;
		double[] prices= {12.25, 12,32.36,46.45,87.62,25,30,6,7,10};
		for(double price:prices) {
			if(price>20) {
				count++;
			}
					}
		if(count==0) {
			System.out.println("No itmes for more than 20$");
		}else {
		System.out.println(count+" items with more than 20");
		}

	}
}
