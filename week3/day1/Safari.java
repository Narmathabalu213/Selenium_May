package week3.day1;

public class Safari extends Browser
{

	public void readerMode()
	{
		System.out.println("Reader Mode");
	}
	public void fullScreenMode()
	{
		System.out.println("Full screen mode");
	}
	public static void main(String[] args) 
	{
		Safari safari= new Safari();
		System.out.println(safari.browserName + " : Safari");
		System.out.println(safari.browserVersion + " : Version 1.0");
		safari.openURL();
		safari.closeBrowser();
		safari.navigateBack();
		safari.readerMode();
		safari.fullScreenMode();

	}

}
