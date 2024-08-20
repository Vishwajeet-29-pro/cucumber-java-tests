Feature: To-DO List Management

  Scenario: Adding multiple tasks
    Given I have an empty to-do list
    When I add the following tasks to the list:
      | Task Name       | Priority |
      | Buy groceries   | High     |
      | Finish homework | Medium   |
      | Clean the house | Low      |
    Then the to-do list should contain 3 tasks
    And the highest priority task should be "Buy groceries"
