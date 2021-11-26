Feature: Validate OrangeHRM

Scenario: Validate Login with valid Credential
Given user is on Login Page
When User enters correct username

And User enters correct password

Then User should be logged in successfully