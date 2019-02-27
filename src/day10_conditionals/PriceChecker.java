package day10_conditionals;

public class PriceChecker {
	public static void main(String[] args){
	int price=55;
	String status;
	if(price>=1&&price<=50) {
		status="cheap";
	}else {
		if (price>=51&&price<=100) {
		status="Expensive";
	} else {
		status="alamok";
	}
}
	System.out.println("Status with if "+status);
	status=(price>=1&&price<=50)? "Cheap":(price>=51&&price<=100)? "Expensive":"alamok";
	
	System.out.println(status);
}
}