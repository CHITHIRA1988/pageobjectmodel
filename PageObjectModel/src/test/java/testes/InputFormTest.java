package testes;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.InputFormPage;

public class InputFormTest extends BaseClass{
	InputFormPage inputformpage;
	@Test
	public void verify_clickOnInputForm()
	{
		inputformpage=new InputFormPage(driver);
		inputformpage.clickOnInputForm();
	}
	@Test
	public void verify_ShowMessageBtn()
	{
		inputformpage=new InputFormPage(driver);
		inputformpage.clickOnInputForm();
		String expectedBtnText="Show Message";
		String actualBtnText=inputformpage.getShowMessageBtnText();
		System.out.println(actualBtnText);
		System.out.println(expectedBtnText);
		Assert.assertEquals(actualBtnText,expectedBtnText);
	}
	

}
