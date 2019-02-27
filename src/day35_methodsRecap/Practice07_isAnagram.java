package day35_methodsRecap;

import java.util.Arrays;

public class Practice07_isAnagram {
	public static void main(String[] args) {
	String	word2="charm";
		String word1="hmarch";
		
		System.out.println(isAnagram(word1,word2));
	}
	
	public static boolean isAnagram(String word1, String word2) {
		boolean anagram=true;
		//word2="charm";
		//word1="march";
		if(word1.length()!=word2.length()) {
			return false;

		}
		char[] char1=word1.toCharArray();
		char[] char2=word2.toCharArray();
		
		Arrays.sort(char1);
		Arrays.sort(char2);
		for(int i=0; i<word1.length(); i++) {
			if(char1[i]!=char2[i]) {
				anagram=false;
			}
		}
		return anagram;
	}
}
