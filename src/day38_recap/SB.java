package day38_recap;

public class SB {
 public static void main (String [] args) {
	 
	 //Immutable -->aka NOT changeable
	 //when you change value of a string and reassign it, hashCode of that same string 
	 // will give you completely different value. Logic is: once you create String which stored in certain 
	 //location of memory you can not change it in that memory location. 
	 String s="james";
	System.out.println(s.hashCode());
	System.out.println("Initial value: "+s);
	s=s.substring(1,3);
	System.out.println("After value: "+s);
	System.out.println(s.hashCode());
	
	//======================================================================================================
	
	//MUTABLE
	//StringBuilder-- Mutable version of String
	//Its original value is changable.
	System.out.println("------------MUTABLE EXAMPLES--------");
	StringBuilder sb=new StringBuilder("James");
	System.out.println(sb);
	System.out.println(sb.hashCode());
	sb.append("Bond");// concating bond to james.
	System.out.println(sb);
	System.out.println(sb.hashCode());//even if you change values of stringbuilder hashCode keep showing same location.
	sb.reverse();
	System.out.println(sb);
	sb.delete(2, 4);
	System.out.println(sb);
	sb.insert(2, "Hello");
	System.out.println(sb);
	
	System.out.println("");
	System.out.println("=================================================================================");
	System.out.println();
	String str="Adam";
	StringBuilder str2=new StringBuilder(str);
	str2.reverse();
	System.out.println(str2);
	str=str2.toString();
	System.out.println(str);
	
	
	
 }
}
