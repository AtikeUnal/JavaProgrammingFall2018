package day6_operators;

public class PreVsPost2 {
	
		public static void main(String[] args) {
		int a = 1;
		a++;
		System.out.println(a);
		++a;
		System.out.println(a);
		
		//difference between ++b, b++
		int b=1;
		System.out.println(b++);
		System.out.println(b);
		
		int c=1;
		System.out.println(++c);
		System.out.println(c);
		//more examples with other variables:
		
		int d, e, f;
		d=1;
		e=d++;
		System.out.println("e:"+e);
		System.out.println("d:"+d);
		}
		}

