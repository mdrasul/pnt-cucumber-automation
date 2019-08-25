Feature:

As a user of Multicart.com/demo 
I want to see if the orders feature can search by ID


 Background: 
Given I open browser "chrome"
#Then I browse to "https://www.demo.iscripts.com/multicart/demo/" 
And I browse to www.multicart.com

Scenario: Order Search By ID
And I login with my id password
And I click My Account and My Orders
When I select Order ID put "41" and click Go in Search option
Then I verify if orders feature can search by ID"41"
And I go to My Account

