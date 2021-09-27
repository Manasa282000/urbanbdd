package com.urbanladderCucumber_BDD.pageobject;



import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;


import com.urbanladderCucumber_BDD.resuablemethods.ReusableMethods;
import com.urbanladderCucumber_BDD.uistores.HomepageStorageUI;


public class HomepageStorage {
	
public static String Title;
public static String Title1;
	public static boolean popup(WebDriver driver,Logger log) throws Exception
	{
		
		Thread.sleep(2000);
		ReusableMethods.timelaps(driver);
		
		if(ReusableMethods.click(HomepageStorageUI.popup, driver))
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
	public static boolean storageunit(WebDriver driver,Logger log) throws InterruptedException, Exception
	{
		if(ReusableMethods.action(HomepageStorageUI.storageunit, driver))
		{
			Thread.sleep(2000);
			if(ReusableMethods.click(HomepageStorageUI.particularstorage, driver))
			{
				log.info("succesfully clicked on the particular storage unit");
				
			}
			return true;
		}
		else
		{
			log.error("unable to click on the particular storage unit");
		return false;
		}
	}

	
	public static boolean producttitle(WebDriver driver,Logger log)
	{
		Title=ReusableMethods.getText(HomepageStorageUI.productdetails, driver);
		if(Title!=null)
		{
			log.info("successfully got the title of the product");
			System.out.println(Title);
			return true;
		}
		return false;
	}
}
