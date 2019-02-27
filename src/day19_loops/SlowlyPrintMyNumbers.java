package day19_loops;

public class SlowlyPrintMyNumbers {
	public static void main(String[] args) throws InterruptedException {
		
		int num=1;
		
		while(num<=10) {
			System.out.print(num+" "); // print num with space
			num++; //add one to num
			Thread.sleep(1000);
		}
		
	}
}
