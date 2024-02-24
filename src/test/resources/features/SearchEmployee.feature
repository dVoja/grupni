Feature: Employee Search
    Background: user enters admin username and password
  @searchEmployee
  Scenario: Search for an employee by full name
    When Admin search for an employee using their full name "<full_name>"
    Then the search should return all matching employee records
  @searchEmployee
  Scenario: Search for an employee by partial name with variations in capitalization
    When Admin search for an employee using partial name "<partial_name>" with variations in capitalization
    Then the search should return all matching employee records
  @searchEmployee
  Scenario: Search for an employee by unique employee ID
    When Admin search for an employee using their unique employee ID "<employee_id>"
    Then the search should return the exact employee record associated with the provided employee ID
  @searchEmployee
  Scenario: Display "No Records Found" message when no matching employee records are found
    When Admin search for an employee with non-existent criteria
    Then the system should provide a message "No Records Found"