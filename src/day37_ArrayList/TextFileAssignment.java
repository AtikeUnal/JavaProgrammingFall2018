package day37_ArrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextFileAssignment {
	
	

		public static void main(String[] args) throws FileNotFoundException {
			List<String> names=new ArrayList<>();
			File file = new File("test.txt");
			
			Scanner sc=new Scanner(file);
			while(sc.hasNextLine()){
				
			String name = sc.nextLine().trim();
			if(!name.isEmpty()) {
				names.add(name);
			}
			
			}System.out.println(names.size());
			System.out.println(names);
		/**
		 * Write a program that reads values(student names) from test.txt file
and stores each student name into list. Then print the size.
Notice: test.txt file has empty lines which needs to be ignored when
adding to list.
		 */
			
			PrintInList(names);
			System.out.println();
			PrintNameWithLength(names, 6);
			SortPrint(names);
	}
		
		/**
		 * 4. Create a method that takes List of String(Students) and print out
student names from shortest length to longest length.
Notice: Assume that shortest length is 3 letters and longest is 15
letters.
		 * @param StudentList
		 * @param len
		 */
		public static void SortPrint(List<String> StudentList) {
			for(int i=3; i<16; i++) {
				PrintNameWithLength(StudentList, i);
			}
		}
		
		//=============================================================================================
		public static void PrintNameWithLength(List<String> StudentList, int len) {
			int count=0;
			for(String each:StudentList) {
				if(each.length()==len) {
					System.out.println(each);
					count++;
				}
			}
			//System.out.println("Total numbers of students with "+len+" characters are "+count);
		}
		/**
		 * 3. Create a method that takes List of String(Students) and
integer(length) and print out student name with given length.
		 * @param nameList
		 */
		//==============================================================================================
		public static void PrintInList(List<String> nameList) {
			/**
			 * 2. Create a method that accepts List of String(student names)
and prints out in the following format.
Ele1 - ele2 - ele3 - ele4 - ele5
Ele6 - ele7 - …
Notice: One line should only consist of 5 elements.
Output Sample:
Asel - Murat - Adina - Kutmanai - Aizhamal
Kamil - Daule - Sarinzhi - Sofia - Uran
Vlad - Yana - Guliza - Ruslan - Alex
Eldar - Ermek - Bermet - Sandra - Muhammed
			 */
			//iterate through the list
			//keep printing in one line with dash seperated
			// apply condition to check is already printed 5 student names
			//when hit condition we start new line
			int num=4;
			for(int i=0; i<nameList.size(); i++) {
				if(i==num) {
					System.out.print(nameList.get(i));
					System.out.println();
					num+=5;
				}
				else {
					System.out.print(nameList.get(i)+" - ");
				}
				
			}
		}
	
}
