Feature: test swag labs pages


  Scenario Outline: User should be abel to login with valid credentials
    Given User is on the "https://www.saucedemo.com/" url
    And User logs in with "<username>", "<password>"
    Then User clicks login
    And user is on inventory page
    Examples:
      | username | password |
      |standard_user|secret_sauce|
      |problem_user |secret_sauce|
      |performance_glitch_user|secret_sauce|

  Scenario: User should not be abel to login with invalid credentials
    Given User is on the "https://www.saucedemo.com/" url
    And User logs in with invalid "locked_out_user", "secret_sauce"
    Then user clicks login
    And User should see a message error
