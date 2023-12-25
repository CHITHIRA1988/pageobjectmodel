package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UtilityClass;

public class TablePage {
	UtilityClass utilityclass=new UtilityClass();
	WebDriver driver;
	@FindBy(xpath = "(//a[@class='nav-link'])[4]")
	WebElement tableLink;
	@FindBy(xpath = "//div[contains(text(),'Pagination')]")
			WebElement tableHeading;
	@FindBy(xpath="//table//tbody//tr//td[1]")
	List<WebElement> namesElement;
	@FindBy(xpath="//table[@id='dtBasicExample']//thead//tr[1]")
	List<WebElement> headingElement;
	//@FindBy(xpath = "//table[@id='dtBasicExample']//tbody//tr[4]//td[3]")
	//WebElement officeElement;
	public TablePage(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	public void clickOnTableLink()
	{
		tableLink.click();
	}
	public String getTableHeading()
	{
		return tableHeading.getText();
	}
	public String checkAttribute()
	{
		UtilityClass utilityclass=new UtilityClass();
		String attribute=utilityclass.get_Attribute(tableHeading,"class");
		return attribute;
	}
	public void printAllNames()
	{
		UtilityClass utilityclass=new UtilityClass();
		List<String> names=new ArrayList<String>();
        names=utilityclass.getTextOfElements(namesElement);
        //System.out.println(names);
        for(String name:names)
        {
        	System.out.println(name);
        }
        
	}
	public void tableHeading()
	{

		UtilityClass utilityclass=new UtilityClass();
		List<String> headings=new ArrayList<String>();
        headings=utilityclass.getTextOfElements(headingElement);
        //System.out.println(names);
        for(String heading:headings)
        {
        	System.out.println(heading);
        }
	}
        public String getOfficeOfPerson(String person)
        {
          		List<String> names=new ArrayList<String>();
            names=utilityclass.getTextOfElements(namesElement);
            //System.out.println(names);
            //for(String name:names)
            //{
            	//System.out.println(name);
            //}
            int index=0;
            for(index=0;index<names.size();index++)
            {
            	if(person.equals(names.get(index)))
            	{
            		index++;
            		break;
            	}
            }
            WebElement officeElement=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr["+index+"]//td[3]"));
            
        
        return officeElement.getText();
      
}}
