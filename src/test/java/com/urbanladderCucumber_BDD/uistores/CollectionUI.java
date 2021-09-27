package com.urbanladderCucumber_BDD.uistores;

import org.openqa.selenium.By;

public class CollectionUI {
	public static By popup=By.xpath("//a[contains(@class,'close-reveal-modal hide-mobile')]");
	public static By collectionunit=By.xpath("//li[contains(@class,'topnav_item collectionsunit')]");
	public static By bestsellers=By.xpath("//a[@class='inverted'][normalize-space()='Best Sellers']");
	public static By holeproducts=By.xpath("//div[@class='text-center']");

}
