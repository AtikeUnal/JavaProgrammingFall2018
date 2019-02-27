package day50_abstarts;

public class InternetUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chrome chrome =new Chrome(512);
		chrome.version="68.08";
		chrome.launchBrowser();
		chrome.addTab("google.com");
		chrome.addTab("amazon.com");
		chrome.printInfo();
		chrome.closeTab("amazon.com");
		chrome.printInfo(); 
		chrome.addTab("etsy.com");
		chrome.addTab("cybertekschool.com");
		chrome.seeAllUrls();
		chrome.changeTab("amazon.com");
		chrome.printInfo();
		chrome.closeTab("amazon.com");
		chrome.printInfo();
		
		
	}

}
