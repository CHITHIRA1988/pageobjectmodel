package pages;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UtilityClass;

public class DatePickerPage {
	WebDriver driver;
	@FindBy(xpath="//a[contains(text(),'Date Pickers')]")
	WebElement datePickerElement;
	@FindBy(xpath="//div[contains(text(),'Date Picker')]")
	WebElement dateHeadingElement;
	@FindBy(xpath="//button[@id='button-one']")
	WebElement showDateElement;
	@FindBy(xpath = "(//span[@id='basic-addon1']//i[@class='fa fa-calendar'])[1]")
	WebElement enterDateElement;
	@FindBy(xpath="(//table[@class='table-condensed']//tr[2]//th[2])[1]")
	WebElement monthElement;
	@FindBy(xpath="(//table[@class='table-condensed']//tr[2]//th[1])[1]")
	WebElement previousArrow;
	@FindBy(xpath="(//table[@class='table-condensed']//tr[2]//th[3])[1]")
	WebElement nextArrow;
	
	public DatePickerPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void clickOnDatePickerLink()
	{
		datePickerElement.click();
	}
	
	public String getHeading()
	{
		UtilityClass utilityclass=new UtilityClass();
		String dateHeading=utilityclass.get_heading(dateHeadingElement);
		return dateHeading;
	}
	public String getBackGroundColor() 
	{
		return showDateElement.getCssValue("background-color");
	}
	public void selectDate()
	{
		enterDateElement.click();
		String date="10-12-2023";
		String arr[]=date.split("-");
		String day=arr[0];
		String monthindex=arr[1];
		String yearindex=arr[2];
		int m=Integer.parseInt(monthindex);
		int y=Integer.parseInt(yearindex);
		String month="";
		switch (m) {
		case 01:
			month = "January";
			break;
		case 2:
			month = "February";
			break;
		case 3:
			month = "March";
			break;
		case 4:
			month = "April";
			break;
		case 5:
			month = "May";
			break;
		case 6:
			month = "June";
			break;
		case 7:
			month = "July";
			break;
		case 8:
			month = "August";
			break;
		case 9:
			month = "September";
			break;
		case 10:
			month = "October";
			break;
		case 11:
			month = "November";
			break;
		case 12:
			month = "December";
			
		}
		String month_Year=month+" "+yearindex;
		while(true)
		{
			String actualDate=monthElement.getText();
			if(month_Year.equals(actualDate))
			{
				break;
			}
			else if(m<12 && y<=2023)
			{
				previousArrow.click();
			
			}
			else
			{
				 nextArrow.click();	
			}
		}
		WebElement element=driver.findElement(By.xpath("//td[text()='"+day+"' and @class='day']"));
		element.click();
		 
	}
}
