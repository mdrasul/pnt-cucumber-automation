Feature: We want to test multicart website
  
  User should be able to use the website properly

  Background: Open browser and go to website
    Given I open "Chrome" and go to "https://www.demo.iscripts.com/multicart/demo/index.php"

  Scenario: Test login
    When I start login with "user" and "pass" 
    Then I should see LOGIN
