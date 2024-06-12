package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
				//Edit Lead
				driver.findElement(By.xpath("//li[@class='sectionTabButtonUnselected']//a")).click();
				driver.findElement(By.xpath("//div[@class='frameSectionBody']//a[text()='Create Lead']")).click();
				driver.findElement(By.xpath("//div[@class='fieldgroup-body']//tr[2]//input")).sendKeys("Narmatha");
				driver.findElement(By.xpath("//div[@class='fieldgroup-body']//tr[2]//td[4]/input")).sendKeys("Balusamy");
				driver.findElement(By.xpath("//div[@class='fieldgroup-body']//input")).sendKeys("Wipro");
				driver.findElement(By.xpath("//div[@class='fieldgroup-body']//input[@name='firstNameLocal']")).sendKeys("Narmatha");
				driver.findElement(By.xpath("//div[@class='fieldgroup-body']//input[@name='departmentName']")).sendKeys("IT");
				driver.findElement(By.id("createLeadForm_description")).sendKeys("Project Engineer");
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("narmathab@gmail.com");
				WebElement province = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				Select options= new Select(province);
				options.selectByVisibleText("New York");
				driver.findElement(By.className("smallSubmit")).click();
				driver.findElement(By.xpath("//div[@class='frameSectionExtra']//a[text()='Edit']")).click();
				driver.findElement(By.id("updateLeadForm_description")).clear();
				driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Important Note");
				driver.findElement(By.xpath("//div[@class='fieldgroup-body']//input[@name='submitButton']")).click();
				Thread.sleep(3000);
				String title = driver.getTitle();
				System.out.println(title);
				driver.close();
	}

}
