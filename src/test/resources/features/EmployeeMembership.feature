Feature: Navigating to the membership section

  Background:
    When user enters employee username and password
    And user clicks on a login button
    Then user is logged in
    When user clicks on My Info options
    And user clicks on Qualifications option
    Then user navigates to the Memberships section

  @membershipFields @employeeMembership
    Scenario: validating that fields are displayed and editable
      When user clicks on add membership option
      And user selects "<Membership>" from the Membership dropdown
      And user selects "<Subscription Paid By>" from the Subscription Paid By dropdown
      And user enters "<Subscription Amount>" into the Subscription Amount field
      And user selects "<Currency>" from the Currency dropdown
      And user selects "<Subscription Commence Date>" from the Subscription Commence Date calendar
      And user selects "<Subscription Renewal Date>" from the Subscription Renewal Date calendar|
      When user clicks on a save buuton
      Then user should be able to edit and save all mandatory fields

  @mandatoryMembershipFields @employeeMembership
      Scenario: validating that mandatory fields are filled in
        When employee enters Membership details
        And employee tries to save the membership details without filling in all mandatory dields
        Then system displays an error message indicating that mandatory fields are missing

  @editMembershipDetails @employeeMembership
  Scenario: edit Membership details
    When employee selects the previously saved language
    And user edits the Membership fields
    Then the updated Membership details should be saved on employee's profile

  @deleteMembershipDetails @employeeMembership
  Scenario: delete Membership
    When user navigates to the saved language proficiency details section
    And user clicks on a checkbox next to the saved membership
    And user clicks on a delete button
    Then user successfully deleted the membership





