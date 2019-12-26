package com.sltechknow.objectrepository;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage 
 {
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchfield;
	@FindBy(xpath="(//input[@class='nav-input'])[1]")
	private WebElement searchIcon;
	@FindBy(xpath="(//div[@class='sg-col-inner']//a/span/span/span[2])[1]")
	private WebElement price;
	@FindBy(xpath="(//div[@class='sg-col-inner']//div[1]/h2[1])[1]")
	private WebElement phonename;
	
	
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void searchEle()
	{
		searchfield.sendKeys("iPhone XR (64GB) - Yellow.");
		searchIcon.click();
	}
	public String getPrice()
	{
		String ptxt = phonename.getText();
		String pricetxt = price.getText();
		System.out.println(ptxt+" "+pricetxt);
		return pricetxt;
		
	}}
