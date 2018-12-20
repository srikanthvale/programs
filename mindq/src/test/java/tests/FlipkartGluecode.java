package tests;

import java.io.FileInputStream;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.FlipkartLogin;

public class FlipkartGluecode 
{
    public WebDriver driver;
    public FlipkartLogin fl;
    public Scenario s;
    public Properties pro;
    public WebDriverWait wait;
    
    @Before
    public void method1(Scenario s) throws Exception
    {
    	this.s=s;
    	pro=new Properties();
    	FileInputStream fip=new FileInputStream("E:\\selenium\\eclipse-jee-oxygen-3a-win32-x86_64\\eclipse\\srikanth\\mindq\\src\\test\\resources\\flipkart\\gmail.properties");
    	pro.load(fip);
    }
    @Given("^launch site using \"(.*)\"$")
    public void method2(String b)
    {
    	if(b.equals("chrome"))
    	{
    		System.setProperty("webdriver.chrome.driver",pro.getProperty("cdriver"));
    		driver=new ChromeDriver();
    	}
    	fl=new FlipkartLogin(driver);
    	//open site
    	driver.get(pro.getProperty("url"));
    	// define wait object
    	wait=new WebDriverWait(driver,30);
    	wait.until(ExpectedConditions.visibilityOf(fl.login));
    	driver.manage().window().maximize();
    }
    @Then("^title contains \"(.*)\"$")
    public void method3(String c)
    {
    	String t=driver.getTitle();
    	if(t.equals(c))
    	{
    		s.write("title test passed");
    	}
    	else
    	{
    		byte ssbytes[]=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    		s.embed(ssbytes,"title test failed");
    		Assert.fail();
    	}
    }
    @And ("^close site$")
    public void method4()
    {
    	driver.close();
    }
    @When ("^do login with \"(.*)\"and \"(.*)\"$")
    public void method5(String d,String e) throws Exception
    {
    	wait.until(ExpectedConditions.visibilityOf(fl.email));
    	fl.fillemail(d);
    	fl.fillpassword(e);
    	Thread.sleep(6000);
    	fl.clicksignin();
    	Thread.sleep(4000);
//    	Actions a=new Actions(driver);
//    	WebElement m=driver.findElement(By.xpath("//div[@class='_2cyQi_']"));
//    	a.moveToElement(m).build().perform();
    		
    }
    @And ("^do logout$")
    public void method6()
    {
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='_2cyQi_']")));
    	Select s=new Select(driver.findElement(By.xpath("//div[@class='_2cyQi_']")));
    	s.selectByVisibleText("Logout");
    }
}
