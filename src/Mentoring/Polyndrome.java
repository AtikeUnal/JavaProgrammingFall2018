package Mentoring;

public class Polyndrome {
	
			public static void main(String[] args) {
				
				System.out.println(isPalindrome(345543));
		//	
//				
//				
//				
		//	
//			Scanner sc = new Scanner(System.in);
//			System.out.println("enter your word if its palindrome");
//					//level civic racecar anna 
//					
//					String original = sc.next();
//					String reverse  ="";
//					
//					for(int i =original.length()-1; i>=0; i--) {
//						reverse = reverse+original.charAt(i);
//					}
//					if(original.equalsIgnoreCase(reverse)) {
//						System.out.println("Its palindrome");
//					}else {
//						System.out.println("sorry, not pal");
//					}
			}
//					
//					
//					
//					//--------------------
//					
					
					
				public static boolean isPalindrome(int orig) {
//					Scanner sc = new Scanner(System.in);
//					System.out.println("enter your int num ");
//					 orig = sc.nextInt();
					int remainder =0;
					int rev = 0;
					int temp=orig;
					
					while(temp!=0) {
						remainder = temp%10; //takes the last number
						rev = rev*10+remainder;  // assigns each num to rev+remainder
						temp = temp/10;           // removes last num from original
						
					}
					if(rev==orig) {
						return true;
					}else { 
						return false;
					}
					
				
					
			
		}



		
	}

