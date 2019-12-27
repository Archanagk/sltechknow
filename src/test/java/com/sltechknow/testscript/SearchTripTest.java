package com.sltechknow.testscript;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.sltechknow.commonlib.Generic_class;
import com.sltechknow.objectrepository.MatchingResultPage;
import com.sltechknow.objectrepository.TripAdvisorHomePage;
import com.sltechknow.objectrepository.WriteReviewPage;

public class SearchTripTest  extends Generic_class
 {
	@Test
	public void searchForHotel() throws AWTException, InterruptedException 
	{
	   driver.get("https://www.tripadvisor.in/");
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   TripAdvisorHomePage t1=new TripAdvisorHomePage(driver);
	   t1.searchHotel(driver);
	   MatchingResultPage r1=new MatchingResultPage(driver);
	   r1.scrollIntoView(driver);
	   WriteReviewPage w1=new WriteReviewPage(driver);
	   w1.writeReview(driver);
	   

}
}
