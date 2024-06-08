package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='_6ltg']//a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']")).sendKeys("Narmatha");
		driver.findElement(By.xpath("//div[@class='mbm _1iy_ _a4y rfloat _ohf']//input")).sendKeys("Balu");
		driver.findElement(By.xpath("//div[@class='mbm _a4y']//input")).sendKeys("0123456789");
		driver.findElement(By.xpath("//div[@class='mbm _br- _a4y']//input")).sendKeys("Password");
		//WebElement for day
		WebElement findElementDay = driver.findElement(By.xpath("//div[@class='_5k_5']//select"));
		Select dayOption= new Select(findElementDay);
		dayOption.selectByVisibleText("20");
		//WebElement for Month
		WebElement findElementMonth = driver.findElement(By.xpath("//div[@class='_5k_5']//select[2]"));
		Select monthOption= new Select(findElementMonth);
		monthOption.selectByVisibleText("May");
		//WebElement for Month
		WebElement findElementYear = driver.findElement(By.xpath("//div[@class='_5k_5']//select[3]"));
		Select yearOption= new Select(findElementYear);
		yearOption.selectByVisibleText("1992");
		//RadioButton
		driver.findElement(By.xpath("//div[@class='mvm _5wa2 _5dbb']//input")).click();
		driver.close();

	}

}
