Feature: Login and Order Creation in PetCo
Scenario: Verify if user can successfully login to PetCo
    Given User launches browser
    And User navigates to "https://int1-www.petco.com/shop/en/petcostore"
    When User logsin using "madhava.alla@petco.com" and "Austin@123"
    Then User must be logged in to PetCo

    

Scenario Outline: Verify order creation
    Given User navigates to a "<Product Page>"
    And Clicks on Add to cart
    And Clicks on proceed to checkout
    And Clicks on Save and Continue for Shipping option
    And Selects Prescription Type "<I will mail the prescription myself>"
    And Selects PetInfo "<Pet Info>"
    And Selects VetInfo "<Vet Info>"
    And Clicks on Save and Continue for Pet Vet info
    And Clicks on Save and Continue for Repeat Delivery
    And Clicks on Save and Continue for Payment info
    When User clicks on Place Order
    Then Order must be created successfully
    
    Examples:
      | Prescription Type | Pet Info | Vet Info | Product Page                                                                                                            |
      | Non Mail          | CoCo     | Mesa     | ProductURL |