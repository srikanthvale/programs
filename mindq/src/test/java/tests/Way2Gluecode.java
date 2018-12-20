package tests;

import java.io.FileInputStream;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.Homepage;
import pages.Sendsmspage;

public class Way2Gluecode 
{
     public WebDriver driver;
     public WebDriverWait wait;
     public Homepage hp;
     public Sendsmspage sp;
     public Scenario s;
     public Properties pro;
     
     @Before
     public void method1(Scenario s) throws Exception
     {
    	 this.s=s;
    	 pro=new Properties();
    	 FileInputStream fip=new FileInputStream("E:\\selenium\\eclipse-jee-oxygen-3a-win32-x86_64\\eclipse\\srikanth\\mindq\\src\\test\\resources\\bdd1\\sriprop.properties");
    	 pro.load(fip);
     }
     @Given("^launch site using \"(.*)\"$")
     public void method2(String b)
     {
    	 //open browser for current scenario
    	 if(b.equals("chrome"))
    	 {
    		 System.setProperty("webdriver.chrome.driver",pro.getProperty("cdriver"));
    		 driver=new ChromeDriver();
    	 }
    	 hp=new Homepage(driver);
    	 sp=new Sendsmspage(driver);
    	 //open site
    	 driver.get(pro.getProperty("url"));
    	 //define wait object
    	 wait=new WebDriverWait(driver,30);
    	 wait.until(ExpectedConditions.visibilityOf(hp.mbno));
    	 driver.manage().window().maximize();
     }
     @Then("^title contains \"(.*)\"$")
     public void method3(String a)
     {
    	 wait.until(ExpectedConditions.visibilityOf(hp.mbno));
    	 String t=driver.getTitle();
    	 if(t.contains(a))
    	 {
    		 s.write("Title test passed");
    	 }
    	 else
    	 {
    		 byte ssbytes[]=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    		 s.embed(ssbytes,"title test passed");
    		 Assert.fail();
    				 
    	 }
     }
     @And("^close site$")
     public void method4()
     {
    	 driver.close();
     }
     
     
}
