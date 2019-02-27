package day34_MethodCreation;

import java.util.Arrays;

public class OverloadingStudentList {
	public static void main(String[] args) {
		String[] words= {"Ashgabat", "John Wick", "Never Settle", "John", "Donald Trump Jr", "Ali ibn EbuTalib"};
ReturnTwoWords(words);
ReturnTwoWords(words,3);
	}
	public static void ReturnTwoWords(String [] arr) {
		
		int counter=0;
		for(int i=0; i<arr.length; i++) {
		if(arr[i].contains(" ")) {
		counter++;
		}
	}
		String []twoWords= new String[counter];
		int index=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i].contains(" ")) {
				twoWords[index]=arr[i];
				index++;
			}
			
		}
		String Sentence=Arrays.toString(twoWords);
		System.out.println(Sentence);
	}
	
	public static void ReturnTwoWords(String[] arr, int num) {
		int count=0;
		for (int i=0; i<arr.length; i++) {
			String [] words= arr[i].split(" ");
			if(words.length==num) {
				
				count++;}}
		String[]threeWords=new String[count];
		//String[] sizeOfNum= {};
		int index=0;
		for (int i=0; i<arr.length; i++) {
		String [] words= arr[i].split(" ");
		
		if(words.length==num) {
			threeWords[index]=Arrays.toString(words);
			index++;
		}
		}System.out.println(Arrays.toString(threeWords));
	}
}
