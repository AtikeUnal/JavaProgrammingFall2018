package Assignments;

import java.util.Scanner;

public class email {
	  public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
		    String email = input.nextLine();
		    
		    //Write your code below
		    String [] split=email.split("@");
		   int count=0;
		   for(int i=0; i<email.length(); i++) {
			   if(email.charAt(i)=='@') {
				   count++;
			   }
			   
			   }if(count>=2||count<=0) {
				   System.out.println("invalid email");
		   }else {
		 
		 
		      System.out.println("Email id: "+split[0]);
		      System.out.println("Email domain: "+split[1]);
		      
		   }
		  }
		}
