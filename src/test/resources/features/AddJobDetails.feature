Feature: Admin User - Employee Current Job Details
 Background:
    Given user enters admin username and password
    When the Admin user accesses the employee's profile
    And navigates to the current job details section

 @empjobdet
  Scenario: Displayed Fields
    Then the following fields should be displayed and editable

@empjobdet1
  Scenario: Saving Current Job Details
    Given the Admin user has filled in the mandatory current job details:
      | jobTitle         | employmentStatus | jobCategory | joinedDate | subUnit | location | startDate | endDate   |
      | Software Engineer | Full-time          | IT           | 2024-02-24   | Development | Office 1  | 2024-02-24 | 2025-02-24 |
    When the Admin user saves the current job details
    Then the system should store the current job details in the employee's profile
@empjobdet2
  Scenario: Validation of Mandatory Fields
    Given the mandatory fields are not filled in:
    When the Admin user tries to save the current job details
    Then system should display error message and not store job details
