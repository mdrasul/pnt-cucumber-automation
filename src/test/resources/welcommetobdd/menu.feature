Feature: My Menu
  
  As a user i want to view my menu in multicart website 
  

  Scenario: User Sees All My Menu Option
    Given I open browser "chrome"
    And I browse to www.multicart.com
    Then I see all my menu option
      | Options      |
      | ACCESSORIES  |
      | CLOTHING     |
      | COFEE MAKERS |
      | DIGITAL      |
      | MORE..       |
