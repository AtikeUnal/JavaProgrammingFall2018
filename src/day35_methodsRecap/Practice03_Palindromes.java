package day35_methodsRecap;

public class Practice03_Palindromes {
	public static void main(String[] args) {
		
		String name="civic";
		System.out.println(isPalindrome(name));
	}
	public static boolean isPalindrome(String word) {
		boolean palindrome;
		String str=" ";
		for (int i=word.length()-1; i>=0; i--) {
			str+=word.charAt(i);
			
		}
			if(!str.equals(word)) {
				palindrome=false;
			}else {palindrome=true;}
		
		return palindrome;
		
		/**
		 * ```Method name: isPalindrome
Return type boolean
Accepts a String as parameter
Returns the value as boolean (true/false) if the given string is palindrome or not
Output should be like: true, or false```
(edited)
		 */
	}
}
///cozulmedi