package Nextgeneration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Way2sms 
{
	WebDriver driver;
	
	  @BeforeMethod
	  public void launch() 
	  {
		  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://www.way2sms.com/");
		  driver.manage().window().maximize();
	  }
	  @Test(priority=0)
	  public void login()
	  {
		  driver.findElement(By.name("mobileNo")).sendKeys("9030110016");
		  driver.findElement(By.name("password")).sendKeys("1234",Keys.ENTER);
		  WebDriverWait wait=new WebDriverWait(driver,20);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("toMobile")));
		  driver.findElement(By.name("toMobile")).sendKeys("7207219809");
		  driver.findElement(By.name("message")).sendKeys("madda kuduvu");
		  driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
	  }
	  @AfterMethod
	  public void logout()
	  {
		  WebDriverWait wait=new WebDriverWait(driver,20);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//i[contains(@class,'fa icon-logout')])[2]")));
		  
		  driver.findElement(By.xpath("(//i[contains(@class,'fa icon-logout')])[2]")).click();
		  driver.quit();
	  }
}
