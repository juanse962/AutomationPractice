Feature: Automation shopping car

  @smoke
  Scenario: Purchase of items in the store
    Given the user wishes to create an account on the website
    When The user enters items in the shopping cart
    Then The user verifies that their items have been added
