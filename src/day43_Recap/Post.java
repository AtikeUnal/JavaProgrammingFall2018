package day43_Recap;
import java.util.*;
public class Post {
/**
 * 1. Create class Post.
Instance variables: body, likes, date, postID(int)
Encapsulate all the instance variables and provide public getters and setters.
* Create no argument constructor and generate integer between 0 to 3000 and set the
random value to postID.
 */
	private String body;
	private int likes;
	private String date;
	private int postID;
	
	public String getBody() {
		return body;
	}
	
	public int getLikes() {
		return likes;
	}
	
	public String getDate() {
		return date;
	}
	public int getPostID() {
		return postID;
	}
	
	public void setBody(String body){
		this.body=body;
	}
	
	public void setLikes(int likes){
		this.likes=likes;
	}
	
	public void setDate(String date){
		this.date=date;
	}
	
	public void setPostID(int post){
		postID=post;
	}
	
	/**
	 * * Create no argument constructor and generate integer between 0 to 3000 and set the
random value to postID.
	 * 
	 */
	
	public Post() {
		Random r=new Random();
		postID=r.nextInt(3000);
	}
	
	/**
	 * 2. Create a method postInfo in Post class. Method should print out details in the format below:
Body: %body
Likes: %likes
Date: %date
	 * 
	 */
	
	public void postInfo() {
		
		System.out.println("Body: "+body);
		System.out.println("Likes: "+likes);
		System.out.println("Date: "+date);
		
	}
	
	/**
	 * 3. Add instance variable posts (list of posts) in FacebookUser class.
* create method post. This method accepts post object and print out post details and adds given
post to list of posts.
	 */
	
	
}
