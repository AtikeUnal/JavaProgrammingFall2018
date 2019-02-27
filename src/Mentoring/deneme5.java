package Mentoring;
import java.util.*;
public class deneme5 {
	public static String combineRs(String[] r1,String[] r2) 
	  {
	    String a="";
	  List<String> newList1=Arrays.asList(r1);
	  List<String> newList2=Arrays.asList(r2);
	  newList1.addAll(newList2);
	  for(String each:newList1){
	    a+=each;
	  }
	  
	   return a;
	  }
	
public static void main(String[] arg) {
	
	String [] a= {"a", "b","d"};
	String [] b= {"c", "k"};
	List<String> list1=Arrays.asList(a);
	List<String> list2=Arrays.asList(b);
	List<String> finalList=new ArrayList<>();
	
	finalList.addAll(list1);
	finalList.addAll(list2);
	}
}

