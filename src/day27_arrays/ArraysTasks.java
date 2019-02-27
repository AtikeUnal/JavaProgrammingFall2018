package day27_arrays;

public class ArraysTasks {
	public static void main(String[] args) {
		String[] arr= {"zero", "one","two","three","four"};
		
		//count how many words have 'e' in the arr
		int counter=0;
		for(String str:arr) {
			if(str.contains("e")) {
				counter++;
			}
		}
		
		System.out.println(counter);
		//create array fewValues, with size of counter
		String [] fewValues=new String[counter];
		
		//go over arr one more time and add the words with 'e' into few Values
		
		int i=0;
		for (String each:arr) {
			if(each.contains("e")) {
				fewValues[i]=each;
				i++;
				System.out.println(each);
				
			}
		}
	}
}
