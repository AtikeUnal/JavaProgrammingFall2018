package day36overloadingMethods;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AddList {
	public static void main(String[] args) {
		/**
		 * Create a program that asks 5 names from user using Scanner and
keep adding each name to List of String collection. And print out
list of names in the end.
input: Please enter name 1:
James
Please enter name 2:
John
—————
——-
—
output: [James, John, …]
		 */
		Scanner scan=new Scanner(System.in);
		//String[] arr=new String[5];
		List<String> names=new ArrayList();
		String name="";
		for(int i=1; i<=5; i++) {
			System.out.println("Please enter name "+i);
			name=scan.nextLine();
			names.add(name);
		}  
		System.out.println(names);
		//=============================================================================================
		
		
		
		
		
	}
}
