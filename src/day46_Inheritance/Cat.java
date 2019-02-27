package day46_Inheritance;

public class Cat {
	
	int age;
	String name;
	static boolean isThereCatDisease;
	
	{  //instance initializer block
		System.out.println("Hey guys");
		age=1;
		name="Chili";
	}
	
	static {  //static initializer block
		System.out.println("Hey guys from static block");
		isThereCatDisease=true; 
		
	}
}
