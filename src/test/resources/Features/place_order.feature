Feature: Place Order

  @UItest
  Scenario: Place order to Poplin Laundry Web App

    Given user logs in to Poplin
    And user is on Poplin home page
    When user starts new order
    And user places new order
    And user reviews the order
    And user confirms the order
    And user pays the order
    Then error message should be displayed


