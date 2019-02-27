package day12_class_object_strings;

public class StringClass {
	public static void main(String[] args) {
		String name="Huseyin";
		/*
		 * 1.Declaring a variable-->String name.
		 * 	-->variable name is name and type is String
		 * 	-->Hey java, I want you to create a variable called name
		 *	-->that can store String object
		 * 2.Assign value - String object. (Anything in double quotes is string object with that value).
		 * 
		 */
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.length());
		name=name.toUpperCase();
		System.out.println(name);
		System.out.println("chicago".length());// () --> is used to end the method/actions when you caall them using objects.
		
		int count = name.length(); //-->> you can make this assignment because method length returns us integer.
		System.out.println(name.charAt(2));
		char secondChar=name.charAt(0);
		System.out.println(secondChar);
		
	}
}

