@Usability
Feature: US005 Evaluation of the application with the usability aspects
  Scenario: User clicks to Enter from the Keyboard
    Given User navigates to "calculator" page
    When writes "4" to placeholder
    Then clicks to Enter from the Keyboard

    Scenario: User clicks to RightArrow
      Given User navigates to "calculator" page
      When writes "4" to placeholder
      Then clicks to rightArrow button
      And User should see the result

      Scenario: User reads the context of placeholder
        Given  User navigates to "calculator" page
        Then user should understand the context of placeholder clearly