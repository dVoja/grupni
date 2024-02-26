Feature: Employee Search
    Background:
      When user enters admin username and password
      And user clicks on login button
      Then user is successfully logged in
      When user clicks on PIM option
      And user clicks on Employee List option
  @searchEmployee
  Scenario: Search for an employee by full name
    When Admin search for an employee using their full name
    Then the search should return all matching employee records
  @searchEmployee
  Scenario: Search for an employee by partial name with variations in capitalization
    When Admin search for an employee using partial name with variations in capitalization
    Then the search should return all matching employee records
  @searchEmployee
  Scenario: Search for an employee by unique employee ID
    When Admin search for an employee using their unique employee ID
    Then the search should return the exact employee record associated with the provided employee ID
  @searchEmployee
  Scenario: Display "No Records Found" message when no matching employee records are found
    When Admin search for an employee with non-existent criteria
    Then the system should provide a message "No Records Found"