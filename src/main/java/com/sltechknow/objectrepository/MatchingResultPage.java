package com.sltechknow.objectrepository;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MatchingResultPage 
 {
	@FindBy(xpath="(//div[@class='location-meta-block'])[1]")
	private WebElement firstlink;
	@FindBy(xpath="//a[.='Write a review']")
	private WebElement writereview;
	@FindBy(xpath="//div[@class='block_wrap ui_section ']/div[2]/div[3]")
	private WebElement scrollintoele;
	
	
	public MatchingResultPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
   public void scrollIntoView(WebDriver driver)
   {
	firstlink.click();
	
	Set<String> allid = driver.getWindowHandles();
	
	for(String newid:allid)
	{
		driver.switchTo().window(newid);
		
	}
	
	Point loc = scrollintoele.getLocation();
	int y = loc.getY();
	int x = loc.getX();
	System.out.println(loc+" "+y);
	
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	
	jse.executeScript("window.scrollBy("+x+","+y+")");
	WebDriverWait wb=new WebDriverWait(driver,10);
	wb.until(ExpectedConditions.elementToBeClickable(writereview));
	writereview.click();
   
}
}