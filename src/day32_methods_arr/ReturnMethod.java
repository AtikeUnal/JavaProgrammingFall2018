package day32_methods_arr;

import java.util.Random;

public class ReturnMethod {
	public static void main(String[] args) {
		
		int i= getRandomBtwOneToHundred();
		System.out.println(i);
		String word="John";
		getAge(word);
	}
	public static int getRandomBtwOneToHundred() {
		//This method returns random number between 1 to 100 @retrun
		Random random=new Random();
		return random.nextInt(100);
		/**
		 * this method returns random number between 0 to 100
		 */
	}
	
	public static int getAge(String name) {
		if(name.equals("James")) {
			return 34;
		}else {
			return 55;
		}
	}
	
	
}
//methods parameters, arguments
//we can declare as many parameters as we want in java custom method creation
//Also we have option not to pass any parameter
// A method that doesn't take any argument