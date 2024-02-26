Feature: Memberships

  Scenario: add a membership
    Given the user is logged in as an admin
    When user clicks on Admin section
    And user clicks on Qualifications option
    When user clicks on Membership option
    And user clicks on add button
    When user enters a membership name
    And user clicks on the save button
    Then a membership is added successfully
    And the membership should be displayed in the list of memberships