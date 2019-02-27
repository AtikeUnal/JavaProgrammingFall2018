package Mentoring;
import java.util.*;
public class deneme{
	public static int[] deleteR(int[] arr,int element) {
	    
	    int [] newArr=new int[arr.length-1];
	 int temp=0;
	for(int each:arr){
	  if(each!=element){
	    
	    newArr[temp]=each;
	    temp++;
	   
	  }
	  
		  
	 
	   
	    
	     
	     
	}    
	   return newArr;
	   //end deleteR
	  

	}
	
  
  public static void main(String[] args) {
   
	int element1=5;
	int[] arr1= {1,2,5,4,6,7};
	for(int each:deleteR(arr1, element1)) {
		System.out.println(each);
	}
	
	String word="Asgabat";
	String unique="";
	word=word.toLowerCase();
	for(int i=0; i<word.length(); i++) {
		if(!unique.contains(word.substring(i, i+1))) {
			unique+=word.substring(i,i+1);
		}
		
	}System.out.println(unique);
	
  }
}
