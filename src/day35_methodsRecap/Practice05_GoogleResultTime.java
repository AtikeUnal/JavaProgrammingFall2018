package day35_methodsRecap;

public class Practice05_GoogleResultTime {
	public static void main(String[] args) {
		String google="About 3,790,000 results (0.96 seconds)";
		System.out.println(resultTime(google));
	}
	public static String resultTime(String word) {
		String []arr=word.split(" ");
		String count=arr[3]+arr[4];
		//System.out.println(arr[3]);
		count=count.replaceAll("\\(","");
		count=count.replaceAll("\\)","");
		return count;

		/**
		 * Method name: resultTime
returnType String
Accepts a string as parameter
String will be passed as google result count format
Print out only the time of search results. 
output => 0.78 Seconds
		 */
	}
}

