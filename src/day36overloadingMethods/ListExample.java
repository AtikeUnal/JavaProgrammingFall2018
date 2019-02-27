package day36overloadingMethods;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		//Convert array to arraylist
		String [] oldNames= {"Trump", "Obama"};
		List<String> newNames=Arrays.asList(oldNames);// here it i catching while it is converting array to list.
		System.out.println(newNames);
		
		List<String> names=new ArrayList();
		
		names.add("James");
		names.add("Adam");
		names.addAll(newNames);
		System.out.println(names);
		Collections.sort(names);
		System.out.println(names);
		Boolean check=names.remove("James");
		System.out.println(names);
		System.out.println(check);
		/**
		 * list.get(index);
		 * list.indexOf(element);
		 * Arrays.asList(array);
		 * Collection.sort(list);
		 * list.addAll(list);
		 * list.size 
		 * list.remove(index or "");
		 */
	}
}
