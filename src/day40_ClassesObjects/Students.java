package day40_ClassesObjects;

public class Students {
	public static void main(String[] args) {
		
		
		Student s1=new Student();
		s1.name="Elifnur";
		s1.age=5;
		s1.email="elifnur15@gmail.com";
		
		Book b1=new Book();
		b1.title="White Ship";
		b1.author="Chingiz Aytmatov";
		b1.pages=125;
		s1.read(b1);
				
	}
}
