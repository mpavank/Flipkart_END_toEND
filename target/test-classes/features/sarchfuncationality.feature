Feature: To validate the Flipkart application

Background:

Given Launch the Flipkart application 
When close the popup 
Then It should navigates to the home page
@tc001 @Regression
Scenario: To validate the search functionality 

Given user enter the text in the search field 
When  clicks the search button 
Then It should navigates to the search result page and display the relevant detailes 
And Select Minimum and maximum Amount 
And Select the Brand 
And Select the Ram 
And Select the BatteryCapacity 
Then It shout display the Relavant result  

@tc002 @Regression
Scenario: To validate the Fashion Functionality 
Given User to move the fashion link 
When curser to move to the Kids link 
And move to girls dress and click 
And click the price high to low link 
Then It should display the relevant details and get the title    


@tc003 @Regression
Scenario Outline: To validate the search functionality with different values

Given Enter the "<searchtext>" in the search field
When click the search button
Then it should navigates to the text page and display the correspding page

Examples:
|searchtext|
|Mobile|
|TV|
|speaker|
|shirt|  

@tc004 @Regression
Scenario: To validate upto addcart functionality 

Given User can move to the login link 
When User can click the flipkart pluse zone 
And Mouse move to the Home&Furniture link 
And Going to click the wall lamp 
And Scroll down the page and click one particular result 
And Enter delivery pincode and click the check link 
Then Pincode should be checked and display and verify the titles   

@tc005 @Regression 
Scenario: To get the title and price from search 
Given Enter the search text in the text field 
When click the search icon 
Then It should display the search result and get the title 

@tc006 @Regression 
Scenario: To Test the search functionality with excel sheet  

Given Enter Search Text In the Search Field 
When click search Icon 
Then It should Display the Relevent result  







































































