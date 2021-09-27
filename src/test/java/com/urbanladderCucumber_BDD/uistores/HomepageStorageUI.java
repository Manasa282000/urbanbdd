package com.urbanladderCucumber_BDD.uistores;

import org.openqa.selenium.By;

public class HomepageStorageUI {
	public static By popup=By.xpath("//a[contains(@class,'close-reveal-modal hide-mobile')]");
	public static By storageunit=By.xpath("//li[contains(@class,'topnav_item kidsroomunit')]");
	public static By particularstorage=By.xpath("//span[normalize-space()='Play Tables']");
	public static By productdetails=By.xpath("//div[@class='product-info-block']//a")	;

}
