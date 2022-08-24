#  0-21 gives normal results
#  22-170 gives numbers that can not be understandable  (The factorial of 22 is: 1.1240007277776077e+21)
#  171-978 gives infinity as a result
# 979 and up gives no action (function is not working)
@DataLimits
Feature: US006 User test the data limits of the app
Scenario Outline: User tests the boundries of the datalimits
  Given User navigates to "calculator" page
  Then writes "<integer>" to placeholder
  Then clicks to calculate button
  And User verifies "<integer>" gives the correct results
  Examples:
    | integer |
    | 0 |
    | 21|
    | 22 |
    | 170 |
    | 171 |
    | 978 |
    | 979 |

