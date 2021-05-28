Feature: test menu page

  Background:
    Given User is on the "https://www.saucedemo.com/" url
    And User logs in with "standard_user", "secret_sauce"
    Then User clicks login
    And user is on inventory page
@menu
  Scenario: test user navigate to the menu
    Given the user opens the menu
    Then the user select "About" in the menu
    And user should be able to land in saucelabs page