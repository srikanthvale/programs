package newtours;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 
{

	public static void main(String[] args) throws Exception 
	{

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		int w=driver.manage().window().getSize().getWidth();
		int h=driver.manage().window().getSize().getHeight();
		Dimension d=new Dimension(700,450);
		driver.manage().window().setSize(d);
		Thread.sleep(3000);
		int x=driver.manage().window().getPosition().getX();
		int y=driver.manage().window().getPosition().getY();
		Point p=new Point(100,250);
		driver.manage().window().setPosition(p);
		Thread.sleep(3000);
		driver.manage().deleteAllCookies();
		driver.manage().getCookies();

	}

}
