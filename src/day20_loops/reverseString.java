package day20_loops;

public class reverseString {
	public static void main(String[] args) {
		
		
		String word="Java";
		String reversed="";
		
		/*
		 * using for loop-loop from length of word -1 until 0.
		 * and use either charAt or substring and add that chatcter
		 * to reverse string
		 * 
		 */
		
		for (int index=word.length()-1; index>=0; index--) {
			reversed=reversed+word.charAt(index);
		}
		System.out.print(reversed);
	}
}
