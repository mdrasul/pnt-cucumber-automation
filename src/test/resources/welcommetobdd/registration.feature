Feature: registration and change address
    
    
    Scenario: registration My name
    
     Given I open browser "chrome"
     And I browse to www.multicart.com
     And I click on the login button
     Then I click on the sign up button
     And I complete the registration
     Then I click the Create Account button