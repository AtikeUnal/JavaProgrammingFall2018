package Mentoring;

public class deneme3 {
	
	public static void main(String[] args) {
		
		String [] arr= {"1","2","3","5","2","2"};
		System.out.println(getDup(arr));
		
	}
	
	public static int getDup(String[] r) 
	  {
	  
	  int count=0;
	  for(int i=0; i<r.length; i++ ){
	     for (int z=0; z<r.length; z++){
	       if(r[i]==r[z]&&i!=z){
	         count++;
	       
	       }
	       
	     }
	    
	  }
	   return count;
	  }
	  
	}


