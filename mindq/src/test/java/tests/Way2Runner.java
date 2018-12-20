package tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"E:\\selenium\\eclipse-jee-oxygen-3a-win32-x86_64\\eclipse\\srikanth\\mindq\\src\\test\\resources\\srifile.feature","E:\\selenium\\eclipse-jee-oxygen-3a-win32-x86_64\\eclipse\\srikanth\\mindq\\src\\test\\resources\\bdd1\\srifile1.feature"},plugin= {"pretty","html:target"},monochrome=true)

public class Way2Runner 
{
   
}
