package day49_OverridingRecap;

public class A extends AA{

	public static void main(String[] args) {
		A a = new A(); 
	}
	
	public A() {
		super();
		System.out.println("A NO ARG ");
	}

}

class AA extends AAA{
	public AA() {
		super();
		System.out.println("AA NO ARG ");
	}
}

class AAA {
	public AAA() {
		super();
		System.out.println("AAA NO ARG ");
	}
}




