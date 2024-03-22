@DataDriven
Feature: Login to OrangeHRM web page Using Data Driven Testing
Scenario: Login to OrangeHRM via Data Table Without Header
	Given Login to the OrangeHRM page
	When Enter the credentials below 
		 | UserName | Password |
	   | Admin      | admin123|
	And  user click the Login button

    
