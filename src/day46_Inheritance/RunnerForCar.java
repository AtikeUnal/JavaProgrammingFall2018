package day46_Inheritance;

public class RunnerForCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c=new Car();
		c.startEngine();
		c.color="Blue";
		
		Motorcycle m=new Motorcycle();
		
		m.type="Harley Davidson";
		
		Motorcycle.fixVehilce("12/12/2018");
		
		Cat cat1=new Cat();
			/**
			 * when there is static block , if you create an object from a class static block from that class 
			 * will be called veri first. after static block intializer will come instance initializer and
			 * constructros at very end.
			 */
	}

}
