package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookList {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int totalnoOfLinks = links.size();
		System.out.println(totalnoOfLinks);
		
		for(int i=0;i<links.size();i++)
		{
			String link = links.get(i).getText();
			System.out.println(link);
		}

	}

}
