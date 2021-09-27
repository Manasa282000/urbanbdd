package com.urbanladderCucumber_BDD.pageobject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.urbanladderCucumber_BDD.resuablemethods.ReusableMethods;
import com.urbanladderCucumber_BDD.uistores.FooterPageUI;
import com.urbanladderCucumber_BDD.uistores.TracktheOrderUI;

public class TracktheOrder {
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
	public static boolean tracktheorder(WebDriver driver,Logger log,String onumber,String pnumber) throws InterruptedException, Exception
	{
		Thread.sleep(2000);
		if(ReusableMethods.click(TracktheOrderUI.trackordericon, driver))
		{
			log.info("successfully clicked on the track order button");
			Thread.sleep(2000);
			if(ReusableMethods.sendKeys(TracktheOrderUI.ordernumber, onumber, driver))
			{
				log.info("successfully send the keys");
				Thread.sleep(2000);
				if(ReusableMethods.sendKeys(TracktheOrderUI.pnumber, pnumber, driver))
				{
					log.info("successfully send the phonenumber");
					
				}
			}
			return true;
		}
		else
		{
			log.error("unable to enter the tack order number ");
		return false;
		}
	}
	public static boolean cinnumber(WebDriver driver,Logger log)
	{
		String cin=ReusableMethods.getText(TracktheOrderUI.CIN, driver);
		if(cin!=null)
		{
			log.info("successfully got cin number");
			System.out.println(cin);
			return true;
			
		}
		else
		{
			log.error("unable to get the cin number");
			return false;
		}
	}

}
