@Terms
Feature: US003 User Verifies Terms and Conditions
  Scenario: User verify whether the link directs to expected page
    Given User navigates to "calculator" page
    When clicks on terms and conditions link
    Then verifies if the direction is correct
