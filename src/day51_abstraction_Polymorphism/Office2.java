package day51_abstraction_Polymorphism;

public class Office2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rollable a =new Aeron();//on left side we can use itself, higher level parent or interface implemented by aeron.
		a.rollBack();
		a.rollForward();
		
		
		Chair h=new HumanScale();
		h.sit();
		System.out.println("==============================================================");
		//casting:
		((HumanScale)h).rollBack();
		((HumanScale)h).fold();
		/**
		 * There is up casting and down casting. Upcasting is using parent class as reference.
		 * Downcasting is using child class which is itself as reference.
		 */
	}

}
