package day49_Abstraction;

public abstract class Phone extends Device {
	
	public Phone() {
		
	}
//Abstract class can not have private or final,  static ABSTRACT methods
	public abstract void call();
	
	public abstract void receiveCall();
	
	//Abstract class can have abstract and non-abstract methods, but does not have to have any method at all.
	public void text() {
		System.out.println("Phone is texting");
	}
	
	@Override
	public void charge() {
		System.out.println("Implemented in Phone class");
	}
	
}
