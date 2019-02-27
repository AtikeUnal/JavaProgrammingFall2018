package day26_arrays;

public class toCharArray {
	public static void main(String[] args) {
		
		String word="Hello";
		char[] letters=word.toCharArray();
		for(char l:letters) {
			System.out.println(l);
		}
		
		String gift="toyota";
		//convert to char array and print reverse (note: for each loop never goes reverse so use for loop)
		char[] car=gift.toCharArray();
		for(int k=car.length-1; k>=0; k-- ) {
			System.out.print(car[k]);
		}
			
	}
}
