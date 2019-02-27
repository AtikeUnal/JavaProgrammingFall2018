package day53_OOPREcap;

public class Artist1 extends Fibbonacci {

	public void beFibonacci(int limit) {
		int num1=0;// we have to provide first 2 numbers in order to start the process.
		int num2=1;
		int sum=num1+num2;
		
		System.out.print(num1+" "+num2+" "+sum+" ");
		while(sum<limit) {
			num1=num2;
			num2=sum;
			
			sum=num1+num2;
			if(sum>limit) {
				break;
			}
		}
		
	}
	
	
}
