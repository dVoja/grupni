Feature: Navigating to the membership section

  Background:
    When user enters employee username and password
    And clicks on login button
    Then user is successfully logged in
    When user clicks on My Info options
    Then user navigates to the Memberships section

  @membershipFields @employeeMembership
    Scenario: validating that fields are displayed and editable
      When user clicks on a membership name in assigned memberships
      And user selects Membership from the Membership dropdown
      And user selects Subscription Paid By from the Subscription Paid By dropdown
      And user enters Subscription Amount into the Subscription Amount field
      And user selects Currency from the Currency dropdown
      And user selects Subscription Commence Date from the Subscription Commence Date calendar
      And user selects Subscription Renewal Date from the Subscription Renewal Date calendar|
      Then user clicks on a save button

  @mandatoryMembershipFields @employeeMembership
      Scenario: validating that mandatory fields are filled in
        When employee enters Membership details
        And employee tries to save the membership details without filling in all mandatory fields
        Then system displays an error message indicating that mandatory fields are missing


  @deleteMembershipDetails @employeeMembership
  Scenario: delete Membership
    When user clicks on a checkbox next to the saved membership and user clicks on a delete button
    Then user successfully deleted the membership





