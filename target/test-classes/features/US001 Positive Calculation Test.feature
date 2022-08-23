@TestCalculator
Feature:US001 positive calculator test
  Scenario: TC01 User tests factorial of 8 is 40320
    Given User navigates to "calculator" page
    Then writes "8" to placeholder
    Then clicks to calculate button
    And verify the result of calculation