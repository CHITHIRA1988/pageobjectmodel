package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	By logo=By.xpath("(//img[@src='images/logo.png'])[1]");
	public HomePage(WebDriver driver)
	{
	this.driver=driver;
	}
	public void isLogoDisplayed()
{
	//WebElement logoElement=driver.findElement(logo);
	String obsquraTitle=driver.getTitle();
	System.out.println(obsquraTitle);
	//boolean isLogoDisplayed=logoElement.isDisplayed();
	//System.out.println(isLogoDisplayed);
}
	public  boolean titleDisplayed()
	{
		WebElement logoElement=driver.findElement(logo);
		return logoElement.isDisplayed();
		
	}
}
