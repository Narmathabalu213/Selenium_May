package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		
		//WebElement
		WebElement dd= driver.findElement(By.className("ui-selectonemenu"));
		
		//Select class for handling drop down
		Select options= new Select(dd);
		
		//options.selectByVisibleText("Selenium");
		options.selectByIndex(3);
		
		//Wait for 3 seconds
		Thread.sleep(3000);
		
		//Close the page
		driver.close();
		
	}

}
