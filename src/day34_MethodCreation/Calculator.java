package day34_MethodCreation;

public class Calculator {

	public static void main(String[] args) {
		add(43l);
		byte b=32;
		char a='A';
		add(a);
		add(43,23);
	}
	public static void add(int i, long  l) {
		System.out.println("Int: "+i);
	}
	public static void add(long l) {
		System.out.println("Long: "+l);
	}
}
