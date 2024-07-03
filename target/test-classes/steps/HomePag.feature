Feature: HomePage Functionality

Scenario: validate title
Given User is at landing page
Then Page title  should contain the "Shopping"

Scenario: verify the cart icon
Given User is at landing page
Then Cart icon should get displayed

#Scenario: login to app
#Given User is at landing page
#When User click on signin button
#And User enters username "test"
#And User enters password "enter"
#Then User should be logged in

#Scenario: search the item
#Given User is at landing page
#When user search the iteam "mobile"
#Then user is at mobile listing page "mobile"


