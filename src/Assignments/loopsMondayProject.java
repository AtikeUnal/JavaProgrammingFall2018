package Assignments;

public class loopsMondayProject {
	public static void main(String[] args) {
		// 1.
		for (int i = 1; i <= 20; i++) {
			System.out.print(i + " ");

		}
		System.out.println("");
		int k = 1;
		while (k <= 20) {
			System.out.print(k + " ");
			k++;
		}
		// ============================================================================================================
		// 2.
		System.out.println("");
		for (int i = 2; i <= 20; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println("");
		k = 2;
		while (k <= 20) {
			System.out.print(k + " ");
			k += 2;
		}

		// =============================================================================================================
		// 3.
		System.out.println("");
		for (int i = 1; i <= 20; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println("");
		k = 1;
		while (k <= 20) {
			System.out.print(k + " ");
			k += 2;
		}
		// =============================================================================================================
		// 4.
		System.out.println("");
		for (int i = 1; i <= 20; i += 2) {
			System.out.print((i * i) + " ");
		}
		System.out.println("");
		k = 1;
		while (k <= 20) {
			System.out.print(k * k + " ");
			k += 2;
		}
		// =============================================================================================================
		// 5.
		System.out.println("");
		int m = 1;
		do {
			System.out.print(m + " + ");
			m++;
		} while (m < 20);
		System.out.print(m);

		// =============================================================================================================
		// 6.
		System.out.println("");
		int sum = 0;
		for (int i = 1; i <= 20; i++) {

			sum += i;

		}
		System.out.print("Sum is: " + sum);

		// =============================================================================================================
		// 7.
		System.out.println("");
		int sume = 0;
		for (int i = 2; i <= 20; i += 2) {

			sume += i;

		}
		System.out.print("Sum is: " + sume);
		// =============================================================================================================
		// 8.
		System.out.println("");
		int sumo = 0;
		for (int i = 1; i <= 20; i += 2) {

			sumo += i;
			System.out.print(sumo+" ");
		}
		
		
		
	}
}
