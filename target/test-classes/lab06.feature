Feature: Payment Gate functional test

  @Smoke
  Scenario: Verify that user can buy a product

    Given The user wants to go to Payment Gateway Website
    When The user wants to verify that to see "Mother Elephant With Babies Soft Toy"
    Then The user wants to verify that the "Price: $20"
    Then The user wants to verify that the URL should contain "payment-gateway"
    Then The user wants to buy elephant toys as "5"
    And The user wants to enter payment information as
      |CardNumber     |1112223334445556|
      |ExpirationMonth|10              |
      |ExpirationYear |2025            |
      |CVVCode        |145             |
    Then The user wants to click on pay now
    And The user wants to verify message as "Payment successfull!"
 # The quantity must be 5,8,9,2,4
 # You may need to fake enter card information (Card number will be 16 digit)
 # Once you order, you should be able to verify "Payment successfull!" text.
  @Smoke
  Scenario Outline:
    Given The user wants to go to Payment Gateway Website
    When The user wants to verify that to see "Mother Elephant With Babies Soft Toy"
    Then The user wants to verify that the "Price: $20"
    Then The user wants to verify that the URL should contain "payment-gateway"
    #Then The user wants to buy elephant toys as "5"
    And The user wants to add new "<Quantity>"
    And The user wants to enter payment information as
      |CardNumber     |5823698521478522|
      |ExpirationMonth|05              |
      |ExpirationYear |2028            |
      |CVVCode        |256             |
    Then The user wants to click on pay now
    And The user wants to verify message as "Payment successfull!"

    Examples:
      |Quantity|
      |5       |
      |8       |
      |9       |
      |2       |
      |4       |






