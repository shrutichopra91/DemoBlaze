@tag
Feature: I want to do Dropdown Automation Testing
  I want to use this template for my feature file

  @sample1
  Scenario: This is a static Dropdown
    Given I launch easy travel URL
    When I click on Traveller and Class
    Then I should be able to add four adults
    
  @sample2
  Scenario: This is a dynamic Dropdown
    Given I launch easy travel URL
    When I select from dropdown
    Then I should be able to add from city and to city
  

##  @tag2
##  Scenario Outline: Title of your scenario outline
##    Given I want to write a step with <name>
##    When I check for the <value> in step
##    Then I verify the <status> in step

##    Examples: 
##      | name  | value | status  |
##      | name1 |     5 | success |
##      | name2 |     7 | Fail    |
