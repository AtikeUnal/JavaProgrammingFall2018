package day34_MethodCreation;

public class Over {
	public static void main(String[] args) {
		/**METHOD OVERLOADING
		 * 
		 * --> In a class, having multiple versions of sam e method signature is called OVERLOADING THE METHOD
		 * 
		 * public static void sayHello (String name){
		 *    System.out.print("Hello,"+name);
		 *    
		 *     }
		 *     
		 *     -Sharing the same name with different Data type parameter or sharing the same name with different number parameters
		 * 
		 * --OVERLOADING THE METHOD HAPPENS ONLY WITHIN THE ONE CLASS
		 * --CHANGING RETURN TYPE DOESN'T OVERLOAD THE METHOD. RETURN METHOD SHOULD BE THE SAME TOO.
		 */
	}
	
	public static int add(int a, int b) {
		return a+b;
	}
	public static int sayHello(int a, int b, int c) {
		return a+b+c;
	}
}
