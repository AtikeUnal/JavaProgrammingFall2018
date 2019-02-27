package day51_abstraction_Polymorphism;

public class HumanScale extends Chair implements Rollable, Collapsible{
/**
 * 3. Create non-abstract class Humanscale. Extend to Chair
and implement abstract methods. Simply print “sitting on
Humanscale chair” and “stepping on Humanscale chair”


 */
	
	public void sit() {
		System.out.println("Sitting on Humanscale chair");
	}
	public void stepOnIt() {
		System.out.println("Stepping on Humanscale chair.");
	}
	
	public void rollBack() {
		System.out.println("HumanScale chairs are rolling back");
	}
	public void rollForward(){
		System.out.println("HiumanScale chairs are rolling forward");
	}
	
	public  void lock() {
		System.out.println("HumanScale chairs are locked");
	}
	public  void unlock() {
		System.out.println("HumanScale chairs are locked");	}
	public  void fold() {
		System.out.println("HumanScale chairs are folding");	
	}
	public  void unfold() {
		System.out.println("HumanScale chairs are unfolding");	
	}
}
