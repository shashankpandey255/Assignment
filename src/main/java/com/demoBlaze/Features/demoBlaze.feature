#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: demoBlaze

	@tag1
  Scenario: Navigation to DemoBlaze Website
		 Given Customer navigates to the demoblaze website
		 And Selects the Laptop Category
		 When Customer Clicks the Sony Vaio
		 Then Adds to the Cart and Accepts the Alert
		 And Clicks the Home
		 And Selects the Laptop Category
		 When Customer Clicks the Dell
		 Then Adds to the Cart and Accepts the Alert
		 When User Naviagtes to Cart and deletes the Dell Laptop
		Then User Places the Order and fills the form
		 When User clicks the Purchase button
		 Then Verify the Amount and capture the Purchase ID
		 
		 