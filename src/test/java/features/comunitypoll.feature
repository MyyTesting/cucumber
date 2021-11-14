Feature: Only registered Users can vote under Community Poll on Nopcommerce website
  Inorder to vote on Community Poll user should be registered.

  Scenario: Only registered Users can vote under Community Poll.Verify error message when user votes on Community Poll without Registering
    Given Url is loaded "https://demo.nopcommerce.com/"
    Then User should be able to see Homepage
    When User selects any radio button under Community Poll
    And User clicks on Vote button
    Then Error message should appear
    Then Print the error message to console



  Scenario: Error message should appear if mandatory feilds are not provided.
    when registering as a user on Nopccommerce from Register page . When user clicks on RegisterButton without providing mandatoryfeilds.Error messages are dispalyed .

    Given Url is loaded "https://demo.nopcommerce.com/"
    Then User should be able to see Homepage
    When User clicks on Register link
  Then User should be able to see Registerpage
    When User clicks on Register button
    Then Error message should appear for Firstname
    And Error message should appear for Lastname
    And  Error message should appear for Email
    And  Error message should appear for Password
    And  Error message should appear to ConfirmPassword
    Then Print the Firstname error message to console
    And  Print the lastname error message to console
    And  Print the Email error message to console
    And  Print the Password error message to console
    And  Print the ConfirmPassword error message to console

