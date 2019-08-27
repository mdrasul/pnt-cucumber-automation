Feature: Anarkali Dress and Black Kajal Shop Now
  
As a User I want to login to https://www.demo.iscripts.com/multicart/demo/index.php
So I can Shop for Anarkali Dress and Black Kajal

  Scenario: Anarkali Dress Shop Now
    Given I go to” https://www.demo.iscripts.com/multicart/demo/index.php” 
    And I check the Shop Now Button is visible and clickable
    And  I see Women Maroon Printed Anarkali Dress 
    Then I Shop Now Anarkali Dress

  Scenario: Black Kajal Shop Now
    Given I go to” https://www.demo.iscripts.com/multicart/demo/index.php” 
    And I check the Shop Now Button is visible and clickable
    And  I see Black Kajal
    When I click on Black Kajal
    Then I Shop Now Black Kajal
