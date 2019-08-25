 Feature: Login to MCT
  
  As a user i want to change password on multicart website 
    
   Scenario: change the current password
    Given I open browser "chrome"
    And I browse to www.multicart.com
    And I login with my id password
    And I go to my account
    And I click the change password option
    And i insert old and new info and submit
    When I do a logOut
    And I log back in with my id and new password
    Then I See my profile as james-william
    
