package day16_exercise;

public class BooleanWithAndWithOutIf {
	public static void main(String[] args) {
		/*
		 * <, <=, >=, !=, ==
		 * &&,||, !=, ==
		 * 
		 */
		boolean b=12>0;
		System.out.println(b);
		b = 12 > 10 && 10<15;
		System.out.println(!b);
		
		System.out.println(b);
		
		int zipCode=22099;
		
		if (zipCode<=22100 && zipCode++<=22200) {
			System.out.println("Mclean");
		}else {
			System.out.println("Not Mclean");
			
		}
		System.out.println(zipCode);
		
		double budget =500;
		
		double phone = 250.0;
		double watch = 105.5;
		double bag = 80;
		
		//-> 100
	}
}
