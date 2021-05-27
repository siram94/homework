Feature: test inventory page

  Background:
    Given User is on the "https://www.saucedemo.com/" url
    And User logs in with "standard_user", "secret_sauce"
    Then User clicks login
    And user is on inventory page

@inventory
  Scenario: test inventory page
    Given user should be able to add to cart
    Then user should be able to select a product
    And user should be able to select the products by name or price
    Then user should be able to navigate to the menu
