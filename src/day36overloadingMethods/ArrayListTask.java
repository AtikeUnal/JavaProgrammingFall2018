package day36overloadingMethods;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class ArrayListTask {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		/**
		 * 
		 * 2. Create a program that asks names from user using Scanner and
keep adding each name to list. Then ask user if user wants to
continue adding names and keep adding to the list. In the end print
names.
input: Please enter name 1:
James
Do you want to add more name? Yes/No
Yes
Please enter name 2:
John
Do you want to add more names? Yes/No
No
Output: [James, John]
		 */
	boolean check=true;
	List<String> names=new ArrayList<>();
	while(check) {
		System.out.println("Please enter name:");
		names.add(scan.nextLine());
		System.out.println("Do you want to continue adding name? Yes/No");
		String answer=scan.next();
		if(answer.equalsIgnoreCase("No")) {
			check=false;
		}
	}
	}
}
