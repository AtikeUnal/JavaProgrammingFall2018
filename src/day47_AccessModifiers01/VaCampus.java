package day47_AccessModifiers01;

public class VaCampus {

	
	//VaCampus has a VacampusStudent
	VaCampusStudent campusStudent=new VaCampusStudent();
	
	
	public static void main(String[] args) {
		Student student1 =new Student();
		
		student1.name="Serik";//public
//		student1.ssn ssn is private. Only visible in same class.
		student1.age=27;
		student1.campus="Mclean VA";
		
	}
}
