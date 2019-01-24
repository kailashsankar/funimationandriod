#Author: Shaik Nazeer

Feature: Verify the functionality of Funimation Application
  
  
  @funimation
  Scenario: Verify the User able to login Funimation Application with valid credentials
    Given I launch the "Funimation App"
    And I should see "Login" button
    Then I should click "Login" button"
    And I should enter "Username"
    And I should enter "Password"
    And I click on "Login" button on "Login screen"
    And I click on "Menu" button on "Dashboard"
    And I click on "settings" link on Menu list
    And I should verify "Your Mail" as "uatfuni+1548242372367@gmail.com"
    And I click on "Menu" button on "Dashboard"
    Then I click on "Home" button on "Dashboard"
    And I should "Add" a show 
    And I should logout the "Funimation App"
    
    
    
    
    
    
    
    
    
    
    

  