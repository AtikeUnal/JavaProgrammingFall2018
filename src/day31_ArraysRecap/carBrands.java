package day31_ArraysRecap;

import java.util.Arrays;

public class carBrands {
	public static void main(String[] args) {
		String[] carBrends= {"mercedes", "bmw", "toyota", "ferrari"};
		
	for(int i=0; i<carBrends.length; i++) {
		if(carBrends[i]=="mercedes") {
			System.out.println(carBrends[i]+" :Luxury-Comfort");
		}else if(carBrends[i]=="bmw") {
			System.out.println(carBrends[i]+" :Luxury-Sport");
		}else if(carBrends[i]=="toyota") {
			System.out.println(carBrends[i]+" :Reliable-Cheap");
		}else {
			System.out.println(carBrends[i]+" :Super Car");
		}
		
	}
	String[] shows= {"Game of Thrones", "Friends", "Prison Break", "Doctor Who", "Greys Anatomy"};
	Arrays.sort(shows);
	System.out.println(Arrays.toString(shows));
	int counter=1;
	for(String each:shows) {
		System.out.println("#"+counter+" "+each);
		counter++;
	}
		//partial sorting is Arrays.sort(shows, 0, 3); 
	int [] grades= {1, 23, 34, 21, 500, 35, 72};
	int smallest=grades[0];
	int largest=grades[0];
	for(int i=0; i<grades.length; i++ ) {
		if(grades[i]<smallest) {
			smallest=grades[i];
		}else if(grades[i]>largest) {
			largest=grades[i];
		}
	}System.out.println("Largest number is: "+largest);
	System.out.println("Smallest number is: "+smallest);
	}
}
