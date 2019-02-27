package Assignments;

public class distinctLetters {

	public void distinctLetter(String word) {

		StringBuilder sb = new StringBuilder();
		int count = 0;
		String insideWord = word.substring(1, word.length() - 1);
		String temp = "";
		for (int i = 1; i < insideWord.length(); i++) {
			if (temp.indexOf(insideWord.charAt(i)) == -1) {
				temp = temp + insideWord.charAt(i);
			}
		}
		count = temp.length();
		sb.append(word.charAt(0));
		sb.append(count);
		sb.append(word.charAt(word.length() - 1));
		String output = sb.toString();
		System.out.println(output);
		
	}
	/**
	 * String str="abcdefaaabbbcccdddeeefff"; String temp="";
	 * 
	 * for (int i = 0; i < str.length(); i++) { if(temp.indexOf(str.charAt(i)) == -1
	 * ){ temp = temp + str.charAt(i); } }
	 * 
	 * System.out.println(temp); System.out.println("Unique character count: " +
	 * temp.length());
	 * 
	 * }
	 * 
	 */

}
