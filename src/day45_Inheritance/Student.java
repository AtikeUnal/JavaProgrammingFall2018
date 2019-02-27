package day45_Inheritance;

public class Student {
	/**
	 * Create class Student
Instance variables: name, age, location
* create method study. This method accepts course and doesn’t
return anything. Simply print “studying %course”
* create method takeExam. Method should accept integer and
returns boolean. Check if integer is more than 80 return true, else
return false;
	 */
	
	String name;
	int age;
	String location;
	
	public void study(String course) {
		System.out.println("studying "+course);
	}
	
	public boolean takeExam(int n) {
	
		if(n>80) {
			return true;
		}
		
		return false;
	}
}
