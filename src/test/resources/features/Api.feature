Feature: API TEST SCENARIOS

  @API @Regression
  Scenario: Create, Update, Get and Delete Training

    Given user creates a new training record
    When user updates the training record
    And user fetches the training record
    Then user deletes the training record