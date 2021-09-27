package com.urbanladderCucumber_BDD.StepDefinitions;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;


import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import com.urbanladderCucumber_BDD.pageobject.AboutUs;
import com.urbanladderCucumber_BDD.pageobject.Cart;
import com.urbanladderCucumber_BDD.pageobject.Collections;
import com.urbanladderCucumber_BDD.pageobject.Compare;
import com.urbanladderCucumber_BDD.pageobject.FooterPage;
import com.urbanladderCucumber_BDD.pageobject.GiftCard;
import com.urbanladderCucumber_BDD.pageobject.HomepageLiving;
import com.urbanladderCucumber_BDD.pageobject.HomepageStorage;
import com.urbanladderCucumber_BDD.pageobject.SearchBox;
import com.urbanladderCucumber_BDD.pageobject.TracktheOrder;
import com.urbanladderCucumber_BDD.resuablemethods.ReusableComponents;
import com.urbanladderCucumber_BDD.resuablemethods.ReusableMethods;
import com.urbanladderCucumber_BDD.uistores.FooterPageUI;
import com.urbanladderCucumber_BDD.utility.*;

public class StepDefinition {
	private  Logger log=  Log.logger(StepDefinition .class.getName());
	public WebDriver driver;
	 @Given("^:load the driver with the url$")
	    public void load_the_driver_with_the_url() throws Throwable {
	        driver=ReusableComponents.loaddriver();
	        ReusableMethods.loadurl(driver);
	        
	        Thread.sleep(2000);
	    }

	      @When("^:close the popup and hover the storage unit$")
	    public void close_the_popup_and_hover_the_storage_unit() throws Throwable {
	    	  
	      boolean output=  HomepageStorage.popup(driver, log);
	      Assert.assertEquals(output,true);
	      Thread.sleep(2000);
	 boolean a= HomepageStorage.storageunit(driver, log);
	 Assert.assertEquals(a, true);
	  
	        
	        
	    }

	    @Then("^:It should navigate to another page and quit the browser$")
	    public void it_should_navigate_to_another_page_and_quit_the_browser() throws Throwable {
	        HomepageStorage.producttitle(driver, log);
	    	driver.quit();
	    }
	    

	    @When("^:Close the popup and he need to enter the (.+) in search box$")
	    public void close_the_popup_and_he_need_to_enter_the_in_search_box(String keys) throws Throwable {
	    	
		    boolean output2=  SearchBox.popup(driver, log);
		    Assert.assertEquals(output2,true);
		    
		    SearchBox.sendinginfo(driver, log, keys);
	    }

	    @Then("^:The user need to get the first productname$")
	    public void the_user_need_to_get_the_first_productname() throws Throwable {
	    	boolean output=SearchBox.productinfo(driver, log);
	    	driver.quit();
	    }
	   

	    @When("^:close the popup and check whether the Bed icon is present or not$")
	    public void close_the_popup_and_check_whether_the_bed_icon_is_present_or_not() throws Throwable {
	       boolean output=FooterPage.popup(driver, log);
	       Assert.assertEquals(output, true);
	       Thread.sleep(1000);
	     boolean output1=  FooterPage.headings(driver, log);
	     Assert.assertEquals(output1, true);
	   
	    }

	    @Then("^:It should navigate to the facebook page of the UrbanLadder and quit the browser$")
	    public void it_should_navigate_to_the_facebook_page_of_the_urbanladder_and_quit_the_browser() throws Throwable {
	      boolean output= FooterPage.soacialmedia(driver, log);
	      Assert.assertEquals(output, true);
	    	driver.quit();
	    }

	    @And("^:checking whether the Visa card is acceptable in gate way or not$")
	    public void checking_whether_the_visa_card_is_acceptable_in_gate_way_or_not() throws Throwable {
	      boolean output=  FooterPage.multiplecards(driver, log);
	      Assert.assertEquals(output, true);
	        
	    }
	    @When("^:close the popup and click on the aboutus career page$")
	    public void close_the_popup_and_click_on_the_aboutus_career_page() throws Throwable {
	       Thread.sleep(2000);
	    	boolean output=AboutUs.popup(driver, log);
	       Assert.assertEquals(output,true);
	       Thread.sleep(2000);
	       boolean output1=AboutUs.clickingonaboutus(driver, log);
	       Assert.assertEquals(output1,true);
	    }

	    @Then("^:Get the roles to which they are looking for in the apply now page$")
	    public void get_the_roles_to_which_they_are_looking_for_in_the_apply_now_page() throws Throwable {
	       boolean output=AboutUs.hiringrole(driver, log);
	       Assert.assertEquals(output, true);
	       Thread.sleep(2000);
	       
	    }

