package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test5 {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
    	ChromeDriver driver=new ChromeDriver();
    	driver.get("https://jqueryui.com/datepicker/");
    	Thread.sleep(5000);
    	driver.switchTo().frame(0);
    	driver.findElement(By.xpath("//input[@class='hasDatepicker']")).click();
    	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
    	Actions a=new Actions(driver);
    	while(2>1)
    	{
    		String x=driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).getText();
    		if()
    		
    		
    		
    	}
    	

	}

}
