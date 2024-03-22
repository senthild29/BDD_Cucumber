Feature: Login to OrangeHRM web page
Scenario: Login to OrangeHRM
	Given User is on OrangeHRM login page
	When User enters the valid username as "Admin" and password as "admin123"
	And  clicks on the Login button
	Then User should navigate to home page of OrangeHRM

@Login	
Scenario: Enter with valid credentials
	Given User is on OrangeHRM login page
	When User enters the valid username as "Admin" and password as "admin123"
	And  clicks on the Login button
	Then User should navigate to home page of OrangeHRM