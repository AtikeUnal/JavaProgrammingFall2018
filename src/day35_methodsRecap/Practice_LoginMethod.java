package day35_methodsRecap;

import java.util.Scanner;

public class Practice_LoginMethod {
	public static void main(String[] args) {
		String account=" ";
		String pass=" ";
		Login(account, pass);
	}
	public static void Login(String givenId, String givenPassword) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter account name: ");
		givenId=scan.next();
		System.out.println("Please enter password: ");
		givenPassword=scan.next();
		String expectedId="huseyin";
		String expectedPaswword="123456";
		if(!givenId.equals(expectedId)||!expectedPaswword.equals(givenPassword)) {
			System.out.println("Either your password or your account id is not correct");
		}else {
			System.out.println("Welcome");
		}
		
		/**
		 * Method name: login
Return type: void
Accepts 2 arguments
Parameter names; 
givenId
givenPassword
Provide within method
expectedId = "johnJava"
expectedPassword = "123456"

Create a logic that compares expectedId, and expectedPassword with givenId, givenPassword
Have the output as displayed.
		 */
		
	}
}
