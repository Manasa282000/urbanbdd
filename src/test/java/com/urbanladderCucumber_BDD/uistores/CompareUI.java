package com.urbanladderCucumber_BDD.uistores;

import org.openqa.selenium.By;

public class CompareUI {
	public static By popup=By.xpath("//a[contains(@class,'close-reveal-modal hide-mobile')]");
	public static By diningbutton=By.xpath("//li[contains(@class,'topnav_item diningunit')]");
    public static By chairpads=By.xpath("//li[contains(@class,'topnav_item diningunit')]//ul[@class='taxonslist']//span[text()='Chair Pads']");
   public static By addtocompare=By.xpath("//li[contains(@class,'product hovercard')]//div[@class='otherinfo']//a[text()='Add to Compare']");
    public static By comparebutton=By.xpath("//button[text()='Compare']");
}
