package com.urbanladderCucumber_BDD.uistores;

import org.openqa.selenium.By;

public class GiftCardUI {
public static By popup=By.xpath("//a[contains(@class,'close-reveal-modal hide-mobile')]");
public static By giftcard=By.xpath("//a[contains(text(),'Gift Cards')]");
public static By occasion= By.xpath("//*[@id=\"app-container\"]/div/main/section/section[1]/ul/li[3]/img");
public static By amount=By.xpath("//div//input[@type='number']");
public static By monthclick=By.xpath("//div//select[1]");
public static By month=By.xpath("//div//select[1]//option");
public static By day=By.xpath("//div//select[2]//option");
public static By next=By.xpath("//button[contains(text(),'Next')]");



}
