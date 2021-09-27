package com.urbanladderCucumber_BDD.pageobject;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.urbanladderCucumber_BDD.resuablemethods.ReusableMethods;
import com.urbanladderCucumber_BDD.uistores.AboutUsUI;
import com.urbanladderCucumber_BDD.uistores.FooterPageUI;

public class AboutUs {
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
			log.error("Kindly close popup popup is not close");
			return false;
		}
		
	
	}
	public static boolean clickingonaboutus(WebDriver driver,Logger log) throws Exception
	{
		Thread.sleep(2000);
		if(ReusableMethods.click(AboutUsUI.Aboutus, driver))
		{
			log.info("Successfully clicked on the Aboutus");
			if(ReusableMethods.click(AboutUsUI.careers, driver))
			{
				log.info("Successfully clicked on the Careers button");
				
			}
			return true;
		}
		else
		{
			log.error("Unable to click on the carrer button");
		return false;
		}
	}
	public static boolean hiringrole(WebDriver driver,Logger log) throws Exception
	{
		if(ReusableMethods.click(AboutUsUI.applynow, driver))
		{
			log.info("Successfully clicked on the apply now");
			List<WebElement>course=ReusableMethods.findelements(AboutUsUI.roles, driver);
			if(course!=null)
			{
				for(int i=0;i<course.size();i++)
				{
					System.out.println(course.get(i).getText());
				}
			}
			log.info("Successfully printed the roles that they required");
			return true;
		}
		else
		{
			log.error("Unable to click on the apply now page");
		return false;
		}
	}

}
