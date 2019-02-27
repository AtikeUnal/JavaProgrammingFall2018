package Assignments;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
	    
	    
	    Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	    
	    String reversed = "";
	    //TODO: start your code here
	    String[]split=sentence.split(" ");
	    for(int i=split.length-1; i>=0; i--){
	      System.out.print(split[i]+" ");
	      reversed=split[i];
	      
	    }
	    
	    
	    
	    //End your code here. do not modify below statement
	   // System.out.println(reversed);
	}
}