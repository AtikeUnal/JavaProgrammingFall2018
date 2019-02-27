package day5_operators;

public class ShortHandOperators {
public static void main (String[] args) {
	int count=100;
	count=count+1;//variable count becomes 101.
	System.out.println(count);
	count=count+10;
	System.out.println(count);
	count+=10;
	System.out.println(count);
	
	count%=121;
	System.out.println(count);
	count+=15;
	System.out.println(count);
	count/=3;
	System.out.println(count);// all *,/,+,-,% functions work for this formula
	
	
}
}
