package com.sltechknow.commonlib;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_class implements IAutoConstants{
	public WebDriver driver;
	static {
		//System.setProperty(Gecko_key, Gecko_value);
		System.setProperty(Chrome_key, Chrome_value);
	}
   @BeforeMethod()
   public void openApp() throws FileNotFoundException, IOException
   {
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	  
	   
   }
@AfterMethod
public void closeAppn()
{
	//driver.quit();
}
	
}