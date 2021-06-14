Feature: Login and Order Creation in PetCo
Scenario: Verify if user can successfully login to PetCo
    Given User launches browser
    And User navigates to "https://int1-www.petco.com/shop/en/petcostore"
    When User logsin using "madhava.alla@petco.com" and "Austin@123"
    Then User must be logged in to PetCo
