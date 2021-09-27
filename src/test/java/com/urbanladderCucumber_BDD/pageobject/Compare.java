package com.urbanladderCucumber_BDD.pageobject;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.urbanladderCucumber_BDD.resuablemethods.ReusableMethods;

import com.urbanladderCucumber_BDD.uistores.CompareUI;

public class Compare {
	public static boolean popup(WebDriver driver,Logger log) throws Exception
	{
		Thread.sleep(2000);
		ReusableMethods.timelaps(driver);
		ReusableMethods.waituntil(CompareUI.popup, driver);
		if(ReusableMethods.click(CompareUI.popup, driver))
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
	public static boolean diningunit(WebDriver driver,Logger log) throws Exception
	{
		Thread.sleep(2000);
		if(ReusableMethods.action(CompareUI.diningbutton,driver))
		{
			log.info("successfuly clicked on the dining button on the homepage");
			return true;
		}
		else
		{
			log.error("The dining button is not clicked");
			return false;
		}
	}
	public static boolean diningtype(WebDriver driver,Logger log) throws Exception
	{
		Thread.sleep(2000);
		if(ReusableMethods.click(CompareUI.chairpads, driver))
		{
			log.info("The chair pads are succesffully clicked");
			return true;
		}
		else
		{
			log.info("The chair pads are not clicked on it ");
			return false;
		}
	}
	public static boolean addtocompare(WebDriver driver,Logger log) throws Exception
	{
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		List<WebElement>compare=ReusableMethods.findelements(CompareUI.addtocompare, driver);
		if(compare!=null)	
		{
			for(int i=0;i<2;i++)
			{
				
				js.executeScript("arguments[0].click();",compare.get(i));
				Thread.sleep(2000);;
			}
			Thread.sleep(2000);
			ReusableMethods.click(CompareUI.comparebutton, driver);
			log.info("successfully clickedon the add to compare");
			return true;
		}
		else
		{
			log.error("unable to click on the add to compare");
			return false;
		}
	}

}
