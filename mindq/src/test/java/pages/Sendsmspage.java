package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sendsmspage 
{
   public WebDriver driver;
   
   @FindBy(xpath="//span[text()='Group SMS']")
   public WebElement grpsms;
   
   @FindBy(xpath="//a[@class='logout']")
   public WebElement signout;
   
   public Sendsmspage(WebDriver driver)
   {
	   this.driver=driver;
	   PageFactory.initElements(driver,this);
   }
   
   public void clickgrpsms()
   {
	   grpsms.click();
   }
   
   public void clicksignout()
   {
	   signout.click();
   }
}
