package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException 
	{
		//Launch the Browser
		ChromeDriver driver= new ChromeDriver();
		//Load the URL https://www.leafground.com/radio.xhtml. 
		driver.get("https://www.leafground.com/radio.xhtml");
		//Add the ImplicityWait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Maximize the browser window.
		driver.manage().window().maximize();
		//Select 'Your most favourite browser' from the radio buttons 
		driver.findElement(By.xpath("//table[@id='j_idt87:console1']/tbody[1]/tr[1]/td[1]/div[1]/div[2]/span[1]")).click();
		//Click on a radio button, then click on the same radio button again to verify that it becomes ‘unselected’. 
		driver.findElement(By.xpath("//table[@id='j_idt87:console1']/tbody[1]/tr[1]/td[1]/div[1]/div[2]/span[1]")).click();
		boolean enabled = driver.findElement(By.xpath("//table[@id='j_idt87:console1']/tbody[1]/tr[1]/td[1]/div[1]/div[2]/span[1]")).isEnabled();
		if(enabled)
		{
			System.out.println("Selected after second click");
		}
		else
		{
			System.out.println("Deselected after second click");
		}
		//Identify the radio button that is initially selected by default.
		List<WebElement> defaultSelected = driver.findElements(By.xpath("//div[@class='grid ui-fluid']//div[contains(.,'default') and @class='card']//input"));
		for(int i=0; i<defaultSelected.size();i++)
		{
			if(defaultSelected.get(i).isSelected()) 
			{
				String text = driver.findElements(By.xpath("//div[@class='grid ui-fluid']//div[contains(.,'default') and @class='card']//label")).get(i).getText();
				System.out.println("default selected is : "+text);
				break;
			}
		}
		//Check and select the age group (21-40 Years) if not already selected.
		boolean selectedAge = driver.findElement(By.xpath("//div[@class='card' and contains(., 'Select the age')]//div[contains(@class,'ui-g-12')][2]//span[contains(@class,'ui-radiobutton-icon')]")).isEnabled();
		if (selectedAge)
		{
			System.out.println("The age group 21-40 Years is selected");
		}
		
		driver.close();
	}

}
