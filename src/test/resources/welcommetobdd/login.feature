Feature: Login Feature
  
  As a user of abc.com i can login 
  So i can use the benefit of the site

  Scenario: Successfull Login in chrome
    Given I open browser "chrome"
    And I browse to www.multicart.com

  Scenario: Successfull Login in Firefox
    Given I open browser "firefox"
    And I browse to www.multicart.com

  Scenario: Successfull Login in internet explorer
    Given I open browser "internet explorer"
    And I browse to www.multicart.com
