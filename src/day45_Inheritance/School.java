package day45_Inheritance;
import java.util.*;
public class School {
	/**
	 * Create a class School
Instance variables: name, courses(list of string), totalStudents,
location
* Create constructor that accepts name and location. Set those
values to instance variables. Also instantiate courses within the
constructor.
* Create no-argument constructor and insatiate courses variable
inside this constructor.
* Encapsulate all instance variables. Make sure user shouldn’t be
able to set negative number to totalStudents.
* Create method teach. Void no argument method. Simply print
“teaching”

	 */

	private String name;
	private List<String> courses;
	private int totalStudents;
	private String location;
	
	public School(String name, String location) {
		this.name=name;
		this.location=location;
		courses=new ArrayList<>();
	}
	
	public School() {
		courses=new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<String> courses) {
		this.courses = courses;
	}

	public int getTotalStudents() {
		return totalStudents;
	}

	public void setTotalStudents(int totalStudents) {
		if(totalStudents>0) {
		this.totalStudents = totalStudents;
		}
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	public void teach() {
		System.out.println("teaching");
	}
	/**
	 * * Create method teach. Void and accepts one string(course) and print
“teaching course: %course”
* Create method addCourse. Void and accepts one string(course)
and adds this course to list of courses.
	 * @param course
	 */
	public void teach(String course) {
		
		System.out.println("teaching course: "+course);
	}
	public void addCourse(String course) {
		courses.add(course);
	}
}
