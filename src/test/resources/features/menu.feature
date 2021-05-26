Feature: test menu page

  Scenario: test user navigate to the menu
    Then the user opens the menu
    And the user select "about" in the menu
    Then user should be able to land in saucelabs page