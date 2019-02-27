package day24_arrays;

public class warmUpTask {
	public static void main(String[] args) {
		
		
		//if statement will run only condition is true
		//in boolean conditions dont look at result , just look whether its true or false.
		int k = 0;
		for (int i= 10; i> 0; i--){
			while (i> 3) i-= 3;//inner loop runs more than outer loop. Because it will keep running until condition is false. Once 
								//Once it is false it will get out of the loop and will go up to check outer loop.
			k += 1; 
			}
		System.out.println(k);
	}
}
