package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test3 {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("kalam");
		Thread.sleep(3000);
		Actions a=new Actions(driver);
		int c=0;
		while(2>1)
		{
			String x=driver.findElement(By.name("q")).getAttribute("value");
			if(x.equals("kalamkari kurtis"))
			{
				a.sendKeys(Keys.ENTER).build().perform();
				break;
			}
			else
			{
				a.sendKeys(Keys.DOWN).build().perform();
				c=c+1;
				if(c>10)
				{
					a.sendKeys(Keys.ESCAPE).build().perform();
					break;
				}
				Thread.sleep(3000);
			}
		}

	}

}
