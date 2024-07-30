Feature: Checkout
  Background:
    Given User is logged in
    And item is added to cart

  Scenario:User is not able to Checkout
    When User clicks on checkout
    Then Alert message appears