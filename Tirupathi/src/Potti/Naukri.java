package Potti;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Naukri {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='Login'])[1]")));
		driver.findElement(By.xpath("(//div[text()='Login'])[1]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("srikanth.vale148@gmail.com",Keys.TAB,"srikanth12345",Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='UPDATE PROFILE']")));
        Thread.sleep(3000);
        //WebElement e=driver.findElement(By.xpath("//div[text()='My Naukri']"));
        //driver.findElement(By.xpath("//a[text()='Manage Profiles']")).click();
        Actions a=new Actions(driver);
        a.moveToElement(driver.findElement(By.xpath("//div[text()='My Naukri']"))).build().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Manage Profiles']")));
        driver.findElement(By.xpath("//a[text()='Manage Profiles']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='View & Update']")));
        driver.findElement(By.xpath("//a[text()='View & Update']")).click();
        Thread.sleep(3000);
        a.moveToElement(driver.findElement(By.xpath("//div[text()='My Naukri']"))).build().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Logout']")));
        driver.findElement(By.xpath("//a[text()='Logout']")).click();
        driver.close();
        
	}

}
