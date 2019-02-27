package Assignments;

import java.util.ArrayList;
import java.util.List;

public class ddd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> s=new ArrayList();
		s.add("asgabat");
		s.add("Mary");
		s.add("Dasoguz");
		s.add("Lebap");
		s.add("Turkmenbashy");
		for(int i=0; i<s.size(); i++) {
			if(s.get(i).equals("asgabat")) {
				s.remove(s.get(i));
			}
		}
		
		System.out.println(s.toString());
		

	}

}
