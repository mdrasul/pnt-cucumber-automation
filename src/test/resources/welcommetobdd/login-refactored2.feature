Feature: Login Feature
  
  As a user of abc.com i can login 
  So i can use the benefit of the site

  Background: Open browser and go to application
    Given I open browser chrome
    And I browse to www.multicart.com

  Scenario: Successfull Login as admin
    When I login with my id as "MRA" password as "pass"
    Then I See my profile as "MRJames"
    Then I see user age is 36
    
    
   Scenario: Successfull Login as user
    When I login with my id as "MRB" password as "passX"
    Then I See my profile as "james-william X"   
    Then I see user age is 40
    
    
   Scenario: Successfull Login as user
    When I login with my id as "MRc" password as "passC"
    Then I See my profile as "james-william C"   
    Then I see user age is 100
    