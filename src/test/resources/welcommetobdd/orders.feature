@userstoryMCTWEB-35
Feature: Orders Status Check
  As a user i want to login on www.multicart.com site
  so i logged in with my user id and password
  I go to my Account and I see all the options are available on there
  I click on my order and see all the orders with status of the order
  I verify with order status

  Background: Open Browser and go to www.multicart.com
    Given I open browser "chrome"
    And I browse to www.multicart.com

  Scenario: My Account feature check
    And I login with my id password
    And I click on Profile Name and My Account
    Then I see all my account option
      | Options              |
      | My Orders            |
      | Profile              |
      | My Return Requests   |
      | Change Password      |
      | My Favorite Products |
      | My Favorite Sellers  |
      | Seller Dashboard     |

  Scenario: Order List check by Order Status
    And I login with my id password
    And I click on Profile Name and My Account
    Then I click on My Orders
    And I see all the orders list with order status
      | Order List |
      |         65 |
      |         54 |
      |         53 |
      |         45 |
      |         44 |
      |         43 |
      |         42 |
      |         41 |
      |         40 |
      |         39 |
    And I verify by STATUS as "Delivered"
