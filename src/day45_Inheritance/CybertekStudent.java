package day45_Inheritance;

public class CybertekStudent extends Student{
/**
 * Create class CybertekStudent. Extend to Student.
* create instance variable batchID.
* Create classless InClassStudent and OnlineStudent. Extend both
classes to CybertekStudent.
 */
	
	int batchID;
	
	public CybertekStudent() {
		super();
	}
	
	public CybertekStudent(int s) {
		this();
		batchID=s;
	}
}
