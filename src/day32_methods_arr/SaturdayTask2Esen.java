package day32_methods_arr;

import java.util.Arrays;

public class SaturdayTask2Esen {
	public static void main(String[] args) {
		
		String [] namess= {"James Bond", "Donald Trump", "Adam", "John Wick"};
		String [] newarr=getNamesWithLastNames(namess);
		System.out.println(Arrays.toString(newarr));
	//	for(String s:namess) {
		//	if(s.contains(" ")) {
			//	System.out.println(s);
			//}
		//}
		
	}
	
	//Pseudo code
	//Create a method that takes/accepts String array
	//And Returns String array
	//Logic: method should find an element that consist of two words and return that.
	//input: ["James Bond", "Adam", "John Wick", "Elize"]
	//output: ["James Bond", "John Wick"]
	public static String[] getNamesWithLastNames(String [] names) {
		int count=0;
		for(String name:names) {
			name=name.trim();
			int numOfWords=name.split(" ").length;
			if(numOfWords>1) {
				count++;
			}
		}
		String [] result=new String[count];
		int index=0;
		for(String name:names) {
			int numOfWords=name.split(" ").length;
			if(numOfWords>1) {
				result[index]=name;
				index++;
			}
		}return result;
	}

}