	    @And("^:Quit the browser$")
	    public void quit_the_browser() throws Throwable {
	       driver.quit();
	    }
	    @When("^:Close the popup and click on the trackthe order and send the keys of (.+) (.+)$")
	    public void close_the_popup_and_click_on_the_trackthe_order_and_send_the_keys_of(String onumber, String pnumber) throws Throwable {
	       boolean output=TracktheOrder.popup(driver, log);
	       Assert.assertEquals(output, true);
	       Thread.sleep(2000);
	       boolean output1=TracktheOrder.tracktheorder(driver, log, onumber, pnumber);
	       Assert.assertEquals(output,true);
	       
	    }

	    @Then("^:Get the CIN number in the website and Quit the Website$")
	    public void get_the_cin_number_in_the_website_and_quit_the_website() throws Throwable {
	       boolean output=TracktheOrder.cinnumber(driver, log);
	       Assert.assertEquals(output, true);
	       driver.quit();
	    }
	    @When("^:close the popup and hover on the collection$")
	    public void close_the_popup_and_hover_on_the_collection() throws Throwable {
	        boolean output=Collections.popup(driver, log);
	        Assert.assertEquals(output, true);
	        Thread.sleep(2000);
	        boolean output1=Collections.collections(driver, log);
	        Assert.assertEquals(output1, true);
	    }

	    @Then("^:It should gives the various details of the different collection of the bestsellers$")
	    public void it_should_gives_the_various_details_of_the_different_collection_of_the_bestsellers() throws Throwable {
	     boolean output=Collections.holeresults(driver, log);
	    	driver.quit();
	    }

	    @And("^:click on the bestseller under it$")
	    public void click_on_the_bestseller_under_it() throws Throwable {
	       boolean output=Collections.bestsellers(driver, log);
	       Assert.assertEquals(output, true);
	    }

	    @When("^:close the popup and click on the Giftcard icon$")
	    public void close_the_popup_and_click_on_the_giftcard_icon() throws Throwable {
	        boolean output=GiftCard.popup(driver, log);
	        Assert.assertEquals(output, true);
	        boolean output1=GiftCard.giftcardicon(driver, log);
	        Assert.assertEquals(output1, true);
	        
	   
	    }

	    @Then("^:Enter the details of the month and day from the drop down and click on next$")
	    public void enter_the_details_of_the_month_and_day_from_the_drop_down_and_click_on_next() throws Throwable {
	  
	    	boolean output=GiftCard.dayandmonth(driver, log);
	    	Assert.assertEquals(output, true);
	    }

	    @And("^:click on the brequired occasion to which you want to send$")
	    public void click_on_the_brequired_occasion_to_which_you_want_to_send() throws Throwable {
	        boolean output=GiftCard.occasion(driver, log);
	        Assert.assertEquals(output, true);
	    }
	    @When("^:close the popup and hover on the Living room icon$")
	    public void close_the_popup_and_hover_on_the_living_room_icon() throws Throwable {
	     boolean output=HomepageLiving.popup(driver, log);
	     Assert.assertEquals(output, true);
	     boolean output1=HomepageLiving.livingunit(driver, log);
	     Assert.assertEquals(output1, true);
	   
	    }

	    @Then("^:Get the Count of present in page$")
	    public void get_the_count_of_present_in_page() throws Throwable {
	       boolean output=HomepageLiving.count(driver, log);
	       Assert.assertEquals(output, true);
	  
	    }

	    @And("^:click on the futons$")
	    public void click_on_the_futons() throws Throwable {
	      boolean output=HomepageLiving.typeofsofa(driver, log)  ;
	      Assert.assertEquals(output,true);
	   
	    }
	    @When("^:close the popup and hover on the Dining icon$")
	    public void close_the_popup_and_hover_on_the_dining_icon() throws Throwable {
	        boolean output=Compare.popup(driver, log);
	        Assert.assertEquals(output, true);
	        boolean output1=Compare.diningunit(driver, log);
	        Assert.assertEquals(output1, true);
	    }

	    @Then("^:Add the first two items for compare$")
	    public void add_the_first_two_items_for_compare() throws Throwable {
	    boolean output=Compare.addtocompare(driver, log)  ;
	    Assert.assertEquals(output, true);
	    }

	    @And("^:click on the Chairpads$")
	    public void click_on_the_chairpads() throws Throwable {
	        boolean output=Compare.diningtype(driver, log);
	        Assert.assertEquals(output, true);
	    }
	    @When("^:close the popup and hover on the Decor icon$")
	    public void close_the_popup_and_hover_on_the_decor_icon() throws Throwable {
	        boolean output=Cart.popup(driver, log);
	        Assert.assertEquals(output, true);
	        boolean output1=Cart.decorunit(driver, log);
	        Assert.assertEquals(output1,true);
	    }

	    @Then("^:Add the first item to cart$")
	    public void add_the_first_item_to_cart() throws Throwable {
	       boolean output=Cart.addtocart(driver, log);
	       Assert.assertEquals(output, true);
	    }

	   

	   

}
