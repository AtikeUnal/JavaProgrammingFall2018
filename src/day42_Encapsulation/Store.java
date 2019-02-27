package day42_Encapsulation;

public class Store {
	public static void main(String[] args) {
		
		Apple a=new Apple();
		a.setColor("whatever");
		a.size=-23;
		
		/**
		 * GETTERS AND SETTERS--->
		 * 
		 *    -has to be public
		 * 
		 */
		
		
		Human h=new Human();
		h.setAge(100);
		System.out.println(h.getAge());
		
		Human h2= new Human();
		System.out.println(h.todaysDate);
		h.todaysDate="November, 6 2018";
		System.out.println(h2.todaysDate);
		
		System.out.println(Human.todaysDate);
		
		Human.todaysDate="8 noyabr, 2018";
		System.out.println(Human.todaysDate);
		
		
		
	}
}
