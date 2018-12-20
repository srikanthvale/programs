package tests;

//import java.util.List;

//import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.Test;

import pages.Homepage;
import pages.Journeypage;
import pages.Selectseatandlogoutpage;

public class Pomrunner 
{

	public static void main(String[] args) throws Exception
	{
	
		
		
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.redbus.in");
			Thread.sleep(10000);
			Homepage hp=new Homepage(driver);
			Journeypage jp=new Journeypage(driver);
			Selectseatandlogoutpage sslp=new Selectseatandlogoutpage(driver);
		
			hp.clickprofile();
			hp.clickprofilesignin();
			Thread.sleep(5000);
			driver.switchTo().frame(hp.frame);
			hp.clickemailsignin();
			Thread.sleep(5000);
			hp.fillmbno("9030110016");
			hp.fillpwrd("srikanth@12345");
			hp.clicksignin();
			Thread.sleep(5000);
			driver.switchTo().defaultContent();
			hp.clickcloserefer();
			
			//List<WebElement> l = driver.findElements(By.xpath("//*[@class='autoFill']/li"));
			jp.fillfromcity("Gun");
			Thread.sleep(5000);
			Actions a=new Actions(driver);
			a.sendKeys(Keys.DOWN).build().perform();
			jp.filltocity("hyd");
			Thread.sleep(5000);
			a.sendKeys(Keys.DOWN).build().perform();
			Thread.sleep(5000);
			jp.clickonwarddate();
			jp.clickonchangedate();
			jp.clickonselectdate();
			Thread.sleep(5000);
			//Actions a=new Actions(driver);
			//WebElement searchbus;
			
			//a.moveToElement(jp.searchbus).click().build().perform();
			
			//jp.clickonsearchbus();
			Thread.sleep(5000);
	
			sslp.clickonshowbuses();
			sslp.clickonviewseats();
	
			driver.close();
		

	}

}
