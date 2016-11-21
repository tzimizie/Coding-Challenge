Feature: Challenging Dom

  Scenario: Verifying numbers on Dom
    When I open the Dom website
    Then I verify the table contains definiebas4
    And the number in the answer box is printed out
    And the text in the blue button is printed out
    Then I click the blue button
    And I print the text in the blue button
    Then I print the updated number in the answer box
    