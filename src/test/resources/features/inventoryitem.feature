Feature: test inventory item page

  Background:
    Given User is on the "https://www.saucedemo.com/" url
    And User logs in with "standard_user", "secret_sauce"
    Then User clicks login
    And user is on inventory page
@product
  Scenario:test the product page
  Given user selects  the product
  Then the user should be able to get the information about the item
    And the user should see the price of the item
    Then the user should be able to see the picture of the item
    And the user should be able to add to cart the item
    Then the user should be able to return back to the products