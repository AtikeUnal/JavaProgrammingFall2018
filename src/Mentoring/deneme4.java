

package Mentoring;
import java.util.*;
public class deneme4 {
			  public static int[][] scalar(int[][] matrix ,int n) {
		   
		    for(int i=0; i<matrix.length; i++){
		      for(int z=0; z<matrix.length; z++){
		        matrix[i][z]=matrix[i][z]*n;
		      }
		    }
		    return matrix;
		  }
		  
		public static void main(String[] args)
		{
		   
		  int [][] i= new int[][]
		  {
		   {1,1,3},
		   {1,1,1}
		  }; 
		  i = scalar(i,2);
		  System.out.println(Arrays.deepToString( i ));
		  
		}//end main
}
