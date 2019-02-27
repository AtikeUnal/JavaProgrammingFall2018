package day43_Recap;

public class TestPost {
	public static void main(String[] args) {
		
		Post p=new Post();
		System.out.println(p.getPostID());
		
		p.setBody("Huge");
		
		p.postInfo();
		
	}
}
