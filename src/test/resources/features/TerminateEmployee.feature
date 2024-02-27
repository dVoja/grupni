Feature: Terminate Employee

  @terminate
    Scenario: Terminating employee
    When user enters admin username and password
    When user accesses the list of employees in the system
    And selects a specified employee from the list
    And navigates to the employee's job page
    And selects the option to terminate the employment of the specified employee
    Then specified employee is terminated
