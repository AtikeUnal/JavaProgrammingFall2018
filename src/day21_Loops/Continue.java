package day21_Loops;

public class Continue {
	public static void main(String[] args) {
		
		for(int k=0; k<=10; k++) {
			if(k==1||k==2) {
				continue;// if condition is true java will skip printing result and will go to up to next loop
			}
			System.out.println("Value of k "+k);
		}
	}
}
