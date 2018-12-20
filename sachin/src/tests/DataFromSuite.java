package tests;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataFromSuite 
{
    public ChromeDriver driver;
    @BeforeMethod
    public void launch()
    {
    	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
    	driver=new ChromeDriver();
    	driver.get("https://www.google.co.in/");
    	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
    	driver.manage().window().maximize();

    }
    
    @Test
    @Parameters({"searchword"})
    public void search(String x) throws Exception
    {
    	driver.findElement(By.name("q")).sendKeys(x,Keys.ENTER);
    	Thread.sleep(5000);
    	String t=driver.getTitle();
    	if(t.contains(x))
    	{
    		/*Date dt=new Date();
    		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy:hh/mm/ss");
    		String ssname=sdf.format(dt);
    		File src=driver.getScreenshotAs(OutputType.FILE);
    		File dest=new File("ssname.png");
    		FileUtils.copyFile(src,dest);*/
    		System.out.println("test passed");
    	}
    	else
    	{
    		Date dt=new Date();
    		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy:hh/mm/ss");
    		String ssname=sdf.format(dt);
    		File src=driver.getScreenshotAs(OutputType.FILE);
    		File dest=new File("ssname.png");
    		FileUtils.copyFile(src,dest);
    		
    	
    	}
    	
    }
    @AfterMethod
    public void close()
    {
    	driver.close();
    }
    
  
}
