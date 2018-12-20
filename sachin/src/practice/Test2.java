package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test2 {

	public static void main(String[] args) throws Exception 
	{
		//select 5th item in google search
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(3000);
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement e=driver.findElement(By.name("q"));
		js.executeScript("arguments[0].value='kalam'",e);*/
		driver.findElement(By.name("q")).sendKeys("kalam");
		Thread.sleep(3000);
		Actions a=new Actions(driver);
		for(int i=1;i<=5;i++)
		{
            a.sendKeys(Keys.DOWN).build().perform();
            Thread.sleep(3000);
		}
		a.sendKeys(Keys.ENTER).build().perform();
		driver.close();
	}

}
