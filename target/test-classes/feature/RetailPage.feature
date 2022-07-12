@CompleteTest
Feature: Retail Page

  Background: 
    Given User is on Retail website
    And User click on MyAccount
    When User click on Login
    And User enter username 't.test9@test.com' and password 'test9'
    And User click on Login button
    Then User should be logged in to MyAccount dashboard

  @Register
  Scenario: Register as an Affiliate user with Checque Payment Method
    When User click on'Register for an Affiliate Account' link
    And User fill affiliate form with below information
      | company    | WebSite           | taxID    | payment Method | Cheque Payee |
      | TekSchool6 | www.tekschool.com | 12438823 | Cheque         | Tek USer     |
    And User check on About us check box
    And User click on Continue button1
    Then User should see a success message1

  @EditAffiliateAccount
  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on 'Edit your affiliate information' link
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName | abaNumber | swiftCode | accountName | accountNumber |
      | T&TBank  | 123456789 |      4444 | checking    |    9876543210 |
    And User click on Continue button
    Then User should see a success message

  @EditAccountInfo
  Scenario: Edit your account Information
    When User click on Edit your account information link
    And User modify below information
      | firstName | lastName | email             | telephone   |
      | Dania     | John     | t.test88@test.com | 12345678915 |
    And User click on continue button
    Then User should see messages 'Success: Your account has been successfully updated'
