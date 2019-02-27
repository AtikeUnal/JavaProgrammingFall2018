package Assignments;

public class ArraysAssignment_2 {
	public static void main(String[] args) {
		int[] a = {4,5,6};
		int[] b=new int[a.length+1];
		b[0]=6;
		b[1]=7;
		b[2]=8;
		b[3]=4;
		
		System.out.println("Array size of b is: "+b.length);
		System.out.print("Elements of b are: ");
		for(int elements:b) {
			System.out.print(elements+",");
		}
		System.out.println();
		System.out.println("=============================================================================");
		//========================================================================================
		
		
		String[] s_r= {"foo","hello","bar","world"};
		System.out.print(s_r[0]+" "+s_r[2]);
		System.out.println();
		System.out.println("=============================================================================");
		//=======================================================================================
		
		
		double[] d_r= new double[] {0.2,0.3,1.0,1.5,2.0};
		double result=d_r[2]+d_r[3];
		System.out.println(result);
	
		System.out.println("=============================================================================");
		//=======================================================================================
		int[] nums = {5,4,3,7,8,11};
		for(int n:nums) {
			System.out.println(n+" ");
		}
		System.out.println();
		System.out.println("=============================================================================");
		//=======================================================================================
	}
}
