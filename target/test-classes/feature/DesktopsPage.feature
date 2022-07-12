@completTest1
Feature: Desktops Tab

  Background: 
    Given User is on Retail website
    When User click on Desktops tab
    And User click on Show all desktops
@verifyAllItems
  Scenario: User verify all items are present in destops tap
    Then User should see all items are present in Desktop page
@AddHPLP3065
  Scenario: User add HP LP 3065 from Desktops tab to the cart
    When User click ADD TO CART option HP LP3065 item
    When User select quantity '1'
    And User click add to Cart button
    Then User should see a message 'Success: You have added Canon EOS 5D to your shopping cart!'
@addcanon
  Scenario: User add Canon EOS 5D From Desktops tab to the cart
    And User click ADD TO CART option on Canon EOS 5Ditem
    And User select color from dropdown Red
    And User select quantity '1'
    And User click add to Cart button
    Then User should see a message like 'Success: You have added Canon EOS 5D to your shopping cart!'
@canontest
  Scenario: User add a review to Canon EOS 5D item in Desktops tab
    And User click on Canon EOS 5D item
    And User click on write a review link
    And User fill the review information with below information
    | yourname    | reviewtext                                     | Rating |
     | test | good item to but i like it | good   |
    And User click on Continue Button
    Then User should see a message with 'Thank you for your review. It has been submitted'
