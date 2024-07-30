Feature: Add To Cart

  Background:
    Given User is logged in

  Scenario: Item added to cart
    Given User clicks on show all notebooks and laptops link
    And User clicks on a macbook
    And user clicks to Add To Cart button
    When User clicks on Shopping Cart button
    Then Product is added to cart


