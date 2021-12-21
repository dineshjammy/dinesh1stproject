Feature: To validate the login functionality of facebook p
Scenario: Validate the login page with invalidate username and invalid password
Given User should  launch the browser and load the facebook page
When User should type the username in the facebook page
And  User should type the password in the facebook page
And  User should click the login button
Then User should navigate to incorrect credential page