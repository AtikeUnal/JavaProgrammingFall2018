package day56_Exceptions;

public class Explanation {
	
	/**
	 * Program flow
	 * 
	 * When your program flow breaks that is called exception
	 * There are two types of exception:
	 * 		1.Checked Exception/Compile time exception
	 * 			-->Checked exception MUST be handled before running the program.
	 * 		Ex: FileNotFoundException, IOException, InterruptedException
	 * 
	 * 		2.Unchecked Exception/Runtime exception
	 * 			-->It will be thrown during the runtime
	 * 		
	 * 		Ex: NullPointException, ElementNotFoundException, ArrayIndexOutOfBoundException, ClassCastException
	 * 
	 * 	Handling the Exception is using TRY/CATCH BLOCK
	 * 
	 * 	Try block is used for the statements that might throw the exception.
	 * 	
	 * Ex: try{
	 * 		Thread.sleep.(2000);
	 * }
	 * Catch block-is used for declaration of exception type and statements that you want to take when exception happens
	 *
	 *	catch(InterruptedException e){
	 *	System.out.println("Exception happened.");
	 *}
	 *
	 *catch(StringOutOfBoundException e){
	 *		System.out.print("String is problem");
	 *
	 *Rule: When using multiple catch blocks, Parent Exception type MUST be used in the end. Otherwise child
	 *     exception catch blocks will be 'Unreachable code' and it won't be compiled.
	 *
	 *}
	 *
	 *
	 ******throws : Declaration of exception.
	 *==========================================================================================
	 *
	 *CUSTOM EXCEPTION
	 *
	 *Anyone can create their own Exception. Both checked and unchecked exceptions can be created by programmer.
	 *--Any class that extends to Exception class is now Checked Exception.
	 *--Any class that extends to RuntimeException is Unchecked Exception. 
	 *
	 ************'throw' keyword is used when explicitly throw an exception
	 *
	 *
	 *  throw vs throws 
	 *  throw--->explicitly creating exception
	 *  throws--->passing the exception to next user to handle
	 *
	 */

}
