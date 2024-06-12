package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException 
	{
		//Initialize ChromeDriver
		ChromeDriver driver= new ChromeDriver();
		//Load URL
		driver.get("https://leafground.com/checkbox.xhtml");
		//Maximise windows
		driver.manage().window().maximize();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'][1]")).click();
		driver.findElement(By.xpath("//div[@class='card'][2]//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		driver.findElement(By.xpath("//div[@class='card'][3]//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'][1]")).click();
		driver.findElement(By.xpath("//div[@class='card'][4]//div[@class='grid formgrid']//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		Thread.sleep(3000);
		//String statemsg = driver.findElement(By.xpath("//div[@class='ui-growl-message']//p")).getText();
		//System.out.println(statemsg);
		driver.findElement(By.className("ui-toggleswitch-slider")).click();
		boolean checkboxenabled = driver.findElement(By.id("j_idt87:j_idt102_input")).isEnabled();
		if (checkboxenabled)
		{
			System.out.println("Check box is enabled");
		}
		else
		{
			System.out.println("Check box is disabled");
		}
		driver.findElement(By.xpath("//ul[contains(@class,'ui-selectcheckboxmenu-multiple-container')]")).click();
		driver.findElement(By.className("ui-selectcheckboxmenu-filter-container")).click();
		driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-filter-container']/input")).sendKeys("Paris");
		driver.findElement(By.xpath("//li[contains(@class,'ui-selectcheckboxmenu-item')]//label[text()='Paris']")).click();
		driver.findElement(By.className("layout-main-content")).click();
		driver.close();
		System.out.println("Successful execution");
		
	}

}
