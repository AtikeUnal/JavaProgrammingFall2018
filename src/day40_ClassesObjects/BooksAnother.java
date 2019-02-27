package day40_ClassesObjects;
import java.util.*;
public class BooksAnother {
	public static void main(String[] args) {
		
		/**
		 * Create a program that asks from user to enter total books and asks title,
author and pages. Then store each book to the list.
Input:
Please enter total books:
- 2
Please enter title for book 1:
- Leaders eat last
Please enter author for book1:
- Simon Sinek
Please enter pages for book1:
- 300
Please enter title for book 2:
- Zero to one
Please enter author for book 2:
- Blake Masters
Please enter pages for book 2:
- 140
Note: Print size of list of books and it should print 2.
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter total books: ");
		int bookNum=scan.nextInt();
		scan.nextLine();
		List<Book> newBooks=new ArrayList<>();
		
		
		for(int i=1; i<=bookNum; i++) {
			Book b1=new Book();
			System.out.println("Please enter title for book "+i);
			
			b1.title=scan.nextLine();
			System.out.println("Please enter author for book "+i );
			b1.author=scan.nextLine();
			System.out.println("Please enter pages for book "+i);
			b1.pages=scan.nextInt();
			scan.nextLine();
			newBooks.add(b1);
		}int size=newBooks.size();
		System.out.println(size);
	}
}
