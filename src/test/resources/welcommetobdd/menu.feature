Feature: My Account Page
  
  As a user i want to access my account page of multicart website 
  so i can use all accounts beneift

  Scenario: User Sees All My Account Option
    Given I open browser "chrome"
    And I browse to www.multicart.com
    Then I see all my menu option
      | Options      |
      | ACCESSORIES  |
      | CLOTHING     |
      | COFEE MAKERS |
      | DIGITAL      |
      | MORE..       |
