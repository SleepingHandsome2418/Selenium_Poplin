Feature: Login

  @UItest
  Scenario: Login to Poplin Laundry Web App using valid credentials

    Given user opens Poplin site on browser
    When user logs in to Poplin using valid credentials
    Then verify that user should be redirected to homepage



