

package Mentoring;
import java.util.*;
public class deneme6 {
	public static void main(String[] args) {
		
		 ArrayList<String>  arr = new ArrayList<String>();
		    arr.add("2");
		    arr.add("6");
		    arr.add("foo bar");
		    arr.add("abc");
		    
		  
		    String find_tst = search(arr,"foo");
		    System.out.print(find_tst);//foo bar
		
	}
	 public static String search(ArrayList<String> r, String find) 
	  {
	    String found="";
	    int count=0;
	   for(int i=0; i<r.size(); i++){
	     if(r.get(i).contains(find)){
	     found=r.get(i);
	     count++;
	     }else{
	     //  found="search failed";
	     }
	   }
	   if(count>0) {
	   return found;}else {
		   return "search failed";
	   }
	  }
	  }