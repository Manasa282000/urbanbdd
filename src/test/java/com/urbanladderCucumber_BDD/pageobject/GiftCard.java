package com.urbanladderCucumber_BDD.pageobject;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.urbanladderCucumber_BDD.resuablemethods.ReusableMethods;
import com.urbanladderCucumber_BDD.uistores.FooterPageUI;
import com.urbanladderCucumber_BDD.uistores.GiftCardUI;

public class GiftCard {
	public static boolean popup(WebDriver driver,Logger log) throws Exception
	{
		Thread.sleep(2000);
		ReusableMethods.timelaps(driver);
		ReusableMethods.waituntil(GiftCardUI.popup, driver);
		if(ReusableMethods.click(GiftCardUI.popup, driver))
		{
			log.info("Successfully closed the popup");
		return true;
		}
		else
		{
			log.error("Popup is not closed Kindly close it");
			return false;
		}
		
	
	}
	public static boolean giftcardicon(WebDriver driver,Logger log) throws Exception
	{
		Thread.sleep(2000);
		if(ReusableMethods.click(GiftCardUI.giftcard, driver))
		{
			log.info("successfully clicked on the gifcard icon");
			return true;
		}
		else
		{
			log.error("unable to click on the giftcar icon");
			return false;
		}
	}
	public static boolean occasion(WebDriver driver,Logger log) throws Exception
	{
		Thread.sleep(2000);
		if(ReusableMethods.click(GiftCardUI.occasion, driver))
		{
			log.info("successfully clicked on the required occasion");
			return true;
		}
		else
		{
			log.error("unable to click on the requied occasion");
			return false;
		}
	}
	public static boolean dayandmonth(WebDriver driver,Logger log) throws Exception
	{
		Thread.sleep(2000);
		if(ReusableMethods.sendKeys(GiftCardUI.amount, "1500", driver))
		{
			log.info("successfully entered the required amount");
			Thread.sleep(2000);
			if(ReusableMethods.click(GiftCardUI.monthclick, driver))
			{
				log.info("successfully clicked on the month");
				List<WebElement>month=ReusableMethods.findelements(GiftCardUI.month, driver);
				for(int i=0;i<month.size();i++)
				{
					String str=month.get(i).getText();
					if(str.contains("Oct"))
					{
						log.info("successfully clicked on the required month");
						month.get(i).click();
					}
				}
				Thread.sleep(2000);
				List<WebElement>day=ReusableMethods.findelements(GiftCardUI.day, driver);
						for(int i=0;i<day.size();i++)
						{
							String xx=day.get(i).getText();
							if(xx.contains("28"))
							{
								
								day.get(i).click();
							}
				
						
						}
			
			}
		return true;
		}
		else
		{
			log.error("Unable to send the required elements for the gift card");
		return false;
		}	
		
	}

}
