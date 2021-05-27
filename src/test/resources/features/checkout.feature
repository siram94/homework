Feature: test checkout page

  Background:
    Given User is on the "https://www.saucedemo.com/" url
    And User logs in with "standard_user", "secret_sauce"
    Then User clicks login
    And user is on inventory page

   Then user navigate to the cart
   And user should be able to continue  shopping
   Then user should be able to checkout

  Scenario: test checkout page
  Given user insert "siram" "hadjaz" " 19145"
  And user should be able to cancel
  Then user should be able to continue
  @checkout
  Scenario: user should not be able to checkout without inserting credentials
    Given user click continue
    Then user should see a message error

