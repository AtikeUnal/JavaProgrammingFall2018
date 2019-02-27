package day37_ArrayList;

public class Sb {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("James");
		String s="James";
		sb.append(" Bond");
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb.reverse());
		System.out.println(s.hashCode());
		s=s+" Bond";
		System.out.println(s);
		System.out.println(s.hashCode());
		
		System.out.println(sb);
		String cut=sb.substring(2);
		System.out.println(cut);
		System.out.println(sb);
		
	
		StringBuilder ssb = new StringBuilder(cut);
		String str = ssb.toString();
		
	}
}
