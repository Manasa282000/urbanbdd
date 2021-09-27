package com.urbanladderCucumber_BDD.uistores;

import org.openqa.selenium.By;

public class CartUI {
	public static By popup=By.xpath("//a[contains(@class,'close-reveal-modal hide-mobile')]");
	public static By decorunit=By.xpath("//li[contains(@class,'topnav_item bedroomunit')]");
	public static By decortype=By.xpath("//li[contains(@class,'bedroomunit')]//ul[@class='taxonslist']//span[text()='Wardrobes']");
	public static By product=By.xpath("//img[@title='Baltoro High Gloss 2 Door Wardrobe (White Finish)']");
	public static By addtocart=By.xpath("//button[contains(text(),'Add to Cart')]");

}
