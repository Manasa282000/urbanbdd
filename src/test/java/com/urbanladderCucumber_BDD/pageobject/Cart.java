package com.urbanladderCucumber_BDD.pageobject;

import java.util.Iterator;
import java.util.Set;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import com.urbanladderCucumber_BDD.resuablemethods.ReusableMethods;
import com.urbanladderCucumber_BDD.uistores.CartUI;


public class Cart {
	public static boolean popup(WebDriver driver,Logger log) throws Exception
	{
		Thread.sleep(2000);
		ReusableMethods.timelaps(driver);
		ReusableMethods.waituntil(CartUI.popup, driver);
		if(ReusableMethods.click(CartUI.popup, driver))
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
	public static boolean decorunit(WebDriver driver,Logger log) throws InterruptedException, Exception
	{
		Thread.sleep(2000);
		 if(ReusableMethods.action(CartUI.decorunit, driver))
		 {
			 log.info("Successfully the decor unit is hovered");
			 Thread.sleep(2000);
			 if(ReusableMethods.click(CartUI.decortype, driver))
			 {
				 log.info("The decor unit is clicked successfully");
				 
			 return true;
			 }
		 }
		return false;
		 
	}
	public static boolean addtocart(WebDriver driver,Logger log) throws InterruptedException, Exception
	{
		Thread.sleep(2000);
		if(ReusableMethods.click(CartUI.product, driver))
		{
			log.info("The product is added to cart successfully");
			Set<String> ids=driver.getWindowHandles();
			  Iterator<String> it=ids.iterator();
			    String parent=it.next();
			    Thread.sleep(2000);
			    String child=it.next();
			    driver.switchTo().window(child);
			    Thread.sleep(2000);
			   if( ReusableMethods.click(CartUI.addtocart, driver))
			   {
				  log.info("Successfully the product is added to the cart");
				   return true;
			   }
			
		}
		return false;
	}

}
