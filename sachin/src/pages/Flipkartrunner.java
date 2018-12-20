package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Flipkartrunner 
{
     @DataProvider(name="searchword")
     public Object[][] flipkart()
     {
    	 return new Object[][]
    			 {
    		     {"srikanth.vale148@gmail.com","9030110016","vivo","522006"}
    			 };
     }
     
     public WebDriver driver;
     FlipkartLogin fl=new FlipkartLogin(driver);
     FlipkartHomepage fh=new FlipkartHomepage(driver);
     Actions ac=new Actions(driver);
     WebDriverWait wait=new WebDriverWait(driver,20);
     
     @Test(priority=0)
     public void launch() throws Exception
     {
    	 System.setProperty("webdriver.chrome.driver","chromedriver");
    	 driver=new ChromeDriver();
    	 driver.get("https://www.flipkart.com/");
    	 Thread.sleep(3000);
     }
     
     @Test(priority=1,dataProvider="searchword")
     public void login(String a, String b, String c, String d) throws Exception
     {
    	 fl.clicklogin();
    	 wait.until(ExpectedConditions.visibilityOf(fl.email));
    	 fl.fillemail(a);
    	 fl.fillpwd(b);
    	 fl.clicksignin();
    	 Thread.sleep(3000);
    	 wait.until(ExpectedConditions.visibilityOf(fh.search));
    	 fh.fillsearch(c);
    	 Thread.sleep(3000);
    	 ac.sendKeys(Keys.DOWN,Keys.DOWN,Keys.ENTER).build().perform();
    	 wait.until(ExpectedConditions.visibilityOf(fh.phne));
    	 fh.clickphne();
    	 wait.until(ExpectedConditions.visibilityOf(fh.pincode));
    	 ac.sendKeys(Keys.CLEAR).build().perform();
    	 fh.fillpincode(d);
    	 Thread.sleep(3000);
    	 fh.clickcheckpincode();
    	
     }
     @Test(priority=2)
     public void close()
     {
    	 driver.close();
     }
     
}
