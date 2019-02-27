package day14_stringmanipulation;

public class SubstringExamples {
	public static void main(String[] args) {
		//substring gets part of a string
		//there are two versions, 1 takes in, 1 takes 2 ints
		// it it takes 1 int, it means starting point
		// we cannot give a number bigger than the length, it will return empty string
		
		"01234".substring(0);
		String str="01234";
		System.out.println(str.substring(1));
		
		String ktr="donaldtheduck@gmail.com";
		System.out.println(ktr.substring(14));
		
		//2 ints
		// first number is where the new string will start from
		// second number is where the string will end
		System.out.println(ktr.substring(0, 4));
		
		System.out.println(str.indexOf("01"));
		
	}
}
