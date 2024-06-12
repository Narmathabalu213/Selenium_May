package week2.day1;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException 
	{
		//Instantiate Chrome browser
		ChromeDriver driver =  new ChromeDriver(); //ChromeDriver is the class, ChromeDriver() is the constructor
		//Load the url
		driver.get("https://www.facebook.com/");
		//Maximise the browser
		driver.manage().window().maximize();
		//input username
		driver.findElement(By.id("email")).sendKeys("mailidmailid@gmail.com");
		//input password
		driver.findElement(By.id("pass")).sendKeys("Password_nar");
		//click login button
		driver.findElement(By.name("login")).click();
		//Wait
		Thread.sleep(3000);
		//get title
		String title=driver.getTitle();
		if(title.contains("Facebook")) 
		{
			System.out.println("Page is verified");
		}
		else
		{
			System.out.println("Wrong Page");
		}
		//Close the browser
		driver.close();

	}

}
