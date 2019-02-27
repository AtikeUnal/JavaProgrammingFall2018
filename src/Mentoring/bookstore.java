package Mentoring;

import java.util.ArrayList;
import java.util.List;

public class bookstore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Book.pageCount=200;
		
		Book b=new Book();
		b.author="Dostoyevski";
		
		Book c=new Book();
		c.author="Victor Hugo";
		
		Book.price=25.12;
		
		Book.read();
		
		b.reads();
		
		
		
		List<String> list= new ArrayList();
		list.add("Ahal");
		list.add("mary");
		list.add("lebap");
		list.add("balkan");
		list.add("dashoguz");
		System.out.println(list.toString());
		list.clear();
		System.out.println(list.toString());
		
	}

}
