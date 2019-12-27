package com.sltechknow.objectrepository;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WriteReviewPage 
 {
	@FindBy(id="bubble_rating")
	private WebElement bubble;
	
	
	
	@FindBy(id="ReviewTitle")
	private WebElement reviewtitle;
	@FindBy(id="ReviewText")
	private WebElement reviewtextbox;
	@FindBy(xpath="//span[contains(.,'Submit your review ')]")
	private WebElement submitreview;
	@FindBy(id="noFraud")
	private WebElement checkbox;
	
	
	public WriteReviewPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void writeReview(WebDriver driver)
	{
		
	     Set<String> id = driver.getWindowHandles();
	     for(String nid:id)
	     {
	    	 driver.switchTo().window(nid);
	     }
	 Actions a=new Actions(driver);
     a.moveToElement(bubble).perform();
	bubble.click();
	reviewtitle.sendKeys("wonderful stay");
	reviewtextbox.sendKeys("We had a great holiday and great wscape from work to relax mode and lots of activities we enjoyed inside the resort so many sightseeing places we visit..... best time to visit coorg..... Christmas eve");
	
	
	checkbox.click();
	submitreview.click();

}
 }
