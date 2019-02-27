package day10_conditionals;

import java.util.Scanner;

public class FindASeason {
	
	    public static void main(String[] args){
	  /*
	   * 1.Find a season month-->number and find the season of the year for that month      
	   */
	    	Scanner scan=new Scanner (System.in);
	    	System.out.println("Enter a number:");
	    	int month=scan.nextInt();
	    	if (month==1||month==2||month==12) {
	    		System.out.println("it is winter time");
	    	}else if (month==3||month==4||month==5) {
	    		System.out.println("it is spring time");
	     	}else if (month==6||month==7||month==8) {
	    		System.out.println("it is august time");
	     	}else if (month==9||month==10||month==11) {
	    		System.out.println("it is autumn time");
	     	}else {System.out.println("rejected");
	     	}
	    }
	    
	    
	
	    
	    
}




	    
  
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    