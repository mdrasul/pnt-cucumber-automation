Feature: Login to Footerfeatrue
  
  As a user i want to login on multicart website 
  so i can see the Get to know us fqa and help fearture

  Scenario: Login As James William
    Given I open browser "chrome"
    And I browse to www.multicart.com
    Then I validate footer title
    And I validate sub catogories
         