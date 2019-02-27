package day51_abstraction_Polymorphism;

public interface Collapsible {
/**
 * 5. Create Interface Collapsible. Declare 4 abstract methods:
Void lock, void unlock, void fold, void unfold.
 */
	
	public abstract void lock();
	public abstract void unlock();
	public abstract void fold();
	public abstract void unfold();
}
