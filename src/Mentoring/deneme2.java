package Mentoring;
import java.util.*;
public class deneme2 {
	 public static void main(String[] args) {
		String one="asgabat";
		String two="kerimekb";
		
	 
	
		     String three="";
		    char [] ch1=new char[one.length()];
		    for(int i=0; i<one.length(); i++){
		       ch1[i]=one.charAt(i);
		     
		    }
		    System.out.println(Arrays.toString(ch1));
		    char [] ch2=new char [two.length()];
		    for(int k=0; k<two.length(); k++) {
		    	ch2[k]=two.charAt(k);
		    }
		    System.out.println(Arrays.toString(ch2));
		    char [] ch3=new char[ch1.length+ch2.length];
		    for(int j=0; j<ch3.length; j++) {
		    	ch3[j]=ch1[j];
		    	ch3[j+1]=ch2[j];
		    	
	  }
		   System.out.println(Arrays.toString(ch3));
		    
	 }
		  }
		