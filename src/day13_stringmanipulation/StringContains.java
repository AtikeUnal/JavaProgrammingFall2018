package day13_stringmanipulation;

public class StringContains {
	public static void main(String[] args) {
		String word="water";
		System.out.println(word.contains("er"));// gives true return
		
		System.out.println(word.startsWith("w"));// returns boolean true
		System.out.println(word.endsWith("e"));// returns boolean false
	}
}
