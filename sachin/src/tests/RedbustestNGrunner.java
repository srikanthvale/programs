package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.Journeypage;
import pages.Selectseatandlogoutpage;

public class RedbustestNGrunner 
{
	public WebDriver driver;
	Homepage hp;
	Journeypage jp;
	Selectseatandlogoutpage sslp;
	@Test(priority=0)
	public void lauch() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in");
		Thread.sleep(10000);
		hp=new Homepage(driver);
		jp=new Journeypage(driver);
		sslp=new Selectseatandlogoutpage(driver);
	}
	@Test(priority=1)
	public void login() throws Exception
	{
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
	}
	@Test(priority=2)
	public void journey() throws Exception
	{
		jp.fillfromcity("Hyderabad");
		Thread.sleep(5000);
		jp.filltocity("Hubli");
		jp.clickonwarddate();
b		jp.clickonchangedate();
		jp.clickonselectdate();
		Thread.sleep(5000);
		jp.clickonsearchbus();
		Thread.sleep(5000);
	}
	@Test(priority=3)
	public void logout() 
	{
		sslp.clickonshowbuses();
		sslp.clickonviewseats();
	}
	@Test(priority=3)
	public void close() 
	{
		driver.close();
	}
}
