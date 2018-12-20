package newtours;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://www.flipkart.com/");
		driver.manage().window().maximize();
		int b=driver.findElements(By.xpath("//span")).size();
		System.out.println(b);
		/*driver.findElementByXPath("//div[@class='mCRfo9']/div/div/button").click();
		Thread.sleep(3000);
		driver.findElementByName("q").sendKeys("vivo v11 pro",Keys.ENTER);
		driver.findElementByXPath("(//a[contains(text(),'Vivo V11 Pro')])[1]").click();
		Thread.sleep(2000);
		int c=driver.findElements(By.xpath("//img")).size();
		System.out.println(c);
		Thread.sleep(2000);
		ArrayList<String> a=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(a.get(0));
		Thread.sleep(7000);
		driver.findElementByXPath("(//a[contains(text(),'Vivo V11 Pro')])[2]").click();
		Thread.sleep(4000);
		driver.switchTo().window(a.get(1));
		Thread.sleep(3000);
		driver.switchTo().activeElement();
		driver.close();*/
		
		
	}

}
