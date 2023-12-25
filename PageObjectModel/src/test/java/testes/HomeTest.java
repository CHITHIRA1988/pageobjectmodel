package testes;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;

public class HomeTest extends BaseClass{
	HomePage homepage;
	@Test 
	public void verify_logo()
	{
	homepage=new HomePage(driver);
	
	
	
	//String obsquraTitle=driver.getTitle();
	//System.out.println(obsquraTitle);
		homepage.isLogoDisplayed();
	
	}
	@Test
	public void verify_titleDisplayed()
	{
		homepage=new HomePage(driver);
		System.out.println(homepage.titleDisplayed());
	}

}
