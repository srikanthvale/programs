package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
	public WebDriver driver;
	@FindBy(xpath="//*[@class='icon-profile-new-unsigned ']") public WebElement profile;
	
	@FindBy(xpath="//*[text()='Sign In/Sign Up']") public WebElement profilesignin;
	
	@FindBy(xpath="//*[@class='modalIframe']") public WebElement frame;
	
	@FindBy(xpath="(//*[text()='SIGN IN using Email'])[2]") public WebElement emailsignin;
	
	@FindBy(xpath="//*[@id='email-mobile']") public WebElement entermbno;
	
	@FindBy(xpath="//*[@id='password']") public WebElement pwrd;
	
	@FindBy(xpath="//*[text()='sign in']") public WebElement signin;
	
	@FindBy(xpath="(//*[@class='icon-close'])[2]") public WebElement closerefer;
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clickprofile()
	{
		profile.click();
	}
	
	public void clickprofilesignin()
	{
		profilesignin.click();
	}
	
	
	public void clickemailsignin()
	{
		emailsignin.click();
	}
	
	public void fillmbno(String x)
	{
		entermbno.sendKeys(x);
	}
	
	public void fillpwrd(String x)
	{
		pwrd.sendKeys(x);
	}
	
	public void clicksignin()
	{
		signin.click();
	}
	
	public void clickcloserefer()
	{
		closerefer.click();
	}
}
