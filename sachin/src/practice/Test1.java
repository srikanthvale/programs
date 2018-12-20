package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Test1 {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.manage().window().maximize();
		Actions  a=new Actions(driver);
		//automate drop down which not allow character matching
		/*WebElement e1=driver.findElement(By.xpath("//div[text()='File']"));
        a.click(e1).build().perform();
        Thread.sleep(3000);
        for(int i=1;i<=9;i++)
        {
        	a.sendKeys(Keys.DOWN).build().perform();
        	Thread.sleep(3000);
        }
        a.sendKeys(Keys.ENTER).build().perform();*/
		
		//which allow character matching
		WebElement e2=driver.findElementByXPath("(//div[@class='ui selection dropdown'])[1]");
		a.click(e2).build().perform();
		Thread.sleep(2000);
		a.sendKeys("f",Keys.ENTER).build().perform();
		Thread.sleep(3000);
		driver.close();
		
		
        
        
	}

}
