package com.urbanladderCucumber_BDD.pageobject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.urbanladderCucumber_BDD.resuablemethods.ReusableMethods;
import com.urbanladderCucumber_BDD.uistores.HomepageLivingUI;

public class HomepageLiving {
	public static boolean popup(WebDriver driver,Logger log) throws Exception
	{
		Thread.sleep(2000);
		ReusableMethods.timelaps(driver);
		ReusableMethods.waituntil(HomepageLivingUI.popup, driver);
		if(ReusableMethods.click(HomepageLivingUI.popup, driver))
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
	public static boolean livingunit(WebDriver driver,Logger log) throws Exception
	{
		Thread.sleep(2000);
		if(ReusableMethods.action(HomepageLivingUI.livingunit, driver))
		{
			log.info("successfully clicked on the living unit");
			return true;
		}
		else
		{
			log.error("unable to hover on the living unit");
			return false;
		}
	}
	public static boolean typeofsofa(WebDriver driver,Logger log) throws Exception
	{
		Thread.sleep(2000);
		if(ReusableMethods.click(HomepageLivingUI.typeofsofaset, driver))
		{
			log.info("successfully clicked on the type of sofasets");
			return true;
		}
		else
		{
			log.error("unable to click on the type of sofaset");
			return false;
		}
	}
	public static boolean count(WebDriver driver,Logger log) throws InterruptedException
	{
		Thread.sleep(2000);
		String str=ReusableMethods.getText(HomepageLivingUI.countofproduct, driver);
		if(str!=null)
		{
			log.info("successfully printed the count of the products");
			System.out.println(str);
			return true;
		}
		else
		{
			log.error("unable to print on the number of products");
			return false;
		}
	}

}
