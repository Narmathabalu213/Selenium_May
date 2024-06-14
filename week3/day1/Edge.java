package week3.day1;

public class Edge extends Browser
{

	public void takeSnap()
	{
		System.out.println("Take the snap of the screen: C");
	}
	public void clearCookies()
	{
		System.out.println("Clear Cookies: C");
	}
	public static void main(String[] args) 
	{
		Edge edge= new Edge();
		System.out.println(edge.browserName + " : Edge");
		System.out.println(edge.browserVersion + " : Version 1.0");
		edge.openURL();
		edge.closeBrowser();
		edge.navigateBack();
		edge.takeSnap();
		edge.clearCookies();
		

	}

}
