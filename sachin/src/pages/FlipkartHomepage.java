package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartHomepage 
{
     public WebDriver driver;
     
     @FindBy(xpath="//input[@type='text']")
     public WebElement search;
     
     @FindBy(xpath="(//div[@class='_1-2Iqu row']/div)[3]/div")
     public WebElement phne;
     
     @FindBy(xpath="//input[@placeholder='Enter Delivery Pincode']")
     public WebElement pincode;
     
     @FindBy(xpath="//span[@class='_2aK_gu']")
     public WebElement checkpincode;
     
     //@FindBy(xpath="(//div[@class='_1Wr4v5']/div)[1]/div/div/div/span/div")
     //public WebElement profile;
     
     public FlipkartHomepage(WebDriver driver)
     {
    	 this.driver=driver;
    	 PageFactory.initElements(driver,this);
     }
     
     public void fillsearch(String x)
     {
    	 search.sendKeys(x);
     }
     
     public void clickphne()
     {
    	 phne.click();
     }
     
     public void fillpincode(String x)
     {
    	 pincode.sendKeys(x);
     }
     
     public void clickcheckpincode()
     {
    	 checkpincode.click();
     }
     
}
