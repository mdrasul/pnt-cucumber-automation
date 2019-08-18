Feature: Login to MCT
  
  As a user i want to login on multicart website 
  so i can use all logged in beneift

  Scenario: Login As James William
    Given I open browser "chrome"
    And I browse to www.multicart.com
    And I login with my id password
    Then I See my profile as james-william

  Scenario: Log Out As James William
    Given I open browser "chrome"
    And I browse to www.multicart.com
    And I login with my id password
    When I do a logOut
    Then I not See my profile as james-william
