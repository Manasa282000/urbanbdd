package com.urbanladderCucumber_BDD.pageobject;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.urbanladderCucumber_BDD.resuablemethods.ReusableMethods;
import com.urbanladderCucumber_BDD.uistores.FooterPageUI;


public class FooterPage {
	public static boolean popup(WebDriver driver,Logger log) throws Exception
	{
		Thread.sleep(2000);
		ReusableMethods.timelaps(driver);
		ReusableMethods.waituntil(FooterPageUI.popup, driver);
		if(ReusableMethods.click(FooterPageUI.popup, driver))
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
	public static boolean headings(WebDriver driver,Logger log) throws InterruptedException
	{
		Thread.sleep(2000);
		List<WebElement>heads=ReusableMethods.findelements(FooterPageUI.heading, driver);
		Thread.sleep(2000);
		if(heads!=null)
		{
		for(int i=0;i<heads.size();i++)
		{
			String str=heads.get(i).getText();
			if(str.contains("Beds"))
			{
				heads.get(i).click();
				break;
			}
		}
		log.info("Successfully identifed the elements and clicked on it");
		return true;
		}
		else
		{
			log.error("Unable to click on the bed icon");
			return false;
		}
	}
	public static boolean multiplecards(WebDriver driver,Logger log) throws InterruptedException
	{
		Thread.sleep(2000);
		List<WebElement>cards=ReusableMethods.findelements(FooterPageUI.cards, driver);
		if(cards!=null)
		{
			for(int i=0;i<cards.size();i++)
			{
				
				String str=cards.get(i).getAttribute("alt");
				if(str.contains("VISA"))
				{
					System.out.println("The payment gateway is open to the visacard");
					break;
				}
				
			}
			log.info("Successfully verified that the visacard are present");
			return true;
		}
		else
		{
			log.error("checked that  the visa card is not present in the list of card present");
			return false;
		}
		
	}
	public static boolean soacialmedia(WebDriver driver,Logger log) throws Exception
	{
		Thread.sleep(2000);
		if(ReusableMethods.click(FooterPageUI.facebook, driver))
		{
			log.info("successfully navigated to the facebook page");
			return true;
		}
		else
		{
			log.error("unable to click on the facebook page");
			return false;
		}
	}


}
