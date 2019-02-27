package day28_arrays;


public class MyArray {
public static void main(String[] args) {
	
	
	String[] words= {"huseyin", "ahmet", "murat", "kerim", "elif"};
	//print out first and last char of each word
	
	
	System.out.print("[");
    for(int i=0; i<words.length-1; i++){
    
    	System.out.print(words[i].substring(0,1)+words[i].substring(words[i].length()-1)+", ");
      
     
    
    }System.out.println(words[words.length-1].substring(0,1)+words[words.length-1].substring(words[words.length-1].length()-1)+"]");
	
}
}
