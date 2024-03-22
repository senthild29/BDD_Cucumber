@DataDriven
Feature: Login to OrangeHRM web page Using Examples keyword

#Since we have used "Examples" keyword "Scenario" Gherkin will not work
#Hence we are using "Scenario Outline" Gherkin.
#Using this outline we can execute the test case multiple times until we have the data in "Examples" keyword.

Scenario Outline:  Login to OrangeHRM via Data Table with header and example keyword
	Given Open the OrangeHRM web page
	
# Also While using "Examples" and Senario Outline" Gherkins enclose column name with "<>"

	When User enter the credentials "<UserName>" and "<Password>"
	And  Clicked Login button

Examples:
		 | UserName | Password |
	   | Admin      | admin123|
	   | Admin12  | admin123|
	   | admin      | admin456|


    
