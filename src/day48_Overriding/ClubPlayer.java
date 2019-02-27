package day48_Overriding;

public class ClubPlayer extends SoccerPlayer {
	
	int name;
	
	@Override
	public void bycicleKick() {
		System.out.println("Club player playing");
	} 

	@Override
	public void eat() {
		System.out.println("Club player is eating");
		super.eat();
	
	}
 
 
	
}
