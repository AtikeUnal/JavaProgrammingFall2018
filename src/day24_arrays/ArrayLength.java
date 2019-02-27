package day24_arrays;

public class ArrayLength {
	public static void main(String[] args) {
		//declare array names that can store 5 names
		String [] names=new String[5];
		names[0]="Ahmet";
		names[1]="Kerim";
		names[2]="Muhammet";
		names[3]="Elif";
		names[4]="Shirin";
		
		System.out.println(names.length);// here we get size of array (count of values in array).no paranthesis.
		
		String name=names[1];
		System.out.println(name.length());//here we get count of characters in String
	}
}
