package day53_OOPREcap;

public class Headphones {
	private String type;
	private String soundQuality;
	private double price;
	
	public void setType(String type) {
		if(type.equals("inEar")||type.equals("overTheEar")||type.equals("onEar")) {
		this.type=type;
		}else {
			System.out.println("Data is not mathching, please enter one of the following: inEar, overTheEar, onEar");
		}
	}
	
	public String getType() {
		return type;
	}
	
	public void setSoundQuality(String soundQualtiy1) {
		if(soundQualtiy1.equals("poor")||soundQualtiy1.equals("medium")||soundQualtiy1.equals("high")) {
		this.soundQuality=soundQualtiy1;
		}else {
			System.out.println("Data is not mathching, please enter one of the following: poor, medium, high");
		}
	}
	
	public String getSoundQuality() {
		return soundQuality;
	}
	
	public void setPrice(double price) {
		if(price==20||price==500) {
		this.price=price;
		}else {
			System.out.println("Data is not mathching, please enter one of the following");
		}
	}
	
	

}
