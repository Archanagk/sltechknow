package com.sltechknow.objectrepository;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TripAdvisorHomePage 
 {
	@FindBy(xpath="//span[.='Search']")
	private WebElement search;

	@FindBy(xpath="//input[@type='search']")
	private WebElement mainsearch;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement mainsearchIcon;
		
	public TripAdvisorHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void searchHotel(WebDriver driver) throws AWTException, InterruptedException
	{

	    search.click();
	    WebDriverWait wb=new WebDriverWait(driver, 10);
	    wb.until(ExpectedConditions.elementToBeClickable(mainsearch));
	    mainsearch.sendKeys("club mahindra");
		mainsearchIcon.click();
		
		
	    
	
	
	}

}
