package OCA;

public class Shark extends Fish{


	private int numberOffins=8;
	
	public Shark(int age) {
		super(age);
		this.size=4;
		
	}
	public void displaySharkDetails() {
		System.out.println("Shark with age: "+getAge());
	}
	
}
