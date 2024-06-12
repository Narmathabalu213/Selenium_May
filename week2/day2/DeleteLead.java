package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException 
	{
		//Initialize the WebDriver (ChromeDriver).
		ChromeDriver driver = new ChromeDriver();
		//Load URL
		driver.get("http://leaftaps.com/opentaps/");
		//Maximise window
		driver.manage().window().maximize();
		//Create Lead
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Find Lead
		driver.findElement(By.xpath("//li[@class='sectionTabButtonUnselected']//a")).click();
		driver.findElement(By.xpath("//div[@class='frameSectionBody']//a[text()='Find Leads']")).click();
		Thread.sleep(3000);
		//Capture First Lead
		String LeadID=driver.findElement(By.xpath("//div[@class='x-grid3-row   ']//a[1]")).getText();
		System.out.println(LeadID);
		//Select first lead that appears
		driver.findElement(By.xpath("//div[@class='x-grid3-row   ']//a[1]")).click();
		//Delete the lead
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		//Click Find Leads again
		driver.findElement(By.xpath("//div[@class='frameSectionBody']//a[text()='Find Leads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='id']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).clear();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(LeadID);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		//get the message
		String message=driver.findElement(By.xpath("//div[@class='x-toolbar x-small-editor']//div")).getText();
		System.out.println(message);
		//confirm the deletion
		if(message.contains("No"))
		{
			System.out.println("Successful Deletion");
		}
		else
		{
			System.out.println("UnSuccessful Deletion");
		}
		driver.close();
	}
	
}
