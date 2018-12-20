package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
    public WebDriver driver;
    
    @FindBy(name="mobileNo")
    public WebElement mbno;
    
    @FindBy(name="password")
    public WebElement pwd;
    
    @FindBy(xpath="(//button[contains(@class,'btn-theme-sm btn')])[1]")
    public WebElement signin;
    
    @FindBy(xpath="//b[text()='Enter your mobile number']")
    public WebElement mbno_blank_err;
    
    @FindBy(xpath="(//b[text()='Enter password'])[1]")
    public WebElement pwd_blank_err;
    
    @FindBy(xpath="//b[contains(text(),'Incorrect number or password')]")
    public WebElement pwd_invalid_err;
    
    @FindBy(xpath="//b[text()='Enter valid mobile number']")
    public WebElement mbno_invalid_error;
    
    public Homepage(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver,this);
    }
    
    public void fillmbno(String x)
    {
    	mbno.sendKeys(x);
    }
    
    public void fillpwd(String y)
    {
    	pwd.sendKeys(y);
    }
    
    public void clicksignin()
    {
    	signin.click();
    }
    
}
