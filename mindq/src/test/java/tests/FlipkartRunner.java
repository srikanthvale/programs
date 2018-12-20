package tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"E:\\selenium\\eclipse-jee-oxygen-3a-win32-x86_64\\eclipse\\srikanth\\mindq\\src\\test\\resources\\flipkart\\flipkart.feature"},plugin= {"pretty","html:target"},monochrome=true)

public class FlipkartRunner 
{

}
