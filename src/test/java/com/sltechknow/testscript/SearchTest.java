package com.sltechknow.testscript;


import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.sltechknow.commonlib.Generic_class;
import com.sltechknow.objectrepository.HomePage;



public class SearchTest extends Generic_class{
	@Test
	public void serchForPhn()
	{
		
		   driver.get("https://www.amazon.in");
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	HomePage h1=new HomePage(driver);
	h1.searchEle();
	String str = h1.getPrice();
	
}
}