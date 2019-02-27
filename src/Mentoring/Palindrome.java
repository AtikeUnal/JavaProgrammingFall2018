package Mentoring;

public class Palindrome {
	public static void main(String[] args) {
		// palindrome
		String word ="aataa";
		//create function take string as parameter and return is plaindrom or not :boolean
		
	}
	public static boolean isPalindrom(String word) {
		//what is there a 10000000
		//reverse is and compare
		for (int i=0; i<word.length(); i++) {
			String character1=word.charAt(i)+"";
			String character2=word.charAt(word.length()-1-i)+"";
			if(!character1.equals(character2)) {
		
		
		return false;
		}
		}
	return true;
}
}