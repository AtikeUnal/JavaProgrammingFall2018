package day18_loops;

public class StairCase {
	public static void main(String[] args) {

		/*
		 * 
		 **
		 ***
		 ****
		 *****
		 ****** 
		 */
		String stairs = "";
		int count = 1;

		while (count <= 15) {
			stairs=stairs+"*";
			System.out.println(stairs);
			count++;
		}

	}
}
