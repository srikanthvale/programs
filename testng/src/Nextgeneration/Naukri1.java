package Nextgeneration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Naukri1 {
	WebDriver driver;
	
  @BeforeMethod
  public void launch() 
  {
	  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.naukri.com/");
	  driver.manage().window().maximize();
  }
  @Test(priority=0)
  public void login()
  {
	  WebDriverWait wait=new WebDriverWait(driver,20);
		Actions a=new Actions(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='Login'])[1]")));
		driver.findElement(By.xpath("(//div[text()='Login'])[1]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("srikanth.vale148@gmail.com",Keys.TAB,"srikanth12345",Keys.ENTER);

	  
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("UPDATE PROFILE")));
	  a.moveToElement(driver.findElement(By.xpath("//div[text()='My Naukri']"))).build().perform();
	  //wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//a[text()='Edit Profile']")));
	  driver.findElement(By.xpath("//a[text()='Edit Profile']")).click();

	  
	  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("VIEW ALL")));
	  a.moveToElement(driver.findElement(By.xpath("//div[text()='My Naukri']"))).build().perform();
	  //wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//a[text()='Logout']")));
	  driver.findElement(By.linkText("Logout")).click();
  }
  
  
  @AfterMethod
  public void close()
  {
	  driver.quit();
  }
  
  
  
  
  
  
  
  
  
}



