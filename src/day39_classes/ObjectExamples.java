package day39_classes;
import java.util.*;
public class ObjectExamples {
	public static void main (String[] args) {
		
		// we can use our data type in another class and create an object of that data type
		
		Iphone phone=new Iphone();
		
		phone.model="IPhone 8 Plus";
		phone.memory=64;
		phone.color="Silver";
		
		System.out.println(phone.memory);
		System.out.println(phone.color);
		
		
		// i am creating one more Iphone object
		
		Iphone minePhone=new Iphone();
		minePhone.model="Iphone XS max";
		minePhone.memory=128;
		minePhone.color="Gold";
		System.out.println(minePhone.model);
		//phone=minePhone;
		System.out.println(phone.model); 
		
		System.out.println("====================================================================");
		System.out.println();
		minePhone.printPhoneInfo();
		
		List<Iphone> phones=new ArrayList<>();
		phones.add(phone);
		phones.add(minePhone);
		
		for(Iphone i:phones) {
			System.out.println(i.model);
		}
	}

}
