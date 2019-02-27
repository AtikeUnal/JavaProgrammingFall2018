package day49_Abstraction;

public class iphone extends Phone implements WiFi{

	@Override
	public void call() {
		System.out.println("Iphone is calling");
	}
	
	@Override
	public void receiveCall() {
		
	}
	@Override
   public void searchWifi(){
	System.out.println("Iphone is searching");
}
	
	@Override
	public void connectWiFi() {
		System.out.println("Iphone is connecting");
	}
	
	
	
	}
