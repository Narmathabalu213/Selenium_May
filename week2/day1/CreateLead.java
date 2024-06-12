package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException 
	{
		//Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		//Load URL
		driver.get("http://leaftaps.com/opentaps/");
		//Maximise the window
		driver.manage().window().maximize();
		//Create Lead
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//li[@class='sectionTabButtonUnselected']//a")).click();
		driver.findElement(By.xpath("//div[@class='frameSectionBody']//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//div[@class='fieldgroup-body']//tr[2]//input")).sendKeys("Narmatha");
		driver.findElement(By.xpath("//div[@class='fieldgroup-body']//tr[2]//td[4]/input")).sendKeys("Balusamy");
		driver.findElement(By.xpath("//div[@class='fieldgroup-body']//input")).sendKeys("Wipro");
		driver.findElement(By.xpath("//div[@class='fieldgroup-body']//tr[6]/td[2]/input")).sendKeys("Project Engineer");
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
		//Implicit Wait
		Thread.sleep(3000);
		//Close the window
		driver.close();
	}

}
