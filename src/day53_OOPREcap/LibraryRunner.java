package day53_OOPREcap;

public class LibraryRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ElectricDictionary e=new ElectricDictionary();
		e.backwardsRead("trump");

		
		Library l=new Library();
		l.backwardsRead("berdishka");
		
		
		Dictionary d=new Dictionary();
		d.read();
	}

}
