package day23_loops;

public class StringReplace {
	public static void main(String[] args) {
		String sentence="We are learning Java";
		System.out.println(sentence);
		sentence=sentence.replace("Java", "c#");
		System.out.println(sentence);
		sentence=sentence.replace("learning", "owreniyorum");
		System.out.println(sentence);
		
		System.out.println(sentence);
		sentence=sentence.replace( "owreniyorum", "practising");
		sentence=sentence.replace("a", "A");
		System.out.println(sentence);
	}
}
