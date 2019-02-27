package day8_conditionals2;

public class LogicalOperators {
	public static void main(String[] args) {
		//truth table of AND (&&)
//		true-true-->true
//		true-false-->false
//		false-false-->false
		
		//////////////////////////////////////////////
		//truth table of OR(||)
//		true-true-->true
//		true-false-->true
//		false-false-->false
		///////////////////////////////////////////////
		
		//truth table of NOT(!)
//		not operator swaps/switches true to false or vice versa
		int pincode=200;
		if(!(pincode>0)) {
			System.out.println("pincode cannot be 0 or negative");
		}
	}
}
