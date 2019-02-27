package day40_ClassesObjects;

public class ComputerType {
	public static void main(String[] args) {
		
		Computer comp1=new Computer();
		
		comp1.model="Toshiba";
		comp1.color="Black";
		comp1.memory=8;
		comp1.size=15;
		comp1.news=true;
		comp1.turnOff();
		
		Computer c2=new Computer();
		c2.model="Dell";
		c2.turnOff();
	}
}
