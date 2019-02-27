package day41_Constructors;

import java.util.List;
import java.util.Scanner;

public class FacebookUser {

	/**
	 *1. Create a class FacebookUser
Instance variables: username, age, name, password, friends
—> Create constructor that accepts two arguments (username, password)
and set values to instance variables username and password
* Create 2 objects from FacebookUser class
1) Set username and password only
2) Set values for all four variables 
	 * 
	 * 
	 */
	
	String username;
	int age;
	String name;
	String password;
	int friends;
	List<FacebookUser> friendList;
	List<FacebookUser> friendRequestsList;
	
	
	public FacebookUser(String username, String password) {
		this.username=username;
		this.password=password;
	}
	
	/**
	 * Overload FacebookUser constructor that accepts 3 parameters. Name,
username, password. Set all the values to corresponding instance
variables.
*** Before setting values check if password contains username. If it
contains username then print “password can’t contain username. Please
change password” and set empty string for password.
	 */
	public FacebookUser(String name, String username, String password2) {
		this.name=name;
		this.username=username;
		if(!password2.contains(username)) {
			password=password2;
		
			
		}else {	System.out.println("Password can not contain username. Please change password");
			
		}
			
		
	}
	
	public static void deleteAccount(FacebookUser user) {
		user.age=0;
		user.name=null;
		user.username=null;
		user.password=null;
		user.friends=0;
	}
	
	public static void seeUsersInfo(FacebookUser user) {
		
		user.userInfo();
	}
	
	/**
	 * Add methods to FacebookUser class
1) sendFriendRequest —> accepts FacebookUser type(target user)
* check target user’s friends. If 5000 or more then print
“%targetUserName can’t accept friend request” and return false.
* if target user has less than 5000 friends then print “Friend request sent to
%targetUserName” and return true;
2) userInfo —> no parameter, void method. Print all the information (except
password) about the user in the following format.
Name: James
Username: james2018
Age: 26
Friends: 341

Modify sendFriendRequest method
* add current user to target user’s “friend requests list” if successfully
sending request.
	 */
	public void sendFriendRequest(FacebookUser target) {
		if(target.friends<5000) {
			System.out.println("Friend request sent to "+target.username);
		//	target.friendRequestsList.add(this);
		}else {
			System.out.println(target+" can't accept friends anymore");
		}
	}
	
	public void userInfo() {
		System.out.println("Name: "+name);
		System.out.println("Username: "+this.username);
		System.out.println("Age: "+age);
		System.out.println("Friends: "+friends);
	}
	 /**
	  * Create method seeFriends
* method doesn’t return anything.
* Iterate through each friends from “friendsList” and print out each friends
info.
	  */
	public void seeFriends() {
		for(int i=0; i<friendList.size(); i++ ){
			friendList.get(i).userInfo();
		}
	}
	/**
	 * Create method acceptRequests
* method doesn’t return anything
* Show all the requests that is sent to the user(iterate through each user
from “friend requests list” and print info.
* Then create Scanner and ask if user wants to accept requested users
one by one.
Ex:
request 1
Name: James
Friends: 100
------------------
request 2
Name: Elize
Friends: 300
------------------
Do you want to accept James -- yes/no
yes
James is added to your friends list!
Do you want to accept Elize -- yes/no
Note: if user accepts request then you should add the user to friends list.
I think I missed one little part on that one. 
If you answer “no” then it shouldn’t add to your friend and
 print “%requestName is removed from your requests list” and remove 
 the specific request from list of requests.
	 */
	public void acceptRequests() {
		for(int i=0; i<friendRequestsList.size(); i++) {
			friendRequestsList.get(i).userInfo();
			Scanner scan=new Scanner(System.in);
			System.out.println("Do you want to add "+friendRequestsList.get(i).name+" yes/no");
			String answer=scan.next();
			if(answer.equalsIgnoreCase("yes")) {
				System.out.println(friendRequestsList.get(i).name+" is added to your friends list!");
				friendList.add(friendRequestsList.get(i));
			}else if(answer.equalsIgnoreCase("no")) {
				System.out.println(friendRequestsList.get(i).name+" is removed from your requests list");
				friendRequestsList.remove(friendRequestsList.get(i));
			}
		}
		
	}
	
}
