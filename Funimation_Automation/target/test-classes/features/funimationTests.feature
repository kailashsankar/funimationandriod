#Author: Shaik Nazeer
Feature: Verify the failure scenario in funimation App

@funimation1
  Scenario: Verify the User able to login Funimation Application with valid credentials
    Given I launch the "Funimation App"
    And I should see "Login" button
    Then I should click "Login" button"
    And I should enter "Username"
    And I should enter "Password"
    And I click on "Login" button on "Login screen"
    And I click on "Menu" button on "Dashboard"
    And I click on "settings" link on Menu list
    And I should verify "Your Mail" as "testfailure@gmail.com"
    
