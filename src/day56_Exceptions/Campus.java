package day56_Exceptions;

public class Campus {
	
	public static void main(String[] args) {
		
		String s="James";
		
		
		//this is unchecked or runtime exception
		//====================================================
		
		
		//Thread.sleep(2000); //this gives interrupted exception which is type of checked exception so 
							//we need to handle it otherwise it wouldn compile.
		
		try {
			Thread.sleep(2000);
			System.out.println(s.charAt(12));
		}
		
		catch(InterruptedException e) {
			System.out.println("Some interruption happened here");
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("invalid index");
		}
		finally {
			System.out.println("This finally block will be executed wether exception happens or not");
		}
		System.out.println("End of program");
		
	}

}
