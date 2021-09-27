$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("UrbanLadder.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "########################################1##############################################################"
    }
  ],
  "line": 2,
  "name": "End to End Test on UrbanLadder Website",
  "description": "",
  "id": "end-to-end-test-on-urbanladder-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Checking the Whether required storage unit is there and validating the Title of Webpage",
  "description": "",
  "id": "end-to-end-test-on-urbanladder-website;checking-the-whether-required-storage-unit-is-there-and-validating-the-title-of-webpage",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": ":load the driver with the url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": ":close the popup and hover the storage unit",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": ":It should navigate to another page and quit the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.load_the_driver_with_the_url()"
});
formatter.result({
  "duration": 9720611600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.close_the_popup_and_hover_the_storage_unit()"
});
formatter.result({
  "duration": 14356395300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.it_should_navigate_to_another_page_and_quit_the_browser()"
});
formatter.result({
  "duration": 1288064600,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 7,
      "value": "#########################################2##############################################################"
    }
  ],
  "line": 8,
  "name": "Sending the input into the search box and getting the results",
  "description": "",
  "id": "end-to-end-test-on-urbanladder-website;sending-the-input-into-the-search-box-and-getting-the-results",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": ":load the driver with the url",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": ":Close the popup and he need to enter the \u003ckeys\u003e in search box",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": ":The user need to get the first productname",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "end-to-end-test-on-urbanladder-website;sending-the-input-into-the-search-box-and-getting-the-results;",
  "rows": [
    {
      "cells": [
        "keys"
      ],
      "line": 13,
      "id": "end-to-end-test-on-urbanladder-website;sending-the-input-into-the-search-box-and-getting-the-results;;1"
    },
    {
      "cells": [
        "tables"
      ],
      "line": 14,
      "id": "end-to-end-test-on-urbanladder-website;sending-the-input-into-the-search-box-and-getting-the-results;;2"
    },
    {
      "cells": [
        "chairs"
      ],
      "line": 15,
      "id": "end-to-end-test-on-urbanladder-website;sending-the-input-into-the-search-box-and-getting-the-results;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Sending the input into the search box and getting the results",
  "description": "",
  "id": "end-to-end-test-on-urbanladder-website;sending-the-input-into-the-search-box-and-getting-the-results;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": ":load the driver with the url",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": ":Close the popup and he need to enter the tables in search box",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": ":The user need to get the first productname",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.load_the_driver_with_the_url()"
});
formatter.result({
  "duration": 6415880300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tables",
      "offset": 42
    }
  ],
  "location": "StepDefinition.close_the_popup_and_he_need_to_enter_the_in_search_box(String)"
});
formatter.result({
  "duration": 11461764600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.the_user_need_to_get_the_first_productname()"
});
formatter.result({
  "duration": 3560520900,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Sending the input into the search box and getting the results",
  "description": "",
  "id": "end-to-end-test-on-urbanladder-website;sending-the-input-into-the-search-box-and-getting-the-results;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": ":load the driver with the url",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": ":Close the popup and he need to enter the chairs in search box",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": ":The user need to get the first productname",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.load_the_driver_with_the_url()"
});
formatter.result({
  "duration": 6214237700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "chairs",
      "offset": 42
    }
  ],
  "location": "StepDefinition.close_the_popup_and_he_need_to_enter_the_in_search_box(String)"
});
formatter.result({
  "duration": 12419250200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.the_user_need_to_get_the_first_productname()"
});
formatter.result({
  "duration": 3180941300,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 16,
      "value": "#####################################3########################################################################3"
    }
  ],
  "line": 17,
  "name": "Checking whether the payment gate way accepts Visa and checking whether the Bed icon is clickable or not",
  "description": "",
  "id": "end-to-end-test-on-urbanladder-website;checking-whether-the-payment-gate-way-accepts-visa-and-checking-whether-the-bed-icon-is-clickable-or-not",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": ":load the driver with the url",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": ":close the popup and check whether the Bed icon is present or not",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": ":checking whether the Visa card is acceptable in gate way or not",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": ":It should navigate to the facebook page of the UrbanLadder and quit the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.load_the_driver_with_the_url()"
});
formatter.result({
  "duration": 6273786400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.close_the_popup_and_check_whether_the_bed_icon_is_present_or_not()"
});
formatter.result({
  "duration": 14224911500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.checking_whether_the_visa_card_is_acceptable_in_gate_way_or_not()"
});
formatter.result({
  "duration": 2122509300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.it_should_navigate_to_the_facebook_page_of_the_urbanladder_and_quit_the_browser()"
});
formatter.result({
  "duration": 3318797000,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 22,
      "value": "###############################4###################################"
    }
  ],
  "line": 23,
  "name": "Getting the popular product from the AboutUs page",
  "description": "",
  "id": "end-to-end-test-on-urbanladder-website;getting-the-popular-product-from-the-aboutus-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": ":load the driver with the url",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": ":close the popup and click on the aboutus career page",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": ":Get the roles to which they are looking for in the apply now page",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": ":Quit the browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.load_the_driver_with_the_url()"
});
formatter.result({
  "duration": 5648816800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.close_the_popup_and_click_on_the_aboutus_career_page()"
});
formatter.result({
  "duration": 16126882700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.get_the_roles_to_which_they_are_looking_for_in_the_apply_now_page()"
});
formatter.result({
  "duration": 2701429800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.quit_the_browser()"
});
formatter.result({
  "duration": 862869600,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 28,
      "value": "###############5#############################"
    }
  ],
  "line": 29,
  "name": "Clicking on the track the order and getting the cin number",
  "description": "",
  "id": "end-to-end-test-on-urbanladder-website;clicking-on-the-track-the-order-and-getting-the-cin-number",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 30,
  "name": ":load the driver with the url",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": ":Close the popup and click on the trackthe order and send the keys of \u003conumber\u003e \u003cpnumber\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": ":Get the CIN number in the website and Quit the Website",
  "keyword": "Then "
});
formatter.examples({
  "line": 33,
  "name": "",
  "description": "",
  "id": "end-to-end-test-on-urbanladder-website;clicking-on-the-track-the-order-and-getting-the-cin-number;",
  "rows": [
    {
      "cells": [
        "onumber",
        "pnumber"
      ],
      "line": 34,
      "id": "end-to-end-test-on-urbanladder-website;clicking-on-the-track-the-order-and-getting-the-cin-number;;1"
    },
    {
      "cells": [
        "1234",
        "9849543562"
      ],
      "line": 35,
      "id": "end-to-end-test-on-urbanladder-website;clicking-on-the-track-the-order-and-getting-the-cin-number;;2"
    },
    {
      "cells": [
        "ojhkh",
        "9121650979"
      ],
      "line": 36,
      "id": "end-to-end-test-on-urbanladder-website;clicking-on-the-track-the-order-and-getting-the-cin-number;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 35,
  "name": "Clicking on the track the order and getting the cin number",
  "description": "",
  "id": "end-to-end-test-on-urbanladder-website;clicking-on-the-track-the-order-and-getting-the-cin-number;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 30,
  "name": ":load the driver with the url",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": ":Close the popup and click on the trackthe order and send the keys of 1234 9849543562",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": ":Get the CIN number in the website and Quit the Website",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.load_the_driver_with_the_url()"
});
formatter.result({
  "duration": 5253181700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234",
      "offset": 70
    },
    {
      "val": "9849543562",
      "offset": 75
    }
  ],
  "location": "StepDefinition.close_the_popup_and_click_on_the_trackthe_order_and_send_the_keys_of(String,String)"
});
formatter.result({
  "duration": 19202720700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.get_the_cin_number_in_the_website_and_quit_the_website()"
});
formatter.result({
  "duration": 910541900,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "Clicking on the track the order and getting the cin number",
  "description": "",
  "id": "end-to-end-test-on-urbanladder-website;clicking-on-the-track-the-order-and-getting-the-cin-number;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 30,
  "name": ":load the driver with the url",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": ":Close the popup and click on the trackthe order and send the keys of ojhkh 9121650979",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": ":Get the CIN number in the website and Quit the Website",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.load_the_driver_with_the_url()"
});
formatter.result({
  "duration": 5006248000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ojhkh",
      "offset": 70
    },
    {
      "val": "9121650979",
      "offset": 76
    }
  ],
  "location": "StepDefinition.close_the_popup_and_click_on_the_trackthe_order_and_send_the_keys_of(String,String)"
});
formatter.result({
  "duration": 19213297400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.get_the_cin_number_in_the_website_and_quit_the_website()"
});
formatter.result({
  "duration": 1373615300,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 37,
      "value": "#######################6################################################"
    }
  ],
  "line": 38,
  "name": "Getting price,number of products and name for the different types of the bestsellers",
  "description": "",
  "id": "end-to-end-test-on-urbanladder-website;getting-price,number-of-products-and-name-for-the-different-types-of-the-bestsellers",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 39,
  "name": ":load the driver with the url",
  "keyword": "Given "
});
formatter.step({
  "line": 40,
  "name": ":close the popup and hover on the collection",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": ":click on the bestseller under it",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": ":It should gives the various details of the different collection of the bestsellers",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.load_the_driver_with_the_url()"
});
formatter.result({
  "duration": 5125812000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.close_the_popup_and_hover_on_the_collection()"
});
formatter.result({
  "duration": 12301300000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.click_on_the_bestseller_under_it()"
});
formatter.result({
  "duration": 3266488300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.it_should_gives_the_various_details_of_the_different_collection_of_the_bestsellers()"
});
formatter.result({
  "duration": 3166074200,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 43,
      "value": "############################7#################################################"
    }
  ],
  "line": 44,
  "name": "Sending the gift card to the loved one!",
  "description": "",
  "id": "end-to-end-test-on-urbanladder-website;sending-the-gift-card-to-the-loved-one!",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 45,
  "name": ":load the driver with the url",
  "keyword": "Given "
});
formatter.step({
  "line": 46,
  "name": ":close the popup and click on the Giftcard icon",
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": ":click on the brequired occasion to which you want to send",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": ":Enter the details of the month and day from the drop down and click on next",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": ":Quit the browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.load_the_driver_with_the_url()"
});
formatter.result({
  "duration": 5486416700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.close_the_popup_and_click_on_the_giftcard_icon()"
});
formatter.result({
  "duration": 14194734500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.click_on_the_brequired_occasion_to_which_you_want_to_send()"
});
formatter.result({
  "duration": 2218438900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.enter_the_details_of_the_month_and_day_from_the_drop_down_and_click_on_next()"
});
formatter.result({
  "duration": 7504175900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.quit_the_browser()"
});
formatter.result({
  "duration": 967986600,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 50,
      "value": "#################################8#########################################################"
    }
  ],
  "line": 51,
  "name": "Getting count of the no of product under Living section",
  "description": "",
  "id": "end-to-end-test-on-urbanladder-website;getting-count-of-the-no-of-product-under-living-section",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 52,
  "name": ":load the driver with the url",
  "keyword": "Given "
});
formatter.step({
  "line": 53,
  "name": ":close the popup and hover on the Living room icon",
  "keyword": "When "
});
formatter.step({
  "line": 54,
  "name": ":click on the futons",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": ":Get the Count of present in page",
  "keyword": "Then "
});
formatter.step({
  "line": 56,
  "name": ":Quit the browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.load_the_driver_with_the_url()"
});
formatter.result({
  "duration": 5586685900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.close_the_popup_and_hover_on_the_living_room_icon()"
});
formatter.result({
  "duration": 10531486300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.click_on_the_futons()"
});
formatter.result({
  "duration": 3652140100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.get_the_count_of_present_in_page()"
});
formatter.result({
  "duration": 2063356400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.quit_the_browser()"
});
formatter.result({
  "duration": 983894200,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 57,
      "value": "#########################################9###########################################"
    }
  ],
  "line": 58,
  "name": "Adding the item to compare",
  "description": "",
  "id": "end-to-end-test-on-urbanladder-website;adding-the-item-to-compare",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 59,
  "name": ":load the driver with the url",
  "keyword": "Given "
});
formatter.step({
  "line": 60,
  "name": ":close the popup and hover on the Dining icon",
  "keyword": "When "
});
formatter.step({
  "line": 61,
  "name": ":click on the Chairpads",
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": ":Add the first two items for compare",
  "keyword": "Then "
});
formatter.step({
  "line": 63,
  "name": ":Quit the browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.load_the_driver_with_the_url()"
});
formatter.result({
  "duration": 5206080800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.close_the_popup_and_hover_on_the_dining_icon()"
});
formatter.result({
  "duration": 10508398400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.click_on_the_chairpads()"
});
formatter.result({
  "duration": 3267715000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.add_the_first_two_items_for_compare()"
});
formatter.result({
  "duration": 8635785100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.quit_the_browser()"
});
formatter.result({
  "duration": 963777600,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 64,
      "value": "##############################10##################################"
    }
  ],
  "line": 65,
  "name": "Adding the item to cart",
  "description": "",
  "id": "end-to-end-test-on-urbanladder-website;adding-the-item-to-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 66,
  "name": ":load the driver with the url",
  "keyword": "Given "
});
formatter.step({
  "line": 67,
  "name": ":close the popup and hover on the Decor icon",
  "keyword": "When "
});
formatter.step({
  "line": 68,
  "name": ":Add the first item to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 69,
  "name": ":Quit the browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.load_the_driver_with_the_url()"
});
formatter.result({
  "duration": 5135904300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.close_the_popup_and_hover_on_the_decor_icon()"
});
formatter.result({
  "duration": 14071188500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.add_the_first_item_to_cart()"
});
formatter.result({
  "duration": 9683062800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.quit_the_browser()"
});
formatter.result({
  "duration": 974354500,
  "status": "passed"
});
});