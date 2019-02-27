package day30_MethodCreation;

public class Calculated {
	public static void main(String[] args) {
		add(34,23);
		int k=add(43,23);
		System.out.println(k);
	}
	public static int add(int i, int j) { 
		int sum=i+j;
		return sum;
		//System.out.println("Sum is: "+sum);
		/*
		 * Return methods
		 * -->replace 'void' keyword in 
		 * 
		 * 
		 */
	}
}
