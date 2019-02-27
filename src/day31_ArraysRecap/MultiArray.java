package day31_ArraysRecap;

public class MultiArray {
	public static void main(String[] args) {
		int [][] numbers= {{1,2,3,4,7},{2,3,5,5,5},{4,8,9,5,7},{5,8,7,9,1}};
		for(int row=0; row<numbers.length; row++) {
			
			for(int col=0; col<numbers[row].length; col++) {
				System.out.print(numbers[row][col]+"\t");
			}
			System.out.println("");
		}

	}
}
