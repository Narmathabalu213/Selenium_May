package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserXpath {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("narmathabalu213@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Jona73@love");
		driver.findElement(By.xpath("//button[(@name='login')]")).click();
		Thread.sleep(5000);
		driver.close();
		

	}

}
