package day14_stringmanipulation;

public class TrimExample {
	public static void main(String[] args) {
		// trim -->> deletes whitespace in the beginning and and of the string
		
		
		String str =" blah ";
		
		System.out.println(str);
		
		System.out.println(str.trim());
		
		System.out.println(str.length());
		
		//chaining -->>calling methods one after another
		System.out.println(str.trim().length());
		
		//========================================================================
		//we are reassigning the result of str.trim() into str
		
		str=str.trim();
		
		
		
	}
}
