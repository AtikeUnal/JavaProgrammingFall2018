package day32_methods_arr;

public class SaturdayTask2 {
	public static void main(String[] args) {
		
		String [] std= {"Ahmet", "John Wick", "Elize"};
		StudentLastName(std);
		
	}
	public static String[] StudentLastName(String [] Student) {
		int i=0;
		String [] arr= {};
		for(String each:Student) {
			if(each.contains(" ")) {
				arr[i]=each;
				
			}
			
		}return arr;
	}
	
}
