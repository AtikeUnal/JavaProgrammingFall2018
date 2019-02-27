package day50_Interface;

public interface Inter {
	
	public static final int age=26;//whether it is written or not, static final is there
	
	public abstract void play();
	//abstract methods don't have bodies.
	//if you want methods have bodies it should be default or static.
	
	public static void staticMethod() {
		System.out.println("This is some method with body in interface");
	}
	
	default void defaultMethod() {
		//defaul here is not access modifier . it is keyword. this is default method.
	}
}
