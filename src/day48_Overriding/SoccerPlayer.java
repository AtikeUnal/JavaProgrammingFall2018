package day48_Overriding;

import java.net.SocketTimeoutException;

public class SoccerPlayer extends Human{

	int jerseyNumbar;
	String name;
	
	@Override
	public void run() {
		System.out.println("Soccer player is running");
	}
	
	@Override
	public void eat() {
		System.out.println("Soccer player is eating");
	}
	
	
	
	public void train() {
		System.out.println("Soccer player is training");
	}
	
	public void bycicleKick() {
		System.out.println("Soccer player is byciclekicking");
	}
	
}
