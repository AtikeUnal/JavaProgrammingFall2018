package day21_Loops;

public class findUniqueClass {
	public static void main(String[] args) {
		
		/*
		 * 3.Accept aString and print only unique characters in the String:
		 * speedlimit
		 * spedlimt
		 * 
		 * 
		 */
		String word="java";
		String unique="";
		for(int idx=0; idx<word.length(); idx++) {
	//	System.out.print(word.substring(idx,idx+1));
		if (!unique.contains(word.substring(idx,idx+1))) {
			unique+=word.substring(idx, idx+1);
		}
		}
		System.out.println(unique);	
	}
}
