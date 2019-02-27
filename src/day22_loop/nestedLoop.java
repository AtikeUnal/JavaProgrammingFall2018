package day22_loop;

public class nestedLoop {
	public static void main(String[] args) {
		//loop inside of loop is called nested loop
		//write a program that prints numbers from 1 to 10 in same line seperated by space
		for(int j=1; j<=5; j++) {//it means run 5 times whatever you have in your s
		for(int i=1; i<=10; i++) {
			System.out.print(i+" ");
			
		}System.out.println();
		}
		System.out.println("Outside the loop");
		
		//=====================================================================================================
		for(int j=1; j<=10; j++) {
			
			for(int i=1; i<=j; i++) {
			
				System.out.print(i+" ");
			
			}System.out.println();
			}
		//===================================================================================================
	
		for(int j=10; j>=1; j--) {
			
			for(int i=1; i<=j; i++) {
			
				System.out.print(i+" ");
			
			}System.out.println();
			}
	}
}
