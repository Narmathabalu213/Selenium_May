package week1.day2;

public class Browser 
{
public String launchBrowser(String browserName)
{
		return browserName;
	}

private void loadUrl() 
{
	System.out.println("Application url loaded successfully");
}


public static void main(String[] args) 
{
	Browser browserMethod= new Browser();
	System.out.println(browserMethod.launchBrowser("Browser launched successfully"));
	browserMethod.loadUrl();
}
}

