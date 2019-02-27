package day27_arrays;
import java.util.*;
public class largestWord {
	

	public static void main(String[] args) {
		
		  Scanner input = new Scanner(System.in);
			String[] words = new String[5];
			for(int i = 0; i < 5;  i++) {
			  
			  words[i] = input.nextLine();
			  
			}
			
			String largest="";
			int longest=0;
		
			for(int i=0; i<words.length; i++ ){
			  if(words[i].length()>longest) {
			  longest=words[i].length();
			  largest=words[i];
			}
		
			
		}System.out.println(longest);
		System.out.println(largest);

	}
	}
