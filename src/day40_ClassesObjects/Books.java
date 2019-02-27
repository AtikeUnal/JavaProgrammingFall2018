package day40_ClassesObjects;

import java.util.ArrayList;
import java.util.List;

public class Books {
	public static void main(String[] args) {
		
		Book book1=new Book();
		book1.title="White Ship";
		book1.author="Jengiz Aytmatov";
		book1.pages=160;
		
		Book book2=new Book();
		book2.title="White Fang";
		book2.author="Jack London";
		book2.pages=120;
		
		Book book3=new Book();
		book3.title="Crime and Punishment";
		book3.author="Dostoyevskiy";
		book3.pages=300;
		
		/**
		 * Add all 3 books to List. Loop
the list and print out authors for each book.-
		 */
		
		List<Book> threeBooks=new ArrayList <>();
		threeBooks.add(book1);
		threeBooks.add(book2);
		threeBooks.add(book3);
		
		for(Book each:threeBooks) {
			System.out.println(each.author);
		}
	}
}
