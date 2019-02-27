package day27_arrays;

public class SplitMethod {
	public static void main(String[] args) {
		 String words = "java-selenium-cucumber-testng-junit-eclipse-maven-git-github";
		 String []splittedWords=words.split("-");
		 System.out.println(splittedWords.length);
		 System.out.println(splittedWords[0]);
		 for(String each:splittedWords) {
			 System.out.println(each);
		 }
		 
		 String searchResults = "All categories “wooden spoon” 13,623 Results.";
		 // if you have a sentence as a String, how do you find out how many words in it (interview question)
		 String [] newWords=searchResults.split(" ");
		 System.out.println("Count of words is: "+newWords.length);
		 //extract number of wooden spoon results and print it out
		 for (String wordBy:newWords) {
			 if (wordBy.contains("1")) {
				 System.out.println("Search Result Number is: "+wordBy);
			 }
		 }
	}
}
