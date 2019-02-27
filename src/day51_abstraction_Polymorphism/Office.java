package day51_abstraction_Polymorphism;

import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;

public class Office {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Aeron aChair=new Aeron();
		aChair.sit();
		aChair.stepOnIt();
		
		
		HumanScale hChair=new HumanScale();
		hChair.sit();
		hChair.stepOnIt();
		
		Aeron a=new Aeron();//on the left side we can put any parent, any super class.
		a.sit();
		System.out.println();
		System.out.println("====================================================================");
		Chair b=new Aeron();
		b.sit();
		b.stepOnIt();
	//	b.rollBack==> we can not use it because b is refernsing to chair. you can use it by casting. 
		
		
		
		System.out.println("====================================================================");
		
		Chair h=new HumanScale();//sol taraftaki referenste olan metodlari sagdaki objecti (override olmushsa eger) icine alip kullaniliyor
		h.sit();		//eger ayni metod her iki tarafta da varsa object tarafina gidip onu ishletecektir.
		h.stepOnIt();//h is taking reference left side methods and use right side class as an object if it is overriden.
						//if it is not overriden it takes reference types method as right side has already inherited it from there.
		
		System.out.println();
		List<Chair> chairs=new ArrayList<>();
		chairs.add(a);
		chairs.add(b);
		chairs.add(h);
		
		for (Chair c:chairs) {
			c.sit();
		}
		
		
		
		
	}

}
