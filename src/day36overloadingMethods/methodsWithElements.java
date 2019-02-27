package day36overloadingMethods;

public class methodsWithElements {
	public static void main(String[] args) {
		
		
	}
	public static int[] addElements(int[] ints1, int[] ints2) {
		//int[] ints1= {10, 40, 50, 3, 1};
		//int [] ints2[]= {11, 0, 500, 44,1101};
		int [] ints3=new int[ints1.length];
		for(int i=0; i<ints1.length; i++) {
			ints3[i]=ints1[i]+ints2[i];
		}return ints3;
	}
}
