package day27_arrays;

public class CopiesAndValues {
	public static void main(String[] args) {
String[] arr= {"zero", "one","two","three","four"};
		
		//count how many words have 'e' in the arr
		int counter=0;
		for(int i=0; i<arr.length; i++) {
			if (arr[i].contains("e")) {
				counter++;
				
			}
			
		}String [] fewValues=new String[counter];
		System.out.println(counter);
		
		int i=0;
		for( int k=0; k<arr.length; k++ ) {
			if(arr[k].contains("e")) {
				fewValues[i]=arr[k];
				
			}
		}
	}
}
