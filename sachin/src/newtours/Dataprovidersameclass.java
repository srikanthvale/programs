package newtours;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Dataprovidersameclass 
{
     
	/*@DataProvider(name="search word")
	public Object[][] joshi()
	{
		return new Object[][]
				{
				{"a","b","c","d","b","c","c","c","c","INDIA"},{"a","b","c","d","b","c","c","c","c","INDIA"}
				};
	}*/
    public WebDriver driver;
   
    
    @Test(priority=0)
    public void launch() throws Exception
    {
    	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
    	driver=new ChromeDriver();
    	driver.get("http://newtours.demoaut.com/mercuryregister.php");
    	Thread.sleep(5000);
    	//driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
    	driver.manage().window().maximize();
	
   }
    @Test(priority=1/*,dataProvider="search word"*/)
    @Parameters({"fname","lname","pname","ename","add1","add2","city","state","postal","country"})
    public void contactinfo(String x,String y,String z,String w,String a,String b,String c,String d,String e,String f)
    {
    	driver.findElement(By.name("firstName")).sendKeys(x);
    	driver.findElement(By.name("lastName")).sendKeys(y);
    	driver.findElement(By.name("phone")).sendKeys(z);
    	driver.findElement(By.name("userName")).sendKeys(w);
    	
  /*  }
    
    @Test(priority=2,dataProvider="search word")
    public void mailinginfo(String a,String b,String c,String d,String e,String f)
    {*/
    	driver.findElement(By.name("address1")).sendKeys(a);
    	driver.findElement(By.name("address2")).sendKeys(b);
    	driver.findElement(By.name("city")).sendKeys(c);
    	driver.findElement(By.name("state")).sendKeys(d);
    	driver.findElement(By.name("postalCode")).sendKeys(e);
    	WebElement we=driver.findElement(By.name("country"));
    	Select s=new Select(we);
    	s.selectByVisibleText(f);
    
    	
    }
    @Test(priority=2)
    public void close()
    {
    	driver.close();
    }
}   
