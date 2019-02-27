package day25_arrays;

public class ArrayPrintReverse {
	public static void main(String[] args) {
		/*
		 * Create int array points/numbers and assign 10 different scores between 0 and 100
		 * 
		 * 
		 */
		
		int [] points= {1,2,3,4,5,6,7,8,9,10};
		if(points.length==10) {
			System.out.println("10 points found");
		}else {
			System.out.println("We need 10 points");
		}//1. Using a for loop print each item in reverse order in same line with space
		for(int i=points.length-1; i>=0; i--) {
			System.out.print(points[i]+" ");
		}
		System.out.println("\n--------------while loop------------------");
	int idx=points.length-1;
	while(idx>=0) {
		System.out.print(points[idx--]+" ");
		//idx--; both can be done
	}
	
	}
}
