package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputFormPage {
	By inputForm=By.xpath("//a[contains(text(),'Input Form')]");
	By showMessage=By.xpath("(//button[@class='btn btn-primary'])[1]");
	WebDriver driver;
	
	public InputFormPage(WebDriver driver)
	{
		this.driver=driver;
		
	}


public void clickOnInputForm()
{
	WebElement inputFormElement=driver.findElement(inputForm);
	inputFormElement.click();
}
public String getShowMessageBtnText()
{
	WebElement showMessageElement=driver.findElement(showMessage);
	return showMessageElement.getText();
	
}
}