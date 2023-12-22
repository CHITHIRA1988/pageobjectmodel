package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public WebDriver driver;
@BeforeMethod
public void vrify_launchObsquraSite()
{
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver(); 
	 driver.get("https://selenium.obsqurazone.com/index.php");
	 driver.manage().window().maximize();
}
}
