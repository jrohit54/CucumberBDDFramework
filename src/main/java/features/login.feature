Feature: Free CRM Login Feature

Scenario: Free CRM Login Test Scenario

Given User is already on login_page
When Title of login_page  is FreeCRM
Then user click on login button
Then user click on classic CRM link
Then user enters user_name and password 
And user clicks on login button 
And user is on home page
