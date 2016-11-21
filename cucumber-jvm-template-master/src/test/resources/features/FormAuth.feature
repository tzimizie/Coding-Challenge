Feature: Form Auth

  Scenario: Verify error message apprears after invalid login
    When I open the login page
    And I enter an invalid user 
    And I enter an invalid password
    And I click the login button
    Then I should see the error message