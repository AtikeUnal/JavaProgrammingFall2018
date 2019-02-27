package day8_conditionals2;

import java.util.Scanner;

public class ChooseLanguage {
	public static void main(String[] args) {
		System.out.println("please enter number: english-->1 \n"+
							"Spanish->2 \n"+
							"Turkish->3 \n"+
							"Turkmen->4 \n"+
							"Russian->5");
		Scanner scan=new Scanner(System.in);
		int language=scan.nextInt();
		String greeting="";
		if (language==1) {
			greeting="Hello, how are you";
		}else if(language==2) {
			greeting="Como estas";
		}else if(language==3) {
			greeting="Nasilsin";
		}else if(language==4) {
			greeting="Gowumy yagdaylar";
		}else if(language==5) {
			greeting="Kak dela";
		}else {System.out.println("I dont know that language");}
		
		System.out.println(greeting);
											
	}
}
