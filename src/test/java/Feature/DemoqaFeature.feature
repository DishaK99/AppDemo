@login
Feature: validate Registration Form Functionality for Demoqa application

Background:
Given user is on the registration page of demoqa

@validData
Scenario: check the registration functionality for valid data
When user enters all the valid data
|Disha|
|Kale|
|disha@gmail.com|
|1234567890|
|Mumbai|
And user clicks enter button
Then Registration should be successful

@invalidData
Scenario: check the registration functionality for invalid data
When user enters all the invalid data
|123|
|ka12|
|abc|
And user clicks enter button
Then Error message should be displayed
