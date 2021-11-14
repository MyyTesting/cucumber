Feature: Adding Virtual giftcard and Physical gift cards to card.
  Filling all details required for each product to add to the cart . Error message should appear if mandatory fields are not filled.
  Changing the currency to Euro before buying gift card.

  Background:
    Given Url is loaded "https://demo.nopcommerce.com/"
    Then User should be able to see Homepage
    When User clicks on GiftCard link
    Then User should be able to see Giftcards page
    And User changes Currency to Euro

  Scenario: Verify Adding Virtual Giftcard with valid data

    When User clicks on 25Virtual Giftcard
    Then User should be navigated to 25Virtual Giftcard page
    When User enters RecipientName RecipientsEmail SenderName SenderEmail Message
    |RecipientName|RecipientsEmail|SenderName|SenderEmail|Message|
    |   Superman          |         Superman@email.com      |  Spiderman        |  Spiderman@email.com         | Happy Birthday|

    When User clicks on Addtocart button
    Then User should be able to see message "The product has been added to your shopping cart"

  Scenario: Verify Adding Physical Giftcard with valid data

    When User clicks on FifttyPhysical GiftCard
    Then User should be navigated to 50Virtual Giftcard page
    When User enters RecipientName SenderName Message
    |RecipientName|SenderName|Message|
    |Superman| SuperWomen| HappyBirthday|
    When User clicks on fiftyAddtocart button
    Then User should be able to see message "The product has been added to your shopping cart"

  Scenario Outline: Email friends to share a gift card details and filling required information

    When User clicks on FifttyPhysical GiftCard
    Then User should be navigated to 50Virtual Giftcard page
    When User clicks on Email friend button
    When User enters Femail "<FriendsEmail>"
    And User enters email "<YourEmail>"
    And User enters Pmessage "<personalMessage>"
    When User clicks on SendEmail button


    Examples:
      |FriendsEmail| YourEmail|personalMessage|
      |   Superman@email.com          |   Spiderman@email.com       | Look at this deal      |
      |     SuperWomen@email.com        |  Spiderman@email.com        |  Look at this deal      |





