Feature: go to multicart.com and buy some Candy
  
  As a user of multicart website 
  i like to click on CANDY from menu and checkout

  Scenario:
    Given I open browser "chrome"
    And I browse to www.multicart.com
    And i click CANDY from menu selection
    When i click Buy Now
    And i click checkbox
    Then i click Checkout
  