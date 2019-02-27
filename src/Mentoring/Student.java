package Mentoring;

public class Student {
	String firstName;
	String lastName;
	static int studentCount=0;
	
	public Student(String f, String l) {
		firstName=f;
		lastName=l;
		studentCount++;
		System.out.println("Added Student: "+f+" "+l);
		System.out.println("Number of Students: "+studentCount);
		
	}

}
