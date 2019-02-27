package day40_ClassesObjects;

public class Student {
/**
 * Create a class Student
Instance variables: name, age, email
Instance methods:
read -> this method should not return anything and doesn’t accept
anything. Simply print out “student %studentName is reading”
read -> this method should not return anything. It accepts Book data type
and simply print out “student %studentName is reading %bookTitle by
%authorName”
 */
	String name;
	int age;
	String email;
	
	public void read() {
		System.out.println("Student "+name+" is reading");
	}
	
	public void read (Book anybook ) {
		System.out.println("Student "+name+" is reading "+anybook.title+" by "+anybook.author);
	}
}
