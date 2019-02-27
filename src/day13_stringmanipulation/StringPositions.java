package day13_stringmanipulation;

public class StringPositions {
	public static void main(String[] args) {
		String alphabet = "ACDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(alphabet.indexOf("A"));
		int pPosition= alphabet.indexOf("P");
		System.out.println("P is at index "+pPosition);
		int hijLocation=alphabet.indexOf("HIJ");
		System.out.println("HIJ "+hijLocation);
		
		String sentence = "Today is Sunday and tomorrow is Monday";
		System.out.println(sentence.indexOf("Sunday"));
		System.out.println(sentence.indexOf("a"));//3
		System.out.println(sentence.lastIndexOf("a"));//36
		System.out.println(sentence.indexOf("a",6));// it starts to search "a" from 6th position

		if (sentence.indexOf("and")>=0) {
			System.out.println("word is there");
		}else {System.out.println("Word is not there");			
		}
	
		String searchResults="1-24 of over 50,000 results for Electronics:speaker";
		int pos = searchResults.indexOf("over");
	}
}
