package day43_Recap;

public class Whatsapp {
	public static void main(String[] args) {
		
		String name="Adam";
		
		CustomData.generateUsername(name);
		CustomData.generatePassword(name);
		
		
		/**
		 * *****Difference between custom and static method is that you need to create an object of that
		 * class to be able to use custom method, but static method you can call in any class with any object.
		 */
		
		Post p1=new Post();
		System.out.println(p1.getPostID());
		
		p1.setBody("Today is the good day!!!");
		p1.setDate("November 11, 2018");
		p1.postInfo();
		
		FacebookUser user11=new FacebookUser("james12", "123");
		user11.post(p1);
		//System.out.println(user11.postList.get(0).getBody());
		
		
	}

}
