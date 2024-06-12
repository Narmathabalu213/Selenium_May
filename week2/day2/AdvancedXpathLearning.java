package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedXpathLearning {

	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//span[@class='cartTextSpan']/parent::div")).click();
		driver.findElement(By.xpath("//div[@class='brandContainerFooter']//a")).click();

	}

}
