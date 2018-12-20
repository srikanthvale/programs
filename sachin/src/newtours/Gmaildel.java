package newtours;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmaildel 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.gmail.co.in");
		driver.manage().window().maximize();
		driver.findElement(By.name("identifier")).sendKeys("srikanth.vale148@gmail.com");
		driver.findElement(By.xpath("(//*[@class='CwaK9'])[1]/span")).click();
		driver.findElement(By.name("password")).sendKeys("srikanT12345");
		driver.findElement(By.xpath("(//*[@class='CwaK9'])[1]/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//table)[3]/tbody/tr[4]/td[2]")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.id("hist_frame")));
		Thread.sleep(3000);
		//driver.findElement(By.xpath("(//div[@class='asa'])[3]")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//span[@class='gb_9a gbii']")).click();
		driver.findElement(By.xpath("//a[text()='Sign out']")).click();
		

	}

}
