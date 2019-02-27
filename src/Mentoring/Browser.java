package Mentoring;

import java.util.List;

public abstract class Browser {

	public String version;
	public int memory;
	public List<String> urls;
	public boolean browserLaunched;
	public String focusedUrl;
	public boolean windowMaximized;
	/**
	 * Abstract methods: lauchBrowser(), closeBrowser(), addTab(takes url),
closeTab(takes url), changeTab(takes url). Only closeTab method returns
boolean type, all other abstract methods are void.

Create void method maximizeWindow. This method doesn’t take any argument.
Simply print “Browser is maximized” and change maximized variable value
to ‘true’.
Create void method printInfo. This method doesn’t take any argument. Method
should print current info in following format:
Browser version:
Browser version: %version
Available memory: %memory
Window maximized: %windowMaximized
Current URL: %focusedUrl
Total open tabs: % size of list of open tabs
	 */
	public abstract void launchBrowser();
	public abstract void closeBrowser();
	public abstract void addTab(String url);
	public abstract boolean closeTab(String url);
	public abstract void changeTab(String url);
	
	public void maximizeWindow() {
		System.out.println("Browser is maximized");
		this.windowMaximized=true;
	}
	
	public void printInfo() {
		System.out.println("Browser version: "+this.version);
		System.out.println("Available memory: "+this.memory);
		System.out.println("Window maximized: "+this.windowMaximized);
		System.out.println("Current URL: "+this.focusedUrl);
		System.out.println("Total open tabs: "+this.urls.size());
	}
	/**
	 * Create method seeAllUrls. This method doesn’t take any argument. Simply prints
out each open urls as following format.
URL - 1: google.com
URL - 2: amazon.com
URL - 3: etsy.com
…
…
	 */
	public void seeAllUrls() {
		int count=1;
		for(String eachUrl:this.urls) {
			System.out.println("URL - "+count+": "+eachUrl );
			count++;
			
			
		}
	}
	
}
