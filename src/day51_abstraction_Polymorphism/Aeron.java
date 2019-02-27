package day51_abstraction_Polymorphism;

public class Aeron extends Chair implements Rollable{
/**
 * 2. Create non-abstract class Aeron. Extend to Chair and
implement abstract methods.
Simply print “sitting on Aeron chair” and “stepping on Aeron
char”


6. Implement Rollable in Aeron class.
 */
	
	public void sit() {
		System.out.println("Sitting on aeron chair");
	}
	public void stepOnIt() {
		System.out.println("Stepping on Aeron chair.");
	}
	
	public void rollBack() {
		System.out.println("Areon chairs are rolling back");
	}
	public void rollForward(){
		System.out.println("Areon chairs are rolling forward");
	}
}
