package testes;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.TablePage;

public class TableTest extends BaseClass{
	TablePage tablepage;
	//int a=10;
	//a=2;
	@Test
	public void Verify_clickOnTableLink()
	{
		tablepage=new TablePage(driver);
		tablepage.clickOnTableLink();
	}
	@Test
	public void verify_getTableHeding()
	{
		tablepage=new TablePage(driver);
		tablepage.clickOnTableLink();
		String expectedHeading="Table with Pagination Example";
		String actualHeading=tablepage.getTableHeading();
		System.out.println(expectedHeading);
		System.out.println(actualHeading);
		Assert.assertEquals(actualHeading,expectedHeading);
		String  attr1=tablepage.checkAttribute();
		System.out.println(attr1);
	}
	@Test
	public void verify_printAllNames()
	{
		tablepage=new TablePage(driver);
		tablepage.clickOnTableLink();
		tablepage.printAllNames();
	}
	@Test
	public void verify_tableHeading()
	{
		tablepage=new TablePage(driver);
		tablepage.clickOnTableLink();
		tablepage.tableHeading();
		
	}
	@Test
	public void verify_getOfficeOfPerson()
	{
		tablepage=new TablePage(driver);
		tablepage.clickOnTableLink();
		String cedricKellyOffice=tablepage.getOfficeOfPerson("Cedric Kelly");
		System.out.println(cedricKellyOffice);
		
		
	}

	}
