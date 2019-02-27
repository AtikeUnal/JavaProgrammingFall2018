package day35_methodsRecap;

public class Practice04_GoogleResultCount {
	public static void main(String[] args) {
		String google="About 3,790,000 results (0.96 seconds)";
		System.out.println(resultCount(google));
	}
	public static String resultCount(String copy) {
		copy="About 3,790,000 results (0.96 seconds) ";
		String []arr=copy.split(" ");
		String count=arr[1];
		System.out.println(arr[1]);
		count=count.replaceAll(",", "");
		return count;
		
		/**
		 * Method name: resultCount
returnType String
Accepts a string as parameter
String will be passed as google result count format
Print out only the count of search results.
		 * 
		 */
	}
}
