package com.urbanladderCucumber_BDD.pageobject;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.urbanladderCucumber_BDD.resuablemethods.ReusableMethods;
import com.urbanladderCucumber_BDD.uistores.SearchBoxUI;

public class SearchBox {
	public static boolean popup(WebDriver driver,Logger log) throws Exception
	{
		
		Thread.sleep(2000);
		ReusableMethods.timelaps(driver);
		if(ReusableMethods.click(SearchBoxUI.popup, driver))
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
	public static boolean sendinginfo(WebDriver driver,Logger log,String searchitems) throws Exception
	{
		if(ReusableMethods.sendKeys(SearchBoxUI.searchbox, searchitems, driver))
		{
			log.info("Successfully enter the keys");
			Thread.sleep(2000);
			ReusableMethods.sendKey(SearchBoxUI.searchbox,Keys.ENTER,driver);
			
			return true;
		}
		else
		{
			log.error("Unable to enter the keys");
			return false;
		}
		
	}
	public static boolean productinfo(WebDriver driver,Logger log) throws Exception
	{
		Thread.sleep(2000);
		System.out.println(ReusableMethods.getText(SearchBoxUI.productinfo, driver));
		if(ReusableMethods.click(SearchBoxUI.productinfo, driver))
		{
			log.info("successfully clicked on the product");
			return true;
		}
		else
		{
			log.error("unable click on the product");
			return false;
		}
	}
}
