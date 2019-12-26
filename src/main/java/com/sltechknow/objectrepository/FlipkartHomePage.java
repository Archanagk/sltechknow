package com.sltechknow.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartHomePage
 {
	@FindBy(xpath="//input[@type='text']")
	private WebElement searchfld;
	@FindBy(xpath="//button[.='✕']")
	private WebElement cancelIcon;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchIcon;
	@FindBy(xpath="((//div[@class='bhgxx2 col-12-12']//a[1])[4]/div//div[1]/div[1])[3]")
	private WebElement phone_name;
	
	@FindBy(xpath="((//div[@class='bhgxx2 col-12-12']//a[1])[4]/div//div[1]/div[1])[4]/div[1]")
	private WebElement phone_price;
	
	
	
	
	public FlipkartHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
   public String searchPhone()
   {
	   searchfld.sendKeys("iPhone XR (64GB) - Yellow.");
	   cancelIcon.click();
	   searchIcon.click();
	   String phonetxt = phone_name.getText();
	   String phpricetxt = phone_price.getText();
	   System.out.println(phonetxt+"  "+phpricetxt);
	return phpricetxt;
	   
   }

}
