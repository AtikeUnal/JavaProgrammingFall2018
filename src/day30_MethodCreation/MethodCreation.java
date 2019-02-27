package day30_MethodCreation;

public class MethodCreation {
	public static void main(String[] args) {
		printLastLetter("brest");
	}
	
	public static void printLastLetter(String word) {
		
		if(word.isEmpty()) {
			System.out.println("Your word is empty");
			return;//this type of return used to stop void method.
		}
		System.out.println(word.charAt(word.length()-1));
	}
	public static void setAge(int age) {
		//age will be set to students age
	}
}
//We can create our own method and use it in main method
//we do that way to reuse it later and to be more organized.
//*Return type---> replacing the 'void' keyword with any other DataType in the method signature.

// public static int m1(){
// return 5; 
//}

//Datatype--> returning value must match to the declared datatype
// return keyword has to get executed and after using 'return' statement method gets terminated
// use (whoever invoking the method) has option to catch the returning value or not to catch it.
//However, catching the returning value it is the most proper use of it

//2.void: *This doesn't return any value
//*we use 'return' keyword to terminate execution of void methods.

