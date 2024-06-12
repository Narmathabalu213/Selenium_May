package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) 
	{
		//Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		//Load URL
		driver.get("http://leaftaps.com/opentaps/");
		//Maximise the window
		driver.manage().window().maximize();
		//Create Account
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Narmatha B");
		driver.findElement(By.xpath("//div[@class='subSectionBlock']//textarea")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("numberEmployees")).sendKeys("3");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		driver.findElement(By.className("smallSubmit")).click();
		//Get page title and check if its correct
		String title = driver.getTitle();
		if(title.contains("opentaps"))
		{
			System.out.println("The page is correct");
		}
		else
		{
			System.out.println("The page is not correct");
		}
		//Close the window
		driver.close();

	}

}
