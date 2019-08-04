Feature: Login Feature
  
  As a user of abc.com i can login 
  So i can use the benefit of the site

  Background: Open browser and go to application
    Given I open browser chrome
    And I browse to www.multicart.com

  Scenario: Successfull Login as admin
    When I login with my id password