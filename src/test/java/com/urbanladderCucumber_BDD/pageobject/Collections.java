package com.urbanladderCucumber_BDD.pageobject;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.urbanladderCucumber_BDD.resuablemethods.ReusableMethods;
import com.urbanladderCucumber_BDD.uistores.CollectionUI;
import com.urbanladderCucumber_BDD.uistores.FooterPageUI;

public class Collections {
	public static boolean popup(WebDriver driver,Logger log) throws Exception
	{
		Thread.sleep(2000);
		ReusableMethods.timelaps(driver);
		ReusableMethods.waituntil(CollectionUI.popup, driver);
		if(ReusableMethods.click(CollectionUI.popup, driver))
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
	public static boolean collections(WebDriver driver,Logger log) throws Exception
	{
		Thread.sleep(2000);
		if(ReusableMethods.action(CollectionUI.collectionunit, driver))
		{
			log.info("The collection tab is hovered successfully");
			return true;
		}
		else
		{
			log.error("The collection tab is not hovered");
			return false;
		}
	}
	public static boolean bestsellers(WebDriver driver,Logger log) throws Exception
	{
		Thread.sleep(2000);
		if(ReusableMethods.click(CollectionUI.bestsellers, driver))
		{
			log.info("The bestseller tab is clicked successfully");
			return true;
		}
		else
		{
			log.error("The bestseller tab is not clicked on it");
			return false;
		}
	}
	public static boolean holeresults(WebDriver driver,Logger log) throws InterruptedException
	{
		Thread.sleep(2000);
		List<WebElement>list=ReusableMethods.findelements(CollectionUI.holeproducts, driver);
		if(list!=null)
		{
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
		}
		log.info("Successfully the number of items and each section with price is printed");
		return true;
		}
		else
		{
			log.error("The list of items are not printed ");
		return false;
		}
	}

}
