package day4_operators;

public class BasicMathOperators {

public static void main(String[] args) {
	//create 2 int variables and assign values
	int num1=100;
	int num2=200;
	System.out.println(num1+num2);
	System.out.println(num1+num2+1000);
	int sum= num1+num2;
	System.out.println("Sum is "+sum);
	
	double apples=2.5;
	double carrots=3;
	double tomatoes=3.6;
	double total=apples+carrots+tomatoes;
	double tax=total*0.06;
	double totalTax=total+tax;
	System.out.println("Apples cost "+apples+" dollars, and carrots cost "+carrots+" tomatoes cost "+tomatoes+".");
	System.out.println("So your total before tax is "+total+" dollars");
	System.out.println("And your total with plus tax is "+totalTax+" dollars!");
			
}
}
