package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selectseatandlogoutpage 
{
	 public WebDriver driver;
	    
	    @FindBy(xpath="(//*[text()='Show buses'])[1]") public WebElement showbuses;
	    
	    @FindBy(xpath="(//*[text()='View Seats'])[1]") public WebElement viewseats;
	    
	    public Selectseatandlogoutpage(WebDriver driver)
	    {
	    	this.driver=driver;
			PageFactory.initElements(driver,this);
	    }
	    public void clickonshowbuses()
	    {
	    	showbuses.click();	
	    }
	    public void clickonviewseats()
	    {
	    	viewseats.click();	
	    }
	    
}
