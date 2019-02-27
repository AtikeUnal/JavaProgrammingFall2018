package day41_Constructors;

public class Facebook {
	public static void main(String[] args) {
		
		FacebookUser user=new FacebookUser("huseyin", "asgabat");
		
		
		System.out.println(user.password);
		
		FacebookUser user2=new FacebookUser("huseyin2", "tm2011");
		user2.age=30;
		user2.name="Ahmet";
		user2.friends=5;
		System.out.println("User2 age is: "+user2.age+" and password for user2 is "+user2.password);
		System.out.println("Password for user is: "+user.password);
		
		
		FacebookUser kerim=new FacebookUser("abdylkerim", "abdylkerim2", "asabdylkerimk" );
		System.out.println(kerim.password);
		kerim.age=9;
		user.name="Huseyin Baljayev";
		kerim.friends=2000;
		
		
		kerim.sendFriendRequest(user2);
		System.out.println("");
		System.out.println("================================================================");
		
		user.userInfo();
		System.out.println("=================================================================");
		user2.userInfo();
		System.out.println("=================================================================");
		kerim.userInfo();
		System.out.println("=========================================================================");
		FacebookUser.deleteAccount(kerim);
		kerim.userInfo();
		System.out.println();
		System.out.println("=========================================================================");
		FacebookUser.seeUsersInfo(user2);
		
	}
}
