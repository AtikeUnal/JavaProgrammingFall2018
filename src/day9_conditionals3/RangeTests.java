package day9_conditionals3;

public class RangeTests {
	public static void main(String[] args) {
	
		int student = 0;
		if (student>5 && student<30) {
			System.out.println("Lets do mentoring session");
	}	else if(student>=30 && student<=60) {
		System.out.println("print lets have a lecture");
	}	else if(student>60){
		System.out.println("70 students enough to take online");
	}
		
	}
}
