package day35_methodsRecap;

import java.util.Arrays;
import java.util.Scanner;

public class Practice01_CountWords {
	public static void main(String[] args) {
	    System.out.println(coverString("java methods", "me") ) ; //java [me]thods
	  }
	  
	  public static String coverString(String main, String coverME) {
		
		  String cover="";
	    
	  for (int i=0; i<main.length(); i++){
	    if(main.substring(i,i+1).equals(coverME.substring(i, i+1))){
	      cover=coverME.substring(i, i+1);
	    }
	  }
	      
	      
	      return cover;
	  
	    
	  }
	  
	}