package day24_arrays;

public class ArraysCreation {
	public static void main(String[] args) {
		int [] numbers=new int[5];
		numbers[0]=2;
		numbers[1]=33;
		numbers[2]=45;
		numbers[3]=1;
		numbers[4]=5;
		
		System.out.println(numbers[2]);
		System.out.println("=================================================");
		System.out.println(numbers[2]+numbers[0]);
		System.out.println("=================================================");
		numbers[0]=numbers[3]+numbers[4];
		System.out.println(numbers[0]);
		
		//Declare a char array grades and assign A,B,C,D,E to it.
		//use any one of 3 ways 
		char[] grades= {'A','B','C','D','E'};// this is another way of declaring array.it useful when you know all the values you want to assign.
		System.out.println(grades[1]);
		
		
		System.out.println("================================================");
		char [] grades2=new char[5];
		grades2[0]='A';
		grades2[1]='B';
		grades2[2]='C';
		grades2[3]='D';
		grades2[4]='E';
		
		System.out.println("\n");
		System.out.println("================================================");
		
		String[] cities=new String[3];
		cities[0]="Ashgabat";
		cities[1]="New York";
		cities[2]="Chicago";
		System.out.println(cities[0]);
				
}
}