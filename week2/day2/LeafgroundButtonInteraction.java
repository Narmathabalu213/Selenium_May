package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButtonInteraction {

	public static void main(String[] args) throws InterruptedException 
	{
		// Initialize the WebDriver (ChromeDriver). 
		ChromeDriver driver= new ChromeDriver();
		//Load the URL https://leafground.com/button.xhtml .
		driver.get("https://leafground.com/button.xhtml");
		//Maximize the browser window.
		driver.manage().window().maximize();
		//Click on the button with the text ‘Click and Confirm title.’ 
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']/span")).click();
		//Verify that the title of the page is ‘dashboard.’ 
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Dashboard"))
		{
			System.out.println("Page verified, Correct page");
		}
		else
		{
			System.out.println("Page verified, Wrong Page");
		}
		//Check if the button with the text ‘Confirm if the button is disabled’ is disabled. 
		driver.navigate().back();
		boolean enabled = driver.findElement(By.id("j_idt88:j_idt92")).isEnabled();
		if (enabled)
		{
			System.out.println("Button enabled");
		}else {
			System.out.println("Button disabled");
		}
		//Find and print the position of the button with the text ‘Submit.’ 
		Point position = driver.findElement(By.id("j_idt88:j_idt94")).getLocation();
		System.out.println(position);
		//Find and print the background color of the button with the text ‘Find the Save button color.’ 
		Thread.sleep(3000);
		String bg_color = driver.findElement(By.xpath("//button[@name='j_idt88:j_idt96']//span[@class='ui-button-text ui-c']")).getCssValue("background-color");
		System.out.println(bg_color);
		//Find and print the height and width of the button with the text ‘Find the height and width of this button.’ 
		Dimension size = driver.findElement(By.xpath("//button[@name='j_idt88:j_idt98']//span[text()='Submit']")).getSize();
		System.out.println(size);
		//Close the browser window.
		driver.close();

	}

}
