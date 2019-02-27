package day45_Inheritance;

public class SchoolManagment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CodingBootcamp cb=new CodingBootcamp();
		
		InClassStudent st1=new InClassStudent();
		OnlineStudent st2=new OnlineStudent();
		st2.age=15;
		st1.age=16;
		st2.batchID=8;
		st1.batchID=10;
		
		st2.name="Mekan";
		System.out.println(st2.name);
	}

}
