Feature: Add to cart functionality

@AddToCart
  Scenario: Add a computer kit complete
    Given That I am On The Landing Page
    And I click Shop
    When I click one of the availble computer kits
    And I click Buy Now.
    Then The computer kit should be added to cart
