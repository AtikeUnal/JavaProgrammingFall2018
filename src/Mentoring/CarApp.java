package Mentoring;

public class CarApp {
	
	
	
	
	public static void main(String[] args) {
		
		Vehicle suv=new Vehicle();
		
		suv.brand="Toyot";
		suv.model="Highlander";
		suv.year=2018;
		suv.miles=20000;
	
	
		Vehicle hatchback=new Vehicle();
		hatchback.brand="Nissan";
		hatchback.year=2018;
		hatchback.miles=121000;
		
Vehicle sedan=new Vehicle();
		
		sedan.brand="Toyot";
		sedan.model="Highlander";
		sedan.year=2018;
		sedan.miles=20000;
	
	
		Vehicle truck=new Vehicle();
		truck.brand="Nissan";
		truck.year=2018;
		truck.miles=121000;
		
		System.out.println("All Vehicles are In the Lot");
		
		Vehicle [] vehicleArr= {hatchback, suv, sedan, truck};
		
		for(int i=0; i<vehicleArr.length; i++) {
			System.out.println("----------------------------------");
			System.out.println("Brand: "+vehicleArr[i].brand);
			System.out.println("Model: "+vehicleArr[i].model);
			System.out.println("Year: "+vehicleArr[i].year);
			System.out.println("Miles: "+vehicleArr[i].miles);
		}
		
	}
	
	
}
