package week3.day1;

public class Chrome extends Browser
{
	public void openIncognito()
	{
		System.out.println("Open Incognito Window:C");
	}
	public void clearCache()
	{
		System.out.println("Clear the cache:C");
	}
	public static void main(String[] args) 
	{
		Chrome chrome = new Chrome();
		System.out.println(chrome.browserName + " : Chrome");
		System.out.println(chrome.browserVersion + " : 1.0");
		chrome.openURL();
		chrome.closeBrowser();
		chrome.navigateBack();
		chrome.clearCache();
		chrome.openIncognito();
	}
	
	
}
