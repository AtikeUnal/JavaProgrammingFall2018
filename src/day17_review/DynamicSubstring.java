package day17_review;

public class DynamicSubstring {
	public static void main(String[] args) {
		String sentence= "We are learning Java programming";
		//find position of learning and programming. 
		//pass those numbers so substring and retrieve "Java"
		
		int posOfLearning=sentence.indexOf("learning");
		
		int posOfProgramming=sentence.indexOf("programming");
		
		System.out.println(posOfLearning);
		System.out.println(posOfProgramming);
		
		System.out.println(posOfLearning +="learning".length());// learning indexi uzerine learning harf sayisi kadar sayi katiyor boylece leraningden sonraki ilk bosluga ulasiyor
		
		String language=sentence.substring(posOfLearning, posOfProgramming);
		System.out.println(language.trim());
		
	}
}
