Feature: My Account Page
  
  As a user i want to access my account page of multicart website 
  so i can use all accounts beneift

  Scenario: User Sees All My Account Option
    Given I open browser "chrome"
    And I browse to www.multicart.com
    And I login with my id password
    When I go to my account
    Then I see all my account option
      | Options              |
      | My Orders            |
      | Profile              |
      | My Return Requests   |
      | Change Password      |
      | My Favorite Products |
      | My Favorite Sellers  |
      | Seller Dashboard     |
