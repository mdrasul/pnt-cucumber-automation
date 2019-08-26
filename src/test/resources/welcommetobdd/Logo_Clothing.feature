Feature: Multicart Logo and Clothing Page
  
  ##As a user I want access the multicart website 
  ##and perform the below scenarios

    Scenario: Open Multicart
    Given Open Chrome and Start Application
    Then Check Multicart Logo
    
    Scenario: Clothing Page
    Given Open Chrome and Start Application
    Then Click on Clothing Tab
    And See Item Peters Casual
    And See Item Levt Cloth
    
