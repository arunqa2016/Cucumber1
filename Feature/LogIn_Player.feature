Feature: Login Action

  Scenario: To verify the user Login with Valid Credentials
    Given User is on Login Page
    And User enters <username> and <password>
    Then User Login Successfully
    
    | Username | inf001 |
    | password | inf001 |

