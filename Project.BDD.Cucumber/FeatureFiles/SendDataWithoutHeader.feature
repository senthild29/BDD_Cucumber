@DataDriven
Feature: Login to OrangeHRM web page Using Data Driven Testing
Scenario: Login to OrangeHRM via Data Table Without Header
	Given Log on OrangeHRM login page
	When Enter the below credentials 
	   |Admin      | admin123|
	And  click on the Login button