package day36overloadingMethods;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethdo {
	public static void main(String[] args) {
		
		List<String> names=new ArrayList<>();
		names.add("James");
		names.add("Adam");
		names.add("obam");
		names.add("Jamile");
		names.add("Kerime");
		System.out.println(removeAll(names,4));
		/**
		 * 4. Create a method that accepts List of String and integer(size). This
method should remove all the elements with given size. And returns
new List of String which doesn’t include elements with given size.
Input: [James, Adam, John, Elize], 4
Output: returns list [James, Elize]
		 */
	}
	public static List<String> removeAll(List<String> lists, int size){
		
		List<String> newList=new ArrayList<>();
		
		for(int i=0; i<lists.size(); i++) {
			if(lists.get(i).length()==size) {
				lists.remove(i);
				i--;
			}
			
		}
		newList.addAll(lists);
		return newList;
	} 
}
