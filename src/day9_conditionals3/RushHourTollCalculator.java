package day9_conditionals3;

public class RushHourTollCalculator {
	public static void main(String[] args) {
		//*0-100 ->5$
				//101-500->8$
				//501-1000->10$
				//more than 1000->12$
		//RUSH HOURS:
		//0-100->10
		//101-500->16
		//501-1000->20
		//More than 1000->24
		
		boolean isRushHour=true;
		int miles=252;
		double tollCost=0.0;
		
		if(miles>0 && miles<=100) {
			if(isRushHour==true) {
				tollCost=10.0;
			}else {
				tollCost=5;
			}
		}
		else if(miles>101 && miles<=500) {
			if(isRushHour==true) {
				tollCost=16.0;
			}else {
				tollCost=8;
			}
		}else if(miles>501 && miles<=1000) {
			if(isRushHour==true) {
				tollCost=20.0;
			}else {
				tollCost=10;
			}
		}else if(miles>1000) {
			if(isRushHour==true) {
				tollCost=24.0;
			}else {
				tollCost=12;
			}
		}
		System.out.println("your toll cost is: "+ tollCost);
}
}