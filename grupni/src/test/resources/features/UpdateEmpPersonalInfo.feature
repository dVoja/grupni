Feature: Employee Personal Information Update
@UpdateEmpInfo

  Scenario: Employee updates their personal information
  When employee enters employee username and password
    When the employee navigates to the personal information section and clicks on edit
    Then employee should be able to access and edit personal informatio
    And employee update personal information and save the changes