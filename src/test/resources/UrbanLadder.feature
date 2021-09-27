########################################1##############################################################
Feature: End to End Test on UrbanLadder Website 
Scenario: Checking the Whether required storage unit is there and validating the Title of Webpage
Given :load the driver with the url 
When :close the popup and hover the storage unit
Then :It should navigate to another page and quit the browser
#########################################2##############################################################
Scenario Outline:  Sending the input into the search box and getting the results
Given :load the driver with the url
When :Close the popup and he need to enter the <keys> in search box
Then :The user need to get the first productname
Examples:
|keys|
|tables|
|chairs|
#####################################3########################################################################3
Scenario: Checking whether the payment gate way accepts Visa and checking whether the Bed icon is clickable or not 
Given :load the driver with the url 
When :close the popup and check whether the Bed icon is present or not 
And :checking whether the Visa card is acceptable in gate way or not 
Then :It should navigate to the facebook page of the UrbanLadder and quit the browser 
###############################4###################################
Scenario: Getting the popular product from the AboutUs page
Given :load the driver with the url 
When :close the popup and click on the aboutus career page 
Then :Get the roles to which they are looking for in the apply now page
And :Quit the browser
###############5#############################
Scenario Outline:  Clicking on the track the order and getting the cin number
Given :load the driver with the url
When :Close the popup and click on the trackthe order and send the keys of <onumber> <pnumber>
Then :Get the CIN number in the website and Quit the Website
Examples:
|onumber|pnumber|
|1234|9849543562|
|ojhkh|9121650979|
#######################6################################################
Scenario: Getting price,number of products and name for the different types of the bestsellers
Given :load the driver with the url 
When :close the popup and hover on the collection
And :click on the bestseller under it
Then :It should gives the various details of the different collection of the bestsellers
############################7#################################################
Scenario: Sending the gift card to the loved one!
Given :load the driver with the url 
When :close the popup and click on the Giftcard icon
And :click on the brequired occasion to which you want to send
Then :Enter the details of the month and day from the drop down and click on next
And :Quit the browser
#################################8#########################################################
Scenario: Getting count of the no of product under Living section
Given :load the driver with the url 
When :close the popup and hover on the Living room icon
And :click on the futons
Then :Get the Count of present in page
And :Quit the browser
#########################################9###########################################
Scenario: Adding the item to compare
Given :load the driver with the url 
When :close the popup and hover on the Dining icon
And :click on the Chairpads
Then :Add the first two items for compare
And :Quit the browser
##############################10##################################
Scenario: Adding the item to cart
Given :load the driver with the url 
When :close the popup and hover on the Decor icon
Then :Add the first item to cart
And :Quit the browser
