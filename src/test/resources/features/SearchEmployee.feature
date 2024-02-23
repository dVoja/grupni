Feature: Search an employee in HRMS system

  Background:
    When user enters admin username and password
    And user clicks on login button
    Then user is successfully logged in
    When user clicks on PIM option
    And user clicks on employee list option
@searchEmployee
  Scenario: search for employee record by full name
    When user enters employee's first and or last name
    And user clicks on the search button
    Then user should see all matching employee records
    And the search result should handle partial name matches and variations in capitalization
@searchEmployee
  Scenario: search for employee record by unique employee id
    When user enters a unique employee id
    And user clicks on the search button
    Then user should see the employee record

@searchEmployee
  Scenario: no matching employee records found
    When user enters incomplete or incorrect employee information
    And clicks on the search button
    Then user should see a "No records found" message
    And no employee record should be displayed