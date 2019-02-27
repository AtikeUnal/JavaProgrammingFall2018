package day4_operators;

public class AgeCalculator {
	public static void main(String[] args) {
	
		int currentYear=2018;
		int yearOfBirth=1979;
		int age=currentYear-yearOfBirth;
		System.out.println("My age is "+age);
		System.out.println("If you are born on "+yearOfBirth+" year then you are "+age+" years old.");
		String output="If you are born in "+yearOfBirth+" year then you are "+age+" years old.";
		System.out.println(output);
	}

}
