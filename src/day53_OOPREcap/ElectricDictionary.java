package day53_OOPREcap;

public class ElectricDictionary extends Library{

	
	@Override
	public void backwardsRead(String word){
		String reversed="";
		for(int i=word.length()-1; i>=0; i--) {
			reversed+=word.charAt(i);
		}
		System.out.println(reversed);
	}
}
