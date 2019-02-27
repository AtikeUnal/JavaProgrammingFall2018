package day5_operators;

public class CastingPrimitives {
	public static void main(String[] args) {
		int i=100;
		byte b=(byte)i;
		// implicit casting examples:putting smaller into larger
		byte count=124;
		int bytecount=count;
		
		//Explicit casting:Whenever we convert/cast larger type into smaller type: putting larger into smaller
		int students=70;
		byte byteStudents=(byte) students;
		int x= (int)(5/2.0);
	}
}
