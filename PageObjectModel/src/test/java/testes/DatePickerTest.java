package testes;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.DatePickerPage;

public class DatePickerTest extends BaseClass {
	DatePickerPage datepickerpage;
	@Test
	public void verify_datePickerClickOnLink()
	{
		datepickerpage=new DatePickerPage(driver);
		datepickerpage.clickOnDatePickerLink();
	}
	@Test
	public void verify_getHeading()
	{
		datepickerpage=new DatePickerPage(driver);
		datepickerpage.clickOnDatePickerLink();
		String expectedHeading="Date Picker";
		String actualHeading=datepickerpage.getHeading();
		System.out.println(expectedHeading);
		System.out.println(actualHeading);
		Assert.assertEquals(actualHeading,expectedHeading);
	}
	@Test
	public void verify_backGroundColor()
	{
		datepickerpage=new DatePickerPage(driver);
		datepickerpage.clickOnDatePickerLink();
		String expectedBackGroundColor="rgba(0, 123, 255, 1)";
		System.out.println(expectedBackGroundColor);
		String actualBackGroundColor=datepickerpage.getBackGroundColor();
		System.out.println(actualBackGroundColor);
		Assert.assertEquals(actualBackGroundColor,expectedBackGroundColor);
	}
	@Test
	public void verify_chooseDate()
	{
		datepickerpage=new DatePickerPage(driver);
		datepickerpage.clickOnDatePickerLink();
		datepickerpage.selectDate();
		//System.getProperty("user.dir")
		String path=System.getProperty("user.dir");
		System.out.println(path);
	}
	
	

}
