package com.sltechknow.testscript;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.sltechknow.objectrepository.FlipkartHomePage;



public class SearchFlipkartTest extends com.sltechknow.commonlib.Generic_class
 {
	@Test
	public void flipkartSearch()
	{
		
		   driver.get("https://flipkart.com");
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    	FlipkartHomePage f1=new FlipkartHomePage(driver);
		    String pstr = f1.searchPhone();
		
		
	}

}
