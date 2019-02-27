package day43_Recap;
import java.util.*;
public class FaceBookAppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//List<FacebookUser> userList=new ArrayList<>();
		List<String> namess=new ArrayList<>();
		namess.add("Ahmet");
		namess.add("Kerim");
		namess.add("Asker");
		namess.add("Muhammet");
		namess.add("Lionel Messi");
		
		
		FacebookApp.loadUsers(namess);
		//FacebookApp.seeAllFacebookUsers();
		
		Post p1=new Post();
		p1.setBody("I scored today! and I am happy");
		p1.setDate("Nov 11, 2018");
		p1.setLikes(2035);
		
		FacebookUser benzema=FacebookApp.users.get(1);
		benzema.post(p1);
		
		//FacebookApp.removeUser(benzema);
		System.out.println();
		FacebookApp.seeAllFacebookUsers();
		System.out.println("--------------------------------------------------");
		
		FacebookUser muha=FacebookApp.users.get(2);
		FacebookUser leo=FacebookApp.users.get(3);
		muha.sendFriendRequest(leo);
		
		System.out.println(leo.requests.get(0).name);
		
	}
		

}
