Feature: Memberships

  @addMembership
  Scenario: add a membership
    When user enters admin username and password
    And clicks on login button
    Then user is successfully logged in
    When user navigates to Admin option
    And user clicks on Qualifications option
    When user clicks on Membership option
    And user clicks on add button
    When user enters a membership name
    And user clicks on the save button
    Then a membership is added successfully
