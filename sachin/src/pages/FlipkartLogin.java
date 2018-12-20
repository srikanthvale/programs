package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartLogin 
{
     public WebDriver driver;
     
     @FindBy(xpath="//a[text()='Login & Signup']")
     public WebElement login;
     
     @FindBy(xpath="(//input[@type='text'])[2]")
     public WebElement email;
     
     @FindBy(xpath="//input[@type='password']")
     public WebElement pwd;
     
     @FindBy(xpath="(//button[@type='submit'])[2]")
     public WebElement signin;
     
     public FlipkartLogin(WebDriver driver)
     {
    	 this.driver=driver;
    	 PageFactory.initElements(driver,this);
     }
     
     public void clicklogin()
     {
    	 login.click();
     }
     
     public void fillemail(String x)
     {
         email.sendKeys(x);
     }
     
     public void fillpwd(String x)
     {
         pwd.sendKeys(x);
     }
     
     public void clicksignin()
     {
         signin.click();
     }
}
