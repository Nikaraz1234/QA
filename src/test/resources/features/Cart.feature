Feature: Add To Cart

  Background:
    Given User is logged in

  Scenario: item added to cart
    Given User clicks on show all notebooks and laptops link
    When User clicks on a macbook
    And user clicks to Add To Cart button
    Then Product is added to cart

