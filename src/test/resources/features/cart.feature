Feature: test cart

  Background:
    Given User is on the "https://www.saucedemo.com/" url
    And User logs in with "standard_user", "secret_sauce"
    Then User clicks login
    And user is on inventory page
@cart
  Scenario:  user is in the cart page
  Given user navigate to the cart
    And user should be able to continue  shopping
  Then user should be able to checkout

