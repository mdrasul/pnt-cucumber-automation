@userstoryMCTWEB-33
Feature: Order Search by Date
  As a user i want to login on www.multicart.com site
  so i logged in with my user id and password
  I go to my Account and i see all the options are available on there
  I click on my order and see all the orders with status of the order
  I verify with order date

  Background: Open Browser and go to www.multicart.com
    Given I open browser "chrome"
    And I browse to www.multicart.com

  Scenario: Login As James William
    And I login with my id password
    Then I See my profile as james-william

  Scenario: My Account feature check
    And I login with my id password
    And I click on profile name along with My Account
    Then I see all my account option
      | Options              |
      | My Orders            |
      | Profile              |
      | My Return Requests   |
      | Change Password      |
      | My Favorite Products |
      | My Favorite Sellers  |
      | Seller Dashboard     |

  Scenario: Orders search by Date
    And I login with my id password
    And I click on profile name along with My Account
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
    And I click on search order list and select order Date
    And I select Date "12/29/2017"
    Then I click Go
    And I see all the Orders based on Date
      | Order List Based on Date|
      |         54 |
     	|         53 |
    And I varify DATE ADDED as "12/29/2017"
