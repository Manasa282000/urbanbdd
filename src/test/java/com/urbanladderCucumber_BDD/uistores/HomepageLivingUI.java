package com.urbanladderCucumber_BDD.uistores;

import org.openqa.selenium.By;

public class HomepageLivingUI {

	public static By popup=By.xpath("//a[contains(@class,'close-reveal-modal hide-mobile')]");
	public static By livingunit=By.xpath("//li[contains(@class,'topnav_item livingunit')]");
	public static By typeofsofaset=By.xpath("//span[contains(text(),'Futons')]");
	public static By countofproduct=By.xpath("//div[@class='results-count']");
	
}
