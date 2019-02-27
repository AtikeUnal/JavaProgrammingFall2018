package day35_methodsRecap;

public class Practice06_LoremIpsum {
	public static void main(String[] args) {
		String sentence=" Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. "
				+ "Risus in hendrerit gravida rutrum. Cursus turpis massa tincidunt dui ut. "
				+ "Quisque non tellus orci ac. "
				+ "In nisl nisi scelerisque eu ultrices vitae auctor eu augue.";
		System.out.println(doesContain(sentence));
	}
	public static boolean doesContain(String word) {
		
		boolean massa=true;
		//String [] arr=new String[word.split(".").length];
		String [] arr=word.split("\\.");
		String word2=arr[2];
		if (word2.contains("massa")) {
			massa=true;
		}else {massa=false;}
		return massa;
		
		/**
		 * Method name: doesContain
Return type: boolean
Accepts a String as parameter
Returns true or false
Condition: Check if the third sentence contains the word “massa”
(or a word specific for your lorem ipsum)
Output should be; true or false
		 */
	}
	
}
