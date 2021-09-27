package com.urbanladderCucumber_BDD.uistores;

import org.openqa.selenium.By;

public class AboutUsUI {
	public static By popup=By.xpath("//a[contains(@class,'close-reveal-modal hide-mobile')]");
			public static By Aboutus=By.xpath("//li//a[text()='About Us']");
			public static By careers=By.xpath("//div[@id='page_content']//li//a[contains(text(),'Careers')]");
			public static By applynow=By.xpath("//a[contains(text(),'Apply Now!')]");
			public static By roles=By.xpath("//ul[@class='disc']//li[@class='answer']//a");
}
