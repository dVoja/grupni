Feature: Navigating to the membership section

  Background:
    When user enters employee username and password
    And clicks on login button
    Then user is successfully logged in
    When user clicks on My Info options
    Then user navigates to the Memberships section

  @membershipFields @employeeMembership @membershipedit
    Scenario: validating that fields are displayed and editable
      Given user can check if membership options are clickable
      And system validates are mandatory fields filled before saving
      And user should be able to edit membership options.

  @mandatoryMembershipFields @employeeMembership
      Scenario: validating that mandatory fields are filled in
        When employee enters Membership details
        And employee tries to save the membership details without filling in all mandatory fields
        Then system displays an error message indicating that mandatory fields are missing


  @deleteMembershipDetails @employeeMembership
  Scenario: delete Membership
    When user clicks on a checkbox next to the saved membership and user clicks on a delete button
    Then user successfully deleted the membership





