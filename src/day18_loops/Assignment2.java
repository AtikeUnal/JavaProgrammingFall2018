package day18_loops;

public class Assignment2 {
	public static void main(String[] args) {

		String garage = "Toyota, Nissan, Honda, BMW, Mazerati, Ford";
		garage=garage.toLowerCase();

		if (garage.isEmpty()) {
			System.out.println("No cars in garage");
		}
		if (garage.contains("toyota") || garage.contains("nissan")) {
			System.out.println("There is a Japanese car in garage");
		} else {
			System.out.println("No Japanese car in garage");
		}

		if (garage.contains("bmw")) {//in these all cases we also can use garage.indexOf("bmw")-1. it gives same result
			System.out.println("There is a German car in garage");

		} else {
			System.out.println("No German car in garage");
		}
		if (garage.contains("mazerati")) {
			System.out.println("There is an italian car in garage");
		} else {
			System.out.println("No italian car in garage");
		}
		if (garage.contains("jaguar")) {
			System.out.println("There is a british car in garage");
		} else {
			System.out.println("No british car in garage");
		}

	}
}