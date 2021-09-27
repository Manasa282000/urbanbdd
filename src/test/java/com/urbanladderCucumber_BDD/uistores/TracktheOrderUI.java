package com.urbanladderCucumber_BDD.uistores;

import org.openqa.selenium.By;

public class TracktheOrderUI {
	public static By popup=By.xpath("//a[contains(@class,'close-reveal-modal hide-mobile')]");	
	public static By trackordericon=By.xpath("//header/section[1]/div[1]/ul[1]/li[2]/a[1]");
	public static By ordernumber=By.xpath("//div//input[@placeholder='Order Number']");
	public static By pnumber=By.xpath("//div//input[@placeholder='Phone Number']");
	public static By CIN=By.xpath("//body[1]/div[1]/div[1]/footer[1]/section[1]/div[1]/section[4]/ul[1]/li[2]");

}
