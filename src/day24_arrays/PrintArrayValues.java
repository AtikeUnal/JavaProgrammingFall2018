package day24_arrays;

public class PrintArrayValues {
	public static void main(String[] args) {
		//create an array cars and directly assign following values:
		//Audi, Porche, BMW, Toyota, Honda, Tesla, Dodge, Kia, Acura
		String[] cars= {"Audi", "Porche", "BMW", "Toyota", "Honda", "Tesla", "Dodge", "Kia", "Acura","Fiat"};
		
		//print number of cars
		System.out.println(cars.length);
		
		int i=0;
		System.out.println(cars[i]);
		i++;
		System.out.println(cars[i]);
		
		System.out.println("\n");
		//print all values using a for loop.
		
		for(int k=0; k<cars.length; k++) {
			System.out.print(cars[k]+","+" ");
		}
			//print all values using a for each loop
		
		System.out.println("");
		
		for(String car : cars) {
			System.out.print(car+" ");
	
		}
			System.out.println("");
			int[] nums= {4,6,3,1,4};
			for (int number:nums) {
				System.out.print(number+", ");}
		
	
	}
}
