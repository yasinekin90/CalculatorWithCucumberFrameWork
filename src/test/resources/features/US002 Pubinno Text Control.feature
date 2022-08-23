@TestCalculator
Feature: US002 Verification of Pubinno Link
  Scenario: Verifying Pubinno Link
    Given User navigates to "calculator" page
    Then verify the content of pubinno link

    Scenario: Verify if pubinno link directs to HomePage
      Given User navigates to "calculator" page
    When clicks to pubinno link
    Then navigates to pubinno homepage