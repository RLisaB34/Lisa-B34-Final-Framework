@Smoke @Regression 
Feature: Log-in function test 
Description: 

@Positive @TC_OB-4
Scenario: Check log-in with valid credentials 
Given Open browser and go to application 
When Enter valid username 
When Enter valid password 
When Click login 
Then Logout button should be present 

@Negative @TC_OB-5
Scenario: Check log-in with valid credentials 
Given Open browser and go to application 
When Enter invalid username 
When Enter invalid password 
When Click login2 
Then Show alert message Invalid username or password 

@Negative @TC_OB-6
Scenario: Check log-in with valid credentials 
Given Open browser and go to application 
When Enter null username 
When Enter null password 
When Click login3 
Then Show alert message Invalid username or password 


