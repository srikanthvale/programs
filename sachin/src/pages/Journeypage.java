package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Journeypage 
{
    public WebDriver driver;
    
    @FindBy(xpath="//*[@data-message='Please enter a source city']") public WebElement fromcity;
    
    @FindBy(xpath="//*[@data-message='Please enter a destination city']") public WebElement tocity;
    
    @FindBy(xpath="//*[text()='Onward Date']") public WebElement onwarddate;
    
    @FindBy(xpath="((//table)[2]/tbody/tr/td[3])[1]") public WebElement changedate;
    
    @FindBy(xpath="(//table)[2]/tbody/tr[5]/td[4]") public WebElement selectdate;
    
    @FindBy(xpath="//*[text()='Search Buses']") public WebElement searchbus;
    
    public Journeypage(WebDriver driver)
    {
    	this.driver=driver;
		PageFactory.initElements(driver,this);
    }
    
    public void fillfromcity(String x)
    {
    	fromcity.clear();
    	fromcity.sendKeys(x);	
    }
    public void filltocity(String x)
    {
    	tocity.clear();
    	tocity.sendKeys(x);	
    }
    public void clickonwarddate()
    {
    	onwarddate.click();	
    }
    public void clickonchangedate()
    {
    	changedate.click();	
    }
    public void clickonselectdate()
    {
    	selectdate.click();	
    }
    
    public void clickonsearchbus()
    {
    	searchbus.click();	
    }
    
   
}

