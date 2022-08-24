@Privacy
Feature: US004 User Verifies Privacy
  Scenario: User verifies whether the privacy link directs to expected page
    Given User navigates to "calculator" page
    When clicks privacy link
    Then user verifies if the direction is correct