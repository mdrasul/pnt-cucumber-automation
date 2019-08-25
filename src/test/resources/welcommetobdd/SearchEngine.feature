Feature: Search Engine Bar
  
  As a user I expect to perform a search and
  Validate at least one search result of 
  Multicart Website

  Scenario: Validate One Search Result
    Given I open browser "chrome"
    And I browse to www.multicart.com
    When I click search and enter "BLACK KAJAL"
    Then I should see "BLACK KAJAL" in search for
    And I should see "BLACK KAJAL" option
