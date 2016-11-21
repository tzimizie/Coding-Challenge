Feature: CheckboxesTest

  Scenario: Verify Checkboxes checked
    When I open the checkboxes website
    And I verify checkbox 2 is checked
    And I click checkbox 1
    Then I verify checkbox 1 is checked
    And I click checkbox 2
    Then I verify checkbox 2 is unchecked