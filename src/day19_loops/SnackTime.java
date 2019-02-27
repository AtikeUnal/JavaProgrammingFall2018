package day19_loops;

public class SnackTime {
	public static void main(String[] args)throws InterruptedException {
		
		/*create a boolean variable hungry and assign true
		 * create int variable apples and assign 1 to it
		 * As long as you are hungry print "Eating an apple"
		 * and increase the apple
		 * once you eat 5 apples , you are no longer hungry
		 */
		boolean hungry=true;
		int apples=1;
		while(hungry) {
		System.out.println("eating an apple");
		
		Thread.sleep(1000);
		if(apples==5) {
			hungry=false;
			
		}
		apples++;
		}
	}

}
